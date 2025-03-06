package algorithms.implementation.sherlockAndSquares;

import java.io.*;
import java.util.stream.*;

class Solution {

    /*
        Sample Input
        2
        3 9
        17 24

        Sample Output
        2
        0
    */

    public static int squares(int a, int b) {
        // Write your code here
        int count=0;
        for (int i=1;i*i<=b;i++) {
            if (i*i>=a && i*i<=b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int a = Integer.parseInt(firstMultipleInput[0]);

                int b = Integer.parseInt(firstMultipleInput[1]);

                int result = Solution.squares(a, b);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}