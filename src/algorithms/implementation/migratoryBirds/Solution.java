package algorithms.implementation.migratoryBirds;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        6
        1 4 4 4 5 3

        Sample Output
        4
    */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int max=Integer.MIN_VALUE;
        int result=0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer num:arr) {
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> each:freqMap.entrySet()) {
            if (each.getValue()>max) {
                max = each.getValue();
                result = each.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Solution.migratoryBirds(arr);
        System.out.println(result);
        bufferedReader.close();
    }
}