//Problem: Implement linear search to find key k in an array. Count and display the number of comparisons performed.
//
//Input:
//        - First line: integer n (array size)
//- Second line: n space-separated integers
//- Third line: integer k (key to search)
//
//Output:
//        - Line 1: "Found at index i" OR "Not Found"
//Line 2: "Comparisons = c"
//
//Example:
//Input:
//        5
//        10 20 30 40 50
//        30
//
//Output:
//Found at index 2
//Comparisons = 3
//
//Explanation: Compared with 10, 20, 30 (found at index 2 with 3 comparisons)

import java.util.*;
public class Day3Ques1{
    public int findElement(int nums[], int key){
        int keyIndex = -1;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] == key) {
                keyIndex = i;
                break;
            }
        }
        return keyIndex;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Day3Ques1 obj = new Day3Ques1();
        int keyIndex = obj.findElement(nums, key);
        int comparisons = keyIndex+1;
        if(keyIndex == -1){
            System.out.println("Not found.");
            System.out.println("Comparisons = "+n);
        }
        else{
            System.out.println("Found at index "+keyIndex);
            System.out.println("Comparisons = "+comparisons);
        }
    }
}