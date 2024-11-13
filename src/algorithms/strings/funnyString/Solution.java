package algorithms.strings.funnyString;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    /*
        Sample Input
        STDIN   Function
        -----   --------
        2       q = 2
        acxz    s = 'acxz'
        bcxz    s = 'bcxz'

        Sample Output
        Funny
        Not Funny
    */

    public static String funnyString(String s) {
        // Write your code here
        List<Integer> intArr = new ArrayList<>();
        for (int i=0;i<s.length();i++) {
            int eachValue = s.charAt(i);
            intArr.add(eachValue);
        }
        int n = intArr.size();
        for (int i=0;i<n/2;i++) {
            int arrValue = Math.abs(intArr.get(i)-intArr.get(i+1));
            int reverseArrValue = Math.abs(intArr.get(n-i-1)-intArr.get(n-i-2));
            if (arrValue!=reverseArrValue) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Solution.funnyString(s);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

