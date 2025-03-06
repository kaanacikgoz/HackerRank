package algorithms.implementation.equalizeTheArray;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
        Sample Input
        5
        3 3 2 1 3

        Sample Output
        2
    */

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int max=Integer.MIN_VALUE;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer num:arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> each:freqMap.entrySet()) {
            if (each.getValue()>max) {
                max = each.getValue();
            }
        }
        return arr.size()-max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Solution.equalizeArray(arr);
        System.out.println(result);

        bufferedReader.close();
    }
}