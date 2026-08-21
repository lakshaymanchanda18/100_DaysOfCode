//Problem: Given integers a and b, compute a^b using recursion without using pow() function.
//
//Input:
//        - Two space-separated integers a and b
//
//Output:
//        - Print a raised to power b
//
//Example:
//Input:
//        2 5
//
//Output:
//        32
//
//Explanation: 2^5 = 2 * 2 * 2 * 2 * 2 = 32

import java.util.*;
public class Day8Ques1 {
    public int power(int a, int b){
        if(b == 0 || a == 1){
            return 1;
        }
        if(b == 1){
            return a;
        }
        return a*power(a, b-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Day8Ques1 obj = new Day8Ques1();
        System.out.println(obj.power(a, b));
    }
}
