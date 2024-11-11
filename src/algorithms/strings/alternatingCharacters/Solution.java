package algorithms.strings.alternatingCharacters;

import java.io.*;
import java.util.stream.*;

public class Solution {

    /*
        Sample Input
        5
        AAAA
        BBBBB
        ABABABAB
        BABABA
        AAABBB

        Sample Output
        3
        4
        0
        0
        4
    */

    public static int alternatingCharacters(String s) {
        // Write your code here
        int deletedCount=0;
        for (int i=0, j=i+1;j<s.length();i++,j++) {
            if (s.charAt(i)==s.charAt(j)) {
                deletedCount++;
            }
        }
        return deletedCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Solution.alternatingCharacters(s);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

