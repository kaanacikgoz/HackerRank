package algorithms.implementation.designerPdfViewer;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {

    /*
        Sample Input
        1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
        zaba

        Sample Output
        28
    */

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        List<Character> alphabet = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (char ch='a';ch<='z';ch++) {
            alphabet.add(ch);
        }
        for (int i=0;i<alphabet.size();i++) {
            map.put(alphabet.get(i), h.get(i));
        }
        for (int i=0;i<word.length();i++) {
            if (map.get(word.charAt(i))>max) {
                max = map.get(word.charAt(i));
            }
        }
        return word.length()*max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String word = bufferedReader.readLine();

        System.out.println(Solution.designerPdfViewer(h, word));

        bufferedReader.close();
    }
}

