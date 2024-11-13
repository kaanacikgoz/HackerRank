package algorithms.strings.stringConstruction;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        Sample Input
        2
        abcd
        abab

        Sample Output
        4
        2
    */

    public static int stringConstruction(String s) {
        // Write your code here
        Set<Character> charSet = new HashSet<>();
        for (int i=0;i<s.length();i++) {
            charSet.add(s.charAt(i));
        }
        return charSet.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Solution.stringConstruction(s);
            System.out.println(result);
        }

        bufferedReader.close();
    }
}

