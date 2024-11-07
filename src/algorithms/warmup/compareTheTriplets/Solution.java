package algorithms.warmup.compareTheTriplets;

import java.util.*;

public class Solution {

    /*
        Sample Input
        17 28 30
        99 16 8

        Sample Output
        2 1
    */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> resultArr = new ArrayList<>();
        int aliceScore = 0;
        int bobScore = 0;
        for (int i=0;i<3;i++) {
            if (a.get(i)>b.get(i)) {
                aliceScore++;
                continue;
            }
            if(a.get(i)<b.get(i)) {
                bobScore++;
            }
        }
        resultArr.add(aliceScore);
        resultArr.add(bobScore);
        return resultArr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> aliceArr = new ArrayList<>();
        List<Integer> bobArr = new ArrayList<>();
        for (int i=0;i<3;i++) {
            System.out.printf("Enter Alice %s. num: ", i+1);
            aliceArr.add(input.nextInt());
        }
        for (int i=0;i<3;i++) {
            System.out.printf("Enter Bob %s. num: ", i+1);
            bobArr.add(input.nextInt());
        }
        System.out.println(Solution.compareTriplets(aliceArr, bobArr));
    }
}

