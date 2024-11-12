package algorithms.implementation.jumpingOnTheCloudsRevisited;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        Sample Input
        STDIN             Function
        -----             --------
        8 2               n = 8, k = 2
        0 0 1 0 0 1 1 0   c = [0, 0, 1, 0, 0, 1, 1, 0]

        Sample Output
        92
    */

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int result=100;
        int position = 0;
        do {
            result--;
            if (c[position]==1) {
                result -= 2;
            }
            position+=k;
            if (position>=c.length) {
                position = Math.abs(c.length-position);
            }
        } while (position!=0);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);
        System.out.println(result);

        scanner.close();
    }
}

