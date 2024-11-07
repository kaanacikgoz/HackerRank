package algorithms.warmup.simpleArraySum;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        Sample Input
        6
        1 2 3 4 10 11

        Sample Output
        31
    */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (Integer each:ar) {
            sum += each;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = input.nextInt();
        List<Integer> ar = new ArrayList<>();
        for (int i=0;i<n;i++) {
            System.out.printf("Enter %s. num: ", i+1);
            int each = input.nextInt();
            ar.add(each);
        }
        int result = Solution.simpleArraySum(ar);
        System.out.println(result);
    }
}

