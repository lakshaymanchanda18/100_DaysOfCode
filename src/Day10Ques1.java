//Problem: Read a string and check if it is a palindrome using two-pointer comparison.
//
//Input:
//        - Single line: string s
//
//Output:
//        - Print YES if palindrome, otherwise NO
//
//Example:
//Input:
//level
//
//Output:
//YES
//
//Explanation: String reads same forwards and backwards

import java.util.*;
public class Day10Ques1 {
    static int isPalindrome(char[] s){
        int check = 1;
        int left = 0;
        int right = s.length-1;
        while(left<right){
            if(s[left] != s[right]){
                check = 0;
                break;
            }
            left++;
            right--;
        }
        return check;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
        if(isPalindrome(s) == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
