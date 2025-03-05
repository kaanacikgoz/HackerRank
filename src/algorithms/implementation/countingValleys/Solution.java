package algorithms.implementation.countingValleys;

import java.io.*;

class Solution {

    /*
        Sample Input
        8
        UDDDUDUU

        Sample Output
        1
    */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int start=0;
        int result=0;
        for (int i=0;i<steps;i++) {
            if (path.charAt(i)=='U') {
                start+=1;
                if (start==0) {
                    result++;
                }
            } else {
                start-=1;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Solution.countingValleys(steps, path);
        System.out.println(result);

        bufferedReader.close();
    }
}