package algorithms.implementation.salesByMatch;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
        Sample Input
        9
        10 20 20 10 10 30 50 10 20

        Sample Output
        3
    */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairCount=0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer num:ar) {
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        System.out.println(freqMap);
        for (Map.Entry<Integer,Integer> each:freqMap.entrySet()) {
            int freq = each.getValue();
            while (freq/2!=0) {
                pairCount++;
                freq-=2;
            }
        }
        return pairCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Solution.sockMerchant(n, ar);
        System.out.println(result);

        bufferedReader.close();
    }
}