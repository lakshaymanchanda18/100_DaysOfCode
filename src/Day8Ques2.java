// Power of two

import java.util.*;
public class Day8Ques2 {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n < 1){
            return false;
        }
        double nAsDouble = n;
        double pow = Math.round(Math.log(n) / Math.log(2));
        double x = Math.pow(2.0, pow);
        if(x == nAsDouble){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Day8Ques2 obj = new Day8Ques2();
        System.out.println(obj.isPowerOfTwo(n));
    }
}

