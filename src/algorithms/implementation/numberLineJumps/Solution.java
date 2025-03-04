package algorithms.implementation.numberLineJumps;

import java.io.*;

public class Solution {

    /*
        Sample Input
        0 3 4 2
        0 2 5 3

        Sample Output
        YES
        NO
    */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (v1>v2 && (x2-x1)%(v1-v2)==0) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Solution.kangaroo(x1, v1, x2, v2);
        System.out.println(result);

        bufferedReader.close();
    }
}