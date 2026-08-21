//Problem: Given an array of n integers, reverse the array in-place using two-pointer approach.
//
//Input:
//        - First line: integer n
//- Second line: n space-separated integers
//
//Output:
//        - Print the reversed array, space-separated
//
//Example:
//Input:
//        5
//        1 2 3 4 5
//
//Output:
//        5 4 3 2 1
//
//Explanation: Swap pairs from both ends: (1,5), (2,4), middle 3 stays

import java.util.*;
public class Day4Ques1{
    public int[] reverseArray(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int i=0;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Day4Ques1 obj = new Day4Ques1();
        int reverse[] = obj.reverseArray(nums);
        for(int i=0; i<n; i++){
            System.out.print(reverse[i]+" ");
        }
    }
}