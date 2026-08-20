//Problem: Write a recursive function fib(n) to compute the n-th Fibonacci number where fib(0)=0 and fib(1)=1.
//
//Input:
//        - Single integer n
//
//Output:
//        - Print the n-th Fibonacci number
//
//Example:
//Input:
//        6
//
//Output:
//        8
//
//Explanation: Sequence: 0,1,1,2,3,5,8 at positions 0,1,2,3,4,5,6

import java.util.*;
public class Day7Ques1 {
    public int calculateFibonacci(int n){
        if (n<=1){
            return n;
        }
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Day7Ques1 obj = new Day7Ques1();
        System.out.println(obj.calculateFibonacci(n));
    }
}
