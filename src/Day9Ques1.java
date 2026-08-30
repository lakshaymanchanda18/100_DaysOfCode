//Problem: A secret system stores code names in forward order. To display them in mirror format, you must transform the given code name so that its characters appear in the opposite order.
//
//        Input:
//        - Single line: a lowercase string containing only alphabetic characters (no spaces)
//
//Output:
//        - Print the transformed code name after applying the mirror operation
//
//Example:
//Input:
//hello
//
//Output:
//olleh
//
//Explanation: The first character moves to the last position, the second to the second-last, and so on until the entire string is mirrored

import java.util.*;
public class Day9Ques1 {
    static String reverseString(String s){
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            ans.append(s.charAt(s.length()-i-1));
        }
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
}