package algorithms.warmup.diagonalDifference;

import java.util.*;

public class Solution {

    /*
        Sample Input
        3
        11 2 4
        4 5 6
        10 8 -12

        Sample Output
        15
    */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRight = 0;
        int rightToLeft = 0;
        int n = arr.size();
        for (int i=0;i<arr.size();i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get(n-1);
            n--;
        }
        return Math.abs(leftToRight-rightToLeft);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();
        System.out.print("Enter square matrix length: ");
        int n = input.nextInt();
        for (int i=0;i<n;i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<n;j++) {
                System.out.printf("Enter %s,%s of matrix: ",i,j);
                row.add(input.nextInt());
            }
            arr.add(row);
        }
        System.out.println(Solution.diagonalDifference(arr));
    }
}

