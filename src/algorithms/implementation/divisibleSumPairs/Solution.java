package algorithms.implementation.divisibleSumPairs;

import java.util.*;

public class Solution {

    /*
        Sample Input
        n = 6, k = 3
        ar = 1, 3, 2, 6, 1, 2

        Sample Output
        5
    */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int divCount = 0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<i;j++) {
                if ((ar.get(i)+ar.get(j))%k==0) {
                    divCount++;
                }
            }
        }
        return divCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length(n): ");
        int n = input.nextInt();
        System.out.print("Enter divisible sum of two elements(k): ");
        int k = input.nextInt();
        List<Integer> ar = new ArrayList<>();
        for (int i=0;i<n;i++) {
            System.out.printf("Enter array num %s: ",i+1);
            ar.add(input.nextInt());
        }
        System.out.println(Solution.divisibleSumPairs(n, k, ar));
    }
}

