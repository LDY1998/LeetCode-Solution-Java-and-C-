package arrayPractice;


/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction 
(i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */



public class BestTimetoBuyStock {

	
	
	public static int maxProfit(int[] prices) {
		if(prices==null) return 0;
		int ret=0;
		int len=prices.length;
		
		int[] min_buy=new int[len];int[] max_sell=new int[len];
		min_buy[0]=prices[0];max_sell[len-1]=prices[len-1];
		for(int i=1;i<len;i++) {
			min_buy[i]=Math.min(min_buy[i-1], prices[i]);
		}
		for(int i=len-2;i>=0;i--) {
			max_sell[i]=Math.max(max_sell[i+1], prices[i]);
		}
		
		for(int i=0;i<len;i++) {
			if(ret<max_sell[i]-min_buy[i])	ret=max_sell[i]-min_buy[i];
			
		}
		return ret;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price= {1,2,3,6,9,7};
		System.out.println(maxProfit(price));
	}

}
