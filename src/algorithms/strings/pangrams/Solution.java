package algorithms.strings.pangrams;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        Sample Input
        We promptly judged antique ivory buckles for the next prize

        Sample Output
        pangram
    */

    public static String pangrams(String s) {
        // Write your code here
        String result = " ";
        Set<Character> charSet = new HashSet<>();
        for (int i=0;i<s.length();i++) {
            charSet.add(s.toLowerCase().charAt(i));
        }
        if (charSet.size()-1==26) {
            result = "pangram";
        } else {
            result = "not pangram";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Solution.pangrams(s);
        System.out.println(result);

        bufferedReader.close();
    }
}

