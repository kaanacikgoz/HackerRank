package algorithms.implementation.billDivision;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        4 1
        3 10 2 9
        12

        Sample Output
        5
    */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int justAnnaSum = 0;
        for (Integer each:bill) {
            if (bill.get(k)==each) {
                continue;
            }
            justAnnaSum += each;
        }
        if (b==justAnnaSum/2) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b-justAnnaSum/2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Solution.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}

