// Transpose Matrix

import java.util.*;
public class Day11Ques2 {
    public int[][] transpose(int[][] matrix) {
        if(matrix.length == matrix[0].length){
            for(int i=0; i<matrix.length; i++){
                for(int j=i; j<matrix.length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        }
        else{
            int result[][] = new int[matrix[0].length][matrix.length];
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    result[j][i] = matrix[i][j];
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Day11Ques2 obj = new Day11Ques2();
        int[][] result = obj.transpose(matrix);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}