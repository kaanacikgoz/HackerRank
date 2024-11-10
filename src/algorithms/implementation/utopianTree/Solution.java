package algorithms.implementation.utopianTree;

import java.io.*;
import java.util.stream.*;

public class Solution {

    /*
        Sample Input
        3
        0
        1
        4

        Sample Output
        1
        2
        7
    */

    public static int utopianTree(int n) {
        // Write your code here
        int result = 1;
        for (int i=0;i<n;i++) {
            if (i%2!=0) {
                result += 1;
            } else {
                result *= 2;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Solution.utopianTree(n);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

