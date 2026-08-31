// Intersection of 2 Arrays

import java.util.*;
public class Day10Ques2 {
    public int[] intersect(int[] nums1, int[] nums2){
        int freq[] = new int[1001];
        for(int i=0; i<nums1.length; i++){
            freq[nums1[i]]++;
        }
        int k = 0;
        int result[] = new int[Math.min(nums1.length, nums2.length)];
        for(int i=0; i<nums2.length; i++){
            if(freq[nums2[i]]>0){
                result[k] = nums2[i];
                k++;
                freq[nums2[i]]--;
            }
        }
        return Arrays.copyOf(result, k);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for(int i=0; i<n; i++){
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for(int i=0; i<m; i++){
            nums2[i] = sc.nextInt();
        }
        Day10Ques2 obj = new Day10Ques2();
        int result[] = obj.intersect(nums1, nums2);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }
    }
}