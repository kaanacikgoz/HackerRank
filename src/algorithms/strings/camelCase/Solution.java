package algorithms.strings.camelCase;

import java.io.*;
import java.util.regex.*;

public class Solution {

    /*
        Sample Input
        saveChangesInTheEditor

        Sample Output
        5
    */

    public static int camelcase(String s) {
        // Write your code here
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        int count=0;
        while (matcher.find()) {
            count++;
        }
        return ++count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int result = Solution.camelcase(s);
        System.out.println(result);

        bufferedReader.close();
    }
}

