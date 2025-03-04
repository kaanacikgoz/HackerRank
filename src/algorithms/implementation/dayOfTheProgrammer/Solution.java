package algorithms.implementation.dayOfTheProgrammer;

import java.io.*;

class Solution {

    /*
        Sample Input
        2017

        Sample Output
        13.09.2017
    */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        if (year==1918) {
            return "26.09.1918";
        } else if (year<1918 && year%4==0) {
            return "12.09."+year;
        } else if (year%400==0 || (year%4==0 && year%100!=0)) {
            return "12.09."+year;
        }
        return "13.09."+year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Solution.dayOfProgrammer(year);
        System.out.println(result);

        bufferedReader.close();
    }
}