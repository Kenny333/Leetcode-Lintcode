
public class Solution {
	public int[][] generateMatrix(int n){
		if(n<0)
			return null;
		int[][]res=new int[n][n];
		int k=1;
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=n-1;
		while(left<right && top<bottom){
			for(int i=left;i<right;i++){
				res[top][i] = k++;
			}
			for(int i=top;i<bottom;i++){
				res[i][right]=k++;
			}
			for(int i=right;i>left;i--){
				res[bottom][i]=k++;
			}
			for(int i=bottom;i>top;i--){
				res[i][left]=k++;
			}
			left++;
			right--;
			top++;
			bottom--;
		}
		if(n%2!=0)
			res[n/2][n/2]=k;
		return res;
	}
}
