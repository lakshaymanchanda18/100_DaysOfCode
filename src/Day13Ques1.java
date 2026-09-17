//Problem: You are given a rectangular matrix of integers. Starting from the outer boundary, traverse the matrix in a clockwise manner and continue moving inward layer by layer until all elements are visited.
//
//Input:
//        - First line: two integers r and c representing the number of rows and columns
//        - Next r lines: c integers each representing the matrix elements
//
//Output:
//        - Print all visited elements in the order of traversal, separated by spaces
//
//Example:
//Input:
//        3 3
//        1 2 3
//        4 5 6
//        7 8 9
//
//Output:
//        1 2 3 6 9 8 7 4 5
//
//Explanation:
//The traversal begins along the top row, proceeds down the rightmost column, then moves across the bottom row in reverse, and finally goes up the leftmost column. The same pattern repeats for the inner submatrix.
//
//Test Cases:
//
//Test Case 1:
//Input:
//        2 3
//        1 2 3
//        4 5 6
//Output:
//        1 2 3 6 5 4
//
//Test Case 2:
//Input:
//        3 1
//        7
//        8
//        9
//Output:
//        7 8 9

import java.util.*;
public class Day13Ques1 {
    public void spiralTraversal(int[][] matrix){
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Day13Ques1 obj = new Day13Ques1();
        obj.spiralTraversal(matrix);
    }
}
