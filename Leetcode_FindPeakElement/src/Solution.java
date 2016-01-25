
public class Solution {
	public static int findPeakElement(int[] num){
		int l=0;
		int r=num.length-1;
		while(l<=r){
			if(l==r)return l;
			int mid=(l+r)/2;
			if(num[mid]>num[mid+1]){
				r=mid;
			}
			else{
				l=mid+1;
			}
		}
		return l;
	}
	public static void main(String args[]){
		int[] arr={1,3,4,5,1};
		System.out.println(findPeakElement(arr));
	}
}
