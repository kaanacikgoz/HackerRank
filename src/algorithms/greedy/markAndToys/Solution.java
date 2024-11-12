package algorithms.greedy.markAndToys;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        7 50
        1 12 5 111 200 1000 10

        Sample Output
        4
    */

    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        prices.sort(Integer::compareTo);
        int sum = 0;
        int count = -1;
        while (sum<=k) {
            count++;
            sum += prices.get(count);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Solution.maximumToys(prices, k);
        System.out.println(result);

        bufferedReader.close();
    }
}

