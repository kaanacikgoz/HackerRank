package algorithms.dynamicProgramming.fibonacciModified;

import java.io.*;
import java.math.*;

public class Solution {

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        // Write your code here
        BigInteger bigInt1 = new BigInteger(String.valueOf(t1));
        BigInteger bigInt2 = new BigInteger(String.valueOf(t2));
        BigInteger t3 = new BigInteger("0");
        for (int i=0;i<n-2;i++) {
            t3 = bigInt1.add(bigInt2.pow(2));
            bigInt1 = bigInt2;
            bigInt2 = t3;
        }
        return t3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int t1 = Integer.parseInt(firstMultipleInput[0]);

        int t2 = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        BigInteger result = Solution.fibonacciModified(t1, t2, n);
        System.out.println(result);

        bufferedReader.close();
    }
}

