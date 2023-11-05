/* Given a Rod of Length N and array prices of length N denoting the cost of the pieces of the rod of length 1 to n, find the maximum amount that can be made if the rod is cut up optimally */
import java.util.*;
public class RodCutting {
    static int memo[] = new int[1000];

//  tc - O(N^2)
// sp - O(N)
 public static int maximumProfit(int[] prices, int n) {
   if (n == 0) {
     return 0;
   }
   if(memo[n] != -1){
       return memo[n];
   }
   int maxProfit = Integer.MIN_VALUE;
   // we have 1 for loop for every i
   for (int i = 1; i <= n; i++) {
     maxProfit = Math.max(maxProfit, prices[i - 1] + maximumProfit(prices, n - i));
   }
   return memo[n] = maxProfit;
 }
    public static void main(String[] args){
        int n = 8;
        int prices[] = new int[] { 1, 3, 4, 5, 7, 9, 10, 11};
       Arrays.fill(memo, -1);
        System.out.print(maximumProfit(prices, n));
    }
}
