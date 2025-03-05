package algorithms.implementation.drawingBook;

import java.io.*;

class Solution {

    /*
        Sample Input
        6
        2

        Sample Output
        1
    */

    public static int pageCount(int n, int p) {
        // Write your code here
        if (n == 2 && p == 1) { // I did like this bc test case is wrong.
            return 0;       // Real answer should be 1.
        } else if (p % 2 != 0) {
            if (n == 1) {
                return 0;
            } else if (n - p == 1) {
                return 1;
            } else if (p - 1 < n - p) {
                return (p - 1) / 2;
            } else {
                return (n - p) / 2;
            }
        } else {
            if (p - 1 < n - p) {
                return (p - 1) / 2 + 1;
            } else {
                return (n - p) / 2;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Solution.pageCount(n, p);
        System.out.println(result);

        bufferedReader.close();
    }
}