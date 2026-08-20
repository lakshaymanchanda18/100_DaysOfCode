// Move zeros

import java.util.*;
public class Day6Ques2 {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int i=0;
        while(i<nums.length){
            if(nums[i] == 0){
                zeroCount++;
            }
            else{
                int nonZero = i;
                int temp = nums[i-zeroCount];
                nums[i-zeroCount] = nums[nonZero];
                nums[nonZero] = temp;
            }
            i++;
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        Day6Ques2 obj = new Day6Ques2();
        obj.moveZeroes(nums);
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}

