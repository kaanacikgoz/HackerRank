package algorithms.implementation.angryProfessor;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        2
        4 3
        -1 -3 4 2
        4 2
        0 -1 2 1

        Sample Output
        YES
        NO
    */

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int nonPositiveCount=0;
        for (Integer each:a) {
            if (each<=0) {
                nonPositiveCount++;
            }
        }
        if (k>nonPositiveCount) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = Solution.angryProfessor(k, a);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

