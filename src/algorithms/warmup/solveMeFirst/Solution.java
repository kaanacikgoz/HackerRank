package algorithms.warmup.solveMeFirst;

import java.util.*;

public class Solution {

    /*
        Sample Input
        a = 2
        b = 3

        Sample Output
        5
    */

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("Enter a: ");
        a = in.nextInt();
        int b;
        System.out.print("Enter b: ");
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}

