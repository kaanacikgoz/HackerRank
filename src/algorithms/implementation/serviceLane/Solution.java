package algorithms.implementation.serviceLane;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        STDIN               Function
        -----               --------
        8 5                 n = 8, t = 5
        2 3 1 2 3 2 3 3     width = [2, 3, 1, 2, 3, 2, 3, 3]
        0 3                 cases = [[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]]
        4 6
        6 7
        3 5
        0 7

        Sample Output
        1
        2
        3
        2
        1
    */

    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
        // Write your code here
        List<Integer> resultArr = new ArrayList<>();
        for (int i=0;i<cases.size();i++) {
            int min = Integer.MAX_VALUE;
            List<Integer> widthSubArr = width.subList(cases.get(i).get(0), cases.get(i).get(1)+1);
            for (Integer each:widthSubArr) {
                if (min>each) {
                    min = each;
                }
            }
            resultArr.add(min);
        }
        return resultArr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> width = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<List<Integer>> cases = new ArrayList<>();

        IntStream.range(0, t).forEach(i -> {
            try {
                cases.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Solution.serviceLane(n, width, cases);
        result.forEach(System.out::println);

        bufferedReader.close();
    }
}

