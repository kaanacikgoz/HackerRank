package algorithms.implementation.viralAdvertising;

import java.io.*;

public class Solution {

    /*
        Sample Input
        3

        Sample Output
        9
    */

    public static int viralAdvertising(int n) {
        // Write your code her
        int shared = 5;
        int cumulative = 0;
        int liked = 0;
        for (int i=1;i<=n;i++) {
            if (i%2!=0) {
                liked = shared/2;
                cumulative += shared/2;
            } else {
                shared = liked*3;
                liked = shared/2;
                cumulative += liked;
                shared = liked*3;
            }
        }
        return cumulative;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(Solution.viralAdvertising(n));

        bufferedReader.close();
    }
}

