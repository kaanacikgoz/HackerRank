package algorithms.implementation.appendAndDelete;

import java.io.*;

class Solution {

    /*
        Sample Input
        hackerhappy
        hackerrank
        9

        Sample Output
        Yes
    */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        StringBuilder strBuilder = new StringBuilder();
        int n = Math.min(s.length(), t.length());

        for (int i=0;i<n;i++) {
            if (s.charAt(i)==t.charAt(i)) {
                strBuilder.append(s.charAt(i));
            } else {
                break;
            }
        }
        int sum=s.length()+t.length()-(2*strBuilder.length());

        return (sum==k || (sum<k && (k-sum)%2==0) || k>=(s.length()+t.length())) ?  "Yes": "No";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Solution.appendAndDelete(s, t, k);
        System.out.println(result);

        bufferedReader.close();
    }
}