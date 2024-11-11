package algorithms.search.iceCreamParlor;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        STDIN       Function
        -----       --------
        2           t = 2
        4           k = 4
        5           cost[] size n = 5
        1 4 5 3 2   cost = [1, 4, 5, 3, 2]
        4           k = 4
        4           cost[] size n = 4
        2 2 4 3     cost=[2, 2,4, 3]

        Sample Output
        1 4
        1 2
    */

    public static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<arr.size();i++) {
            for (int j=0;j<i;j++) {
                if (arr.get(i)+arr.get(j)==m) {
                    result.add(j+1);
                    result.add(i+1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> result = Solution.iceCreamParlor(m, arr);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

