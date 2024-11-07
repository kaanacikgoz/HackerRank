package algorithms.warmup.birthdayCakeCandles;

import java.util.*;

public class Solution {

    /*
        Sample Input
        4
        3 2 1 3

        Sample Output
        2
    */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (Integer each:candles) {
            if (each>max) {
                max = each;
            }
        }
        for (Integer each:candles) {
            if (each==max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> candles = new ArrayList<>();
        System.out.print("Enter array length: ");
        int n = input.nextInt();
        for (int i=0;i<n;i++) {
            System.out.printf("Enter array num %s: ",i+1);
            candles.add(input.nextInt());
        }
        System.out.println(Solution.birthdayCakeCandles(candles));
    }
}

