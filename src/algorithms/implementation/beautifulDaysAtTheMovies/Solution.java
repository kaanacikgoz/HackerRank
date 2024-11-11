package algorithms.implementation.beautifulDaysAtTheMovies;

import java.io.*;

public class Solution {

    /*
        Sample Input
        20 23 6

        Sample Output
        2
    */

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int result = 0;
        for (;j-i>=0;i++) {
            int temp = i;
            int reversed = 0;
            while (temp!=0) {
                int digit = temp % 10;
                reversed = reversed*10+digit;
                temp /= 10;
            }
            if (Math.abs(i-reversed)%k==0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Solution.beautifulDays(i, j, k);
        System.out.println(result);

        bufferedReader.close();
    }
}

