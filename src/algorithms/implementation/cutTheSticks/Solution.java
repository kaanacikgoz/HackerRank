package algorithms.implementation.cutTheSticks;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        8
        1 2 3 4 3 3 2 1

        Sample Output
        8
        6
        4
        1
    */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> resultArr = new ArrayList<>();
        while (arr.size()!=0) {
            resultArr.add(arr.size());
            int cutValue = Collections.min(arr);
            arr = arr.stream()
                    .map(t->t-cutValue)
                    .filter(t->t>0)
                    .collect(Collectors.toList());
        }
        return resultArr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Solution.cutTheSticks(arr);
        result.forEach(System.out::println);

        bufferedReader.close();
    }
}

