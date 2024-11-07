package algorithms.warmup.aVeryBigSum;

import java.util.*;

public class Solution {

    /*
        Sample Input
        5
        1000000001 1000000002 1000000003 1000000004 1000000005

        Sample Output
        5000000015
    */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (Long each:ar) {
            sum += each;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = input.nextInt();
        List<Long> ar = new ArrayList<>();
        for (int i=0;i<n;i++) {
            System.out.printf("Enter %s long num: ",i+1);
            ar.add(input.nextLong());
        }
        System.out.println(Solution.aVeryBigSum(ar));
    }
}

