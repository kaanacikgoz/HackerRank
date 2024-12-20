package algorithms.implementation.catsAndAMouse;

import java.io.*;
import java.util.*;

public class Solution {

    /*
        Sample Input
        2
        1 2 3
        1 3 2

        Sample Output
        Cat B
        Mouse C
    */

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x-z)>Math.abs(y-z)) {
            return "Cat B";
        } else if (Math.abs(x-z)<Math.abs(y-z)) {
            return "Cat A";
        } else {
            return "Mouse C";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }

        scanner.close();
    }
}

