package algorithms.implementation.extraLongFactorials;

import java.io.*;
import java.math.*;

class Solution {

    /*
        Sample Input
        25

        Sample Output
        15511210043330985984000000
    */

    public static void extraLongFactorials(int n) {
        // Write your code here
        BigInteger result=BigInteger.ONE;
        for (int i=1;i<=n;i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Solution.extraLongFactorials(n);

        bufferedReader.close();
    }
}