package algorithms.warmup.plusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        6
        -4 3 -9 0 4 1

        Sample Output
        0.500000
        0.333333
        0.166667
    */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positiveCount = 0f;
        float negativeCount = 0f;
        float neutralCount = 0f;
        for (Integer each:arr) {
            if (each>0) {
                positiveCount++;
            } else if (each<0) {
                negativeCount++;
            } else {
                neutralCount++;
            }
        }
        String formattedPositive = String.format("%.6f", positiveCount/arr.size());
        String formattedNegative = String.format("%.6f", negativeCount/arr.size());
        String formattedNeutral = String.format("%.6f", neutralCount/arr.size());
        System.out.println(formattedPositive);
        System.out.println(formattedNegative);
        System.out.println(formattedNeutral);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Solution.plusMinus(arr);

        bufferedReader.close();
    }
}

