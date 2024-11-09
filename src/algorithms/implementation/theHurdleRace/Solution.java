package algorithms.implementation.theHurdleRace;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        5 7
        2 5 4 5 2

        Sample Output
        0
    */

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for (Integer each:height) {
            if (each>max) {
                max = each;
            }
        }
        if (k<max) {
            return max-k;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        System.out.println(Solution.hurdleRace(k, height));

        bufferedReader.close();
    }
}

