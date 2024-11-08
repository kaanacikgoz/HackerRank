package algorithms.warmup.staircase;

import java.io.*;

public class Solution {

    /*
        Sample Input
        6

        Sample Output
             #
            ##
           ###
          ####
         #####
        ######
    */

    public static void staircase(int n) {
        // Write your code here
        String hashtag = "#";
        for (int i=0;i<n;i++) {
            StringBuilder line = new StringBuilder();
            for (int j=0;j<i+1;j++) {
                line.append(hashtag);
            }
            System.out.println(String.format("%"+n+"s", line));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Solution.staircase(n);

        bufferedReader.close();
    }
}

