package algorithms.greedy.permutingTwoArrays;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        STDIN       Function
        -----       --------
        2           q = 2
        3 10        A[] and B[] size n = 3, k = 10
        2 1 3       A = [2, 1, 3]
        7 8 9       B = [7, 8, 9]
        4 5         A[] and B[] size n = 4, k = 5
        1 2 2 1     A = [1, 2, 2, 1]
        3 3 3 4     B = [3, 3, 3, 4]

        Sample Output
        YES
        NO
    */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        A.sort(Integer::compareTo);
        B.sort(Integer::compareTo);
        int count=0;
        int n = A.size();
        for (int i=0;i<n;i++) {
            if (A.get(i)+B.get(n-i-1)>=k) {
                count++;
            }
        }
        if (count==A.size()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = Solution.twoArrays(k, A, B);
                System.out.println(result);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

