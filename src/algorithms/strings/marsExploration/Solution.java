package algorithms.strings.marsExploration;

import java.io.*;

public class Solution {

    /*
        Sample Input
        SOSSOT

        Sample Output
        1
    */

    public static int marsExploration(String s) {
        // Write your code here
        int n = s.length();
        int sosCount = n / 3;
        int count = 0;
        StringBuilder expected = new StringBuilder();
        for (int i=0;i<sosCount;i++) {
            expected.append("SOS");
        }
        for (int i=0;i<n;i++) {
            if (expected.charAt(i)!=s.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int result = Solution.marsExploration(s);
        System.out.println(result);

        bufferedReader.close();
    }
}

