//Problem: Given an array of integers, count the frequency of each distinct element and print the result.
//
//        Input:
//        - First line: integer n (size of array)
//        - Second line: n integers
//
//        Output:
//        - Print each element followed by its frequency in the format element:count
//
//        Example:
//        Input:
//        5
//        1 2 2 3 1
//
//        Output:
//        1:2 2:2 3:1

import java.util.*;
public class Day16Ques1 {
    public void countFrequency(int[] nums) {
        if(nums.length == 0) return;
        Arrays.sort(nums);
        int count = 1;
        for (int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                count++;
            }
            else{
                System.out.print(nums[i] + ":" + count + " ");
                count = 1;
            }
        }
        System.out.print(nums[nums.length-1] + ":" + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        Day16Ques1 obj = new Day16Ques1();
        obj.countFrequency(nums);
    }
}