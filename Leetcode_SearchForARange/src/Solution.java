import java.util.ArrayList;


public class Solution {
	public int[] searchRange(int[]nums,int target){
		if(nums==null || nums.length==0)
			return null;
		int left=0;
		int right=nums.length-1;
		int[] res=new int[]{-1,-1};
		int pos=0;
		while(left<=right){
			int mid=(left+right)/2;
			pos=mid;
			if(nums[mid]<target){
				left=mid+1;
			}
			else if(nums[mid]>target){
				right=mid-1;
			}
			else{
				res[0]=pos;
				res[1]=pos;
				break;
			}
		}
		if(nums[pos]!=target)
			return res;
		int lleft=0;
		int lright=pos;
		while(lleft<=lright){
			int mid=(lleft+lright)/2;
			if(nums[mid]==target){
				lright=mid-1;
			}
			else
				lleft=mid+1;
			res[0]=lleft;
		}
		if(nums[pos]!=target)
			return res;
		int rleft=pos;
		int rright=nums.length-1;
		while(rleft<=rright){
			int mid=(rleft+rright)/2;
			if(nums[mid]==target){
				rleft=mid+1;
			}
			else
				rright=mid-1;
			res[1]=rright;
		}
		return res;
	}
}
