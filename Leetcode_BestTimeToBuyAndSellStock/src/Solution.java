
public class Solution {
	public int maxProfit(int[] prices){
		if(prices==null||prices.length==0){
			return 0;
		}
		int len=prices.length;
		int maxprofit=0;
		int min=prices[0];
		for(int i=1;i<len;i++){
			int tempprofit=prices[i]-prices[i-1];
			if(maxprofit<tempprofit){
				maxprofit=tempprofit;
			}
			if(min>prices[i]){
				min=prices[i];
			}
		}
		return maxprofit;
	}
}
