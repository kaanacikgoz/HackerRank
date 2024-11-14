package algorithms.implementation.subarrayDivision;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        5
        1 2 1 3 2
        3 2

        Sample Output
        2
    */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i=0;i<=s.size()-m;i++) {
            int sum = 0;
            List<Integer> valueArr = s.subList(i, i+m);
            for (Integer each:valueArr) {
                sum += each;
            }
            if (sum==d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Solution.birthday(s, d, m);
        System.out.println(result);

        bufferedReader.close();
    }
}

