package algorithms.warmup.timeConversion;

import java.util.Scanner;

public class Solution {

    /*
        Sample Input
        07:05:45PM

        Sample Output
        19:05:45
    */

    public static String timeConversion(String s) {
        // Write your code here
        final String STR_HOUR = s.substring(0, 2);
        int hour = Integer.parseInt(s.substring(0, 2));
        final String FIRST_COLON = s.substring(2, 3);
        final String MINUTE = s.substring(3, 5);
        final String SECOND_COLON = s.substring(5, 6);
        final String SECOND = s.substring(6, 8);
        final String AM_OR_PM = s.substring(8, 10);
        if (hour>=12 && AM_OR_PM.equals("PM")) {
            return STR_HOUR+FIRST_COLON+MINUTE+SECOND_COLON+SECOND;
        } else if (hour>=12 && AM_OR_PM.equals("AM")) {
            if (hour!=22 && hour!=23 && hour!=24) {
                return "0"+String.valueOf(hour-12+FIRST_COLON+MINUTE+SECOND_COLON+SECOND);
            } else {
                return String.valueOf(hour-12+FIRST_COLON+MINUTE+SECOND_COLON+SECOND);
            }
        } else if (hour<=12 && AM_OR_PM.equals("PM")) {
            return String.valueOf(hour+12+FIRST_COLON+MINUTE+SECOND_COLON+SECOND);
        } else {
            return STR_HOUR+FIRST_COLON+MINUTE+SECOND_COLON+SECOND;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time: ");
        System.out.println(Solution.timeConversion(input.nextLine()));
    }
}

