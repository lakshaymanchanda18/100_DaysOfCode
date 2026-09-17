//Problem: Write a program to check whether a given square matrix is an Identity Matrix. An identity matrix is a square matrix in which all diagonal elements are 1 and all non-diagonal elements are 0.
//
//Input:
//        - First line: integer n representing number of rows and columns
//- Next n lines: n integers each representing the matrix elements
//
//Output:
//        - Print "Identity Matrix" if the matrix satisfies the condition
//- Otherwise, print "Not an Identity Matrix"
//
//Example:
//Input:
//        3
//        1 0 0
//        0 1 0
//        0 0 1
//
//Output:
//Identity Matrix

import java.util.*;
public class Day14Ques1 {
    static boolean isIdentity(int[][] matrix) {
        int n = matrix.length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==j && matrix[i][j] != 1) {
                    return false;
                }
                if (i!=j && matrix[i][j]!=0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        if (isIdentity(matrix)) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }
    }
}
