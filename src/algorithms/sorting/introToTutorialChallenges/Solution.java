package algorithms.sorting.introToTutorialChallenges;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        STDIN           Function
        -----           --------
        4               V = 4
        6               arr[] size n = 6 (not passed, see function description parameters)
        1 4 5 7 9 12    arr = [1, 4, 5, 7, 9, 12]

        Sample Output
        1
    */

    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int result = 0;
        for (int i=0;i<arr.size();i++) {
            result = arr.indexOf(V);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(bufferedReader.readLine().trim());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Solution.introTutorial(V, arr);
        System.out.println(result);

        bufferedReader.close();
    }
}

