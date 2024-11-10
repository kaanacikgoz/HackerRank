package algorithms.implementation.findDigits;

import java.io.*;
import java.util.stream.*;

public class Solution {

    /*
        Sample Input
        2
        12
        1012

        Sample Output
        2
        3
    */

    public static int findDigits(int n) {
        // Write your code here
        int temp=n;
        int count=0;
        while (temp!=0) {
            int digit = temp%10;
            if (digit!=0 && n%digit==0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Solution.findDigits(n);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

