package algorithms.strings.theLoveLetterMystery;

import java.io.*;
import java.util.stream.*;

public class Solution {

    /*
        Sample Input
        4       q = 4
        abc     query 1 = 'abc'
        abcba
        abcd
        cba

        Sample Output
        2
        0
        4
        2
    */

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int sum=0;
        int n = s.length();
        for (int i=0;i<n/2;i++) {
            sum += Math.abs(s.charAt(i)-s.charAt(n-i-1));
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Solution.theLoveLetterMystery(s);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

