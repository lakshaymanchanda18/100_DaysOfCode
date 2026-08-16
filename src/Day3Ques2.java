//Find missing

import java.util.*;
public class Day3Ques2 {
    public int missingNum(int arr[]) {
        // code here
        int missing = 0;
        for(int i=1; i<=arr.length+1; i++){
            missing ^= i;
        }
        for(int i=0; i<arr.length; i++){
            missing ^= arr[i];
        }
        return missing;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Day3Ques2 obj = new Day3Ques2();
        System.out.println(obj.missingNum(arr));
    }
}