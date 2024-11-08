package algorithms.implementation.gradingStudents;

import java.util.*;

public class Solution {

    /*
        Sample Input
        4
        73
        67
        38
        33

        Sample Output
        75
        67
        40
        33
    */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> gradeList = new ArrayList<>();
        for (Integer each:grades) {
            if (each<38) {
                gradeList.add(each);
            } else if (each%5==3) {
                gradeList.add(each+2);
            } else if (each%5==4) {
                gradeList.add(each+1);
            } else {
                gradeList.add(each);
            }
        }
        return gradeList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = input.nextInt();
        List<Integer> grades = new ArrayList<>();
        for (int i=0;i<n;i++) {
            System.out.printf("Enter num %s: ",i+1);
            grades.add(input.nextInt());
        }
        for (Integer each:Solution.gradingStudents(grades)) {
            System.out.println(each);
        }
    }
}

