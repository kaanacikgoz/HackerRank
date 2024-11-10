package algorithms.implementation.sequenceEquation;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        5
        4 3 5 1 2

        Sample Output
        1
        3
        5
        4
        2
    */

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> modifyArr = new ArrayList<>();
        List<Integer> resultArr = new ArrayList<>();
        for (int i=1;i<=p.size();i++) {
            modifyArr.add(p.indexOf(i)+1);
        }
        for (Integer each:modifyArr) {
            resultArr.add(p.indexOf(each)+1);
        }
        return resultArr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Solution.permutationEquation(p);

        String abc = result.stream().map(Object::toString).collect(joining("\n"))+"\n";
        System.out.println(abc);

        bufferedReader.close();
    }
}

