//Stock Buy and Sell

import java.util.*;
public class Day2Ques2{
    public int maxProfit(int[] prices){
        int profit = 0;
        int minPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            int currentProfit = prices[i] - minPrice;
            if(currentProfit > profit){
                profit = currentProfit;
            }
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        Day2Ques2 obj = new Day2Ques2();
        int profit = obj.maxProfit(prices);
        System.out.println(profit);
    }
}