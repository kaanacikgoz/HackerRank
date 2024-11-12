package algorithms.debugging.smartNumber;

import java.util.*;

public class Solution {

    /*
        Sample Input
        4
        1
        2
        7
        169

        Sample Output
        YES
        NO
        NO
        YES
    */

    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        if (Math.pow(val,2)==num)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}




