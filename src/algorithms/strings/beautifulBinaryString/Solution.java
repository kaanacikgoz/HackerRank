package algorithms.strings.beautifulBinaryString;

import java.io.*;

public class Solution {

    /*
        Sample Input
        10
        0100101010

        Sample Output
        3
    */

    public static int beautifulBinaryString(String b) {
        // Write your code here
        int count = 0;
        for (int i=0;i<b.length()-2;i++) {
            if (b.substring(i, i+3).contains("010")) {
                count++;
                i+=2;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String b = bufferedReader.readLine();

        int result = Solution.beautifulBinaryString(b);
        System.out.println(result);

        bufferedReader.close();
    }
}
