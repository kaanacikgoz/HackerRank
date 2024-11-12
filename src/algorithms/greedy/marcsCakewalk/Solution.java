package algorithms.greedy.marcsCakewalk;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        4
        7 4 9 6

        Sample Output
        79
    */

    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        List<Integer> sortedArr = calorie.stream().sorted().collect(Collectors.toList());
        long sum = 0;
        int n = calorie.size();
        for (int i=0;i<n;i++) {
            sum += Math.pow(2, n-i-1)*sortedArr.get(i);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> calorie = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        long result = Solution.marcsCakewalk(calorie);
        System.out.println(result);

        bufferedReader.close();
    }
}

