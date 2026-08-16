//Problem: Write a C program to insert an element x at a given 1-based position pos in an array of n integers. Shift existing elements to the right to make space.
//
//        Input:
//        - First line: integer n
//- Second line: n space-separated integers (the array)
//- Third line: integer pos (1-based position)
//- Fourth line: integer x (element to insert)
//
//Output:
//        - Print the updated array (n+1 integers) in a single line, space-separated
//
//Example:
//Input:
//        5
//        1 2 4 5 6
//        3
//        3
//
//Output:
//        1 2 3 4 5 6
//
//Explanation: Insert 3 at position 3, elements [4,5,6] shift right

import java.util.Scanner;
public class Day1Ques1{
    public int[] insertElement(int[] nums, int pos, int x){
        int result[] = new int[nums.length+1];
        for(int i=0; i<pos-1; i++){
            result[i] = nums[i];
        }
        for(int i=pos; i<result.length; i++){
            result[i] = nums[i-1];
        }
        result[pos-1] = x;
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int x = sc.nextInt();

        Day1Ques1 obj = new Day1Ques1();
        int[] result = obj.insertElement(nums, pos, x);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}