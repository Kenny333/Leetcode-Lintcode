
public class Solution {
	public int maxArea(int[] height){
		if(height.length<=1){
			return 0;
		}
		int max=0;
		int l=0;
		int r=height.length-1;
		int area=0;
		while(l<r){
			max=Math.min(height[l], height[r])*(r-l);
			if(area<max){
				area=max;
			}
			if(height[l]<height[r]){
				l++;
			}else{
				r--;
			}
		}
		return max;
	}
}
