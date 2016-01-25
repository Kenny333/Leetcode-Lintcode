
public class Solution {
	int m=0;
	int n=0;
	/*Solution(int m,int n){
		this.m=m;
		this.n=n;
	}*/
	public static int unique(int m,int n){
		if(m<0||n<0)
			return 0;
		if(m==0||n==0)
			return 0;
		if(m==1||n==1)
			return 1;
		int [][] arr=new int[m][n];
		for(int i=0;i<n;i++){
			arr[0][i]=1;
		}
		for(int i=0;i<m;i++){
			arr[i][0]=1;
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				arr[i][j]=arr[i-1][j]+arr[i][j-1];
			}
		}
		return arr[m-1][n-1];
	}
}
