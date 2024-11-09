package algorithms.implementation.breakingTheRecords;

import java.util.*;

public class Solution {

    /*
        Sample Input
        10
        3 4 21 36 10 28 35 5 24 42

        Sample Output
        4 0
    */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int max = scores.get(0);
        int min = scores.get(0);
        int maxCount = 0;
        int minCount = 0;
        List<Integer> result = new ArrayList<>();
        for (Integer each:scores) {
            if (each>max) {
                maxCount++;
                max = each;
            } else if (each<min) {
                minCount++;
                min = each;
            }
        }
        result.add(maxCount);
        result.add(minCount);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array lengths: ");
        int n = input.nextInt();
        List<Integer> scores = new ArrayList<>();
        for (int i=0;i<n;i++) {
            scores.add(input.nextInt());
        }
        System.out.println(Solution.breakingRecords(scores));
    }
}

