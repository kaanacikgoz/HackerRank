package algorithms.implementation.betweenTwoSets;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
        Sample Input
        2 3
        2 4
        16 32 96

        Sample Output
        3
    */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count=0;
        int begin = Collections.max(a);
        int end = Collections.min(b);
        int gcd=0;
        int lcm=1;
        for (int i=0;i<b.size();i++) {
            gcd = gcd(gcd, b.get(i));
        }
        for (int i=0;i<a.size();i++) {
            lcm = lcm(lcm, a.get(i));
        }
        for (;begin<=end;begin++) {
            if (gcd%begin==0 && begin%lcm==0) {
                count++;
            }
        }
        return count;
    }

    public static int gcd(int a, int b) {
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a/gcd(a, b)*b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Solution.getTotalX(arr, brr);
        System.out.println(total);

        bufferedReader.close();
    }
}