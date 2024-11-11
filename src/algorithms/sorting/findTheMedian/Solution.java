package algorithms.sorting.findTheMedian;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        7
        0 1 2 4 6 5 3

        Sample Output
        3
    */

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        //arr.sort(Integer::compareTo); different way
        List<Integer> sortedArr = arr.stream().sorted().collect(Collectors.toList());
        int median = arr.size()/2;
        return sortedArr.get(median);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Solution.findMedian(arr);
        System.out.println(result);

        bufferedReader.close();
    }
}

