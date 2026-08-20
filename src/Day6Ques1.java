//Problem: Given a sorted array of n integers, remove duplicates in-place. Print only unique elements in order.
//
//Input:
//        - First line: integer n
//- Second line: n space-separated integers (sorted array)
//
//Output:
//        - Print unique elements only, space-separated
//
//Example:
//Input:
//        6
//        1 1 2 2 3 3
//
//Output:
//        1 2 3
//
//Explanation: Keep first occurrence of each element: 1, 2, 3

import java.util.*;
public class Day6Ques1{
    public int deleteDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Day6Ques1 obj = new Day6Ques1();
        int k = obj.deleteDuplicates(nums);
        for(int i=0; i<k; i++){
            System.out.print(nums[i]+" ");
        }
    }
}