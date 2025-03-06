package algorithms.implementation.libraryFine;

import java.io.*;

class Solution {

    /*
        Sample Input
        9 6 2015
        6 6 2015

        Sample Output
        45
    */

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int result=0;
        final int DAY_FINE=15;
        final int MONTH_FINE=500;
        final int YEAR_FINE=10000;

        if (y1!=y2) {
            result = (y1-y2)*YEAR_FINE;
        } else if (m1!=m2) {
            result = (m1-m2)*MONTH_FINE;
        } else {
            result = (d1-d2)*DAY_FINE;
        }
        return (result<0) ? 0 : result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d1 = Integer.parseInt(firstMultipleInput[0]);

        int m1 = Integer.parseInt(firstMultipleInput[1]);

        int y1 = Integer.parseInt(firstMultipleInput[2]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = Integer.parseInt(secondMultipleInput[0]);

        int m2 = Integer.parseInt(secondMultipleInput[1]);

        int y2 = Integer.parseInt(secondMultipleInput[2]);

        int result = Solution.libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(result);

        bufferedReader.close();
    }
}