//Two sum
import java.util.*;
public class Day1Ques2 {
    public int[] twoSum(int[] nums, int target) {
        int temp[] = nums.clone();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            if (sum == target) {
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        int pair[] = new int[2];
        for(int i=0; i<nums.length; i++){
            if(temp[i] == nums[left]){
                pair[0] = i;
                break;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(temp[i] == nums[right] && i!= pair[0]){
                pair[1] = i;
                break;
            }
        }
        return pair;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Day1Ques2 obj = new Day1Ques2();
        int[] pair = obj.twoSum(nums, target);
        for(int i=0; i<2; i++){
            System.out.print(pair[i]+" ");
        }
        sc.close();
    }
}