// Problem: Best Time to Buy and Sell Stock (LeetCode #121)
// Pattern: Track min price, update max profit
// Date: Feb 18, 2026

import java.util.Scanner;

public class Problem22_BestTimeToBuySellStock {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter array size: ");
       int n = sc.nextInt();
       int[] prices = new int[n];
         System.out.println("Enter stock prices:");
         for(int i = 0;i<prices.length;i++){
            prices[i] = sc.nextInt();

         }
         int minPrice = prices[0];
         int maxProfit = 0;
         for(int i= 1;i<prices.length;i++){
            minPrice = Math.min(minPrice,prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit,profit);
         }
         System.out.println("Maximum profit: " + maxProfit + " (Buy at " + minPrice + ", Sell at " + (minPrice + maxProfit) + ")");
        sc.close();
    }
}
