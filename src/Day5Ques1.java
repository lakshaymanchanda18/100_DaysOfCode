//Problem: A system receives two separate logs of user arrival times from two different servers. Each log is already sorted in ascending order. Your task is to create a single chronological log that preserves the correct order of arrivals.
//
//Input:
//        - First line: integer p (number of entries in server log 1)
//- Second line: p sorted integers representing arrival times from server 1
//        - Third line: integer q (number of entries in server log 2)
//- Fourth line: q sorted integers representing arrival times from server 2)
//
//Output:
//        - Print a single line containing all arrival times in chronological order, separated by spaces
//
//Example:
//Input:
//        5
//        10 20 30 50 70
//        4
//        15 25 40 60
//
//Output:
//        10 15 20 25 30 40 50 60 70
//
//Explanation: Compare the next unprocessed arrival time from both logs and append the earlier one to the final log until all entries are processed

import java.util.*;
public class Day5Ques1 {
    public int[] arrivalChron(int[] first, int[] second) {
        int finals[] = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;
        while (i < first.length && j < second.length) {
            if(first[i]<second[j]){
                finals[k] = first[i];
                i++;
            }
            else{
                finals[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            finals[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            finals[k] = second[j];
            j++;
            k++;
        }
        return finals;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first[] = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int second[] = new int[m];
        for (int i = 0; i < m; i++) {
            second[i] = sc.nextInt();
        }
        Day5Ques1 obj = new Day5Ques1();
        int result[] = obj.arrivalChron(first, second);
        for (int i = 0; i < n + m; i++) {
            System.out.print(result[i] + " ");
        }
    }
}