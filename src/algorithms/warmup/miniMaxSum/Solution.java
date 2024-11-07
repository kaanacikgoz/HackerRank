package algorithms.warmup.miniMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        1 2 3 4 5

        Sample Output
        10 14
    */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> arr2 = new ArrayList<>(arr);
        long maxSum = 0;
        long minSum = 0;
        for (Integer each:arr) {
            if (each>max) {
                max = each;
            }
            if (min>each) {
                min = each;
            }
        }
        arr.remove(arr.indexOf(max));
        for (Integer each:arr) {
            minSum += each;
        }
        arr2.remove(arr2.indexOf(min));
        for (Integer each:arr2) {
            maxSum += each;
        }
        System.out.print(minSum+" "+maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Solution.miniMaxSum(arr);

        bufferedReader.close();
    }
}

