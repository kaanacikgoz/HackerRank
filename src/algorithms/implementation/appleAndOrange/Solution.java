package algorithms.implementation.appleAndOrange;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        7 11
        5 15
        3 2
        -2 2 1
        5 -6

        Sample Output
        1
        1
    */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        List<Integer> newApples = new ArrayList<>();
        List<Integer> newOranges = new ArrayList<>();
        int appleCount = 0;
        int orangeCount = 0;
        for (Integer each:apples) {
            each += a;
            newApples.add(each);
        }
        for (Integer each:oranges) {
            each += b;
            newOranges.add(each);
        }
        for(Integer each:newApples) {
            if (each>=s && each<=t) {
                appleCount++;
            }
        }
        for (Integer each:newOranges) {
            if (each<=t && each>=s) {
                orangeCount++;
            }
        }
        System.out.print(appleCount+"\n"+orangeCount);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Solution.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}

