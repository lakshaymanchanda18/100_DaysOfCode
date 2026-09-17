//Rotate Array

import java.util.*;
public class Day16Ques2 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int temp[] = new int[nums.length];
        for(int i=0; i<k; i++){
            temp[i] = nums[nums.length-k+i];
        }
        for(int i=0; i<nums.length-k; i++){
            temp[k+i] = nums[i];
        }
        for(int i=0; i<temp.length; i++){
            nums[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Day16Ques2 obj = new Day16Ques2();
        obj.rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}