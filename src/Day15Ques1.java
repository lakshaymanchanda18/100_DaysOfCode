//Problem: Given a matrix, calculate the sum of its primary diagonal elements. The primary diagonal consists of elements where row index equals column index.
//
//Input:
//        - First line: two integers m and n
//- Next m lines: n integers each
//
//Output:
//        - Print the sum of the primary diagonal elements
//
//Example:
//Input:
//        3 3
//        1 2 3
//        4 5 6
//        7 8 9
//
//Output:
//        15
//
//Explanation:
//        1 + 5 + 9 = 15

import java.util.*;
public class Day15Ques1 {
    public int diagonalSum(int[][] matrix) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Day15Ques1 obj = new Day15Ques1();
        System.out.println(obj.diagonalSum(matrix));
    }
}


