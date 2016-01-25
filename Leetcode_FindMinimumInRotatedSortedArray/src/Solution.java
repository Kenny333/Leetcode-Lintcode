
public class Solution {
	public int findMin(int[] num){
		if(num==null||num.length==0){
			return 0;
		}
		int s=0;
		int e=num.length-1;
		int min=num[0];
		int m;
		while(s<e-1){
			m=(s+e)/2;
			if(num[s]<num[m]){
				min=Math.min(num[s], min);
				s=m+1;
			}
			else if(num[s]>num[m]){
				min=Math.min(num[m], min);
				e=m-1;
			}
			else{
				s++;
			}
		}
		min=Math.min(num[e],min);
		min=Math.min(num[s],min);
		return min;
	}
}
