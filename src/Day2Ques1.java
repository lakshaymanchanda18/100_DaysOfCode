//Problem: Write a C program to delete the element at a given 1-based position pos from an array of n integers. Shift remaining elements to the left.
//
//Input:
//        - First line: integer n
//- Second line: n space-separated integers
//- Third line: integer pos (1-based position to delete)
//
//Output:
//        - Print the updated array with (n-1) elements, space-separated
//
//Example:
//Input:
//        5
//        10 20 30 40 50
//        2
//
//Output:
//        10 30 40 50
//
//Explanation: Delete position 2 (element 20), remaining elements shift left

import java.util.*;
public class Day2Ques1 {
    public void deleteElement(int[] nums, int pos){
        for(int i=pos-1; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        for(int i=0; i<nums.length-1; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Day2Ques1 obj = new Day2Ques1();
        int pos = sc.nextInt();
        obj.deleteElement(nums, pos);
        sc.close();
    }
}