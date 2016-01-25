
public class Solution {
	public boolean canJump(int[] nums){
		if(nums.length<=1)
			return true;
		if(nums[0]>=(nums.length-1))
			return true;
		int reach = nums[0];
		if(reach==0)
			return false;
		for(int i=1;i<=nums.length;i++){
			if(reach>=i&&(nums[i]+i)>=nums.length-1)
				return true;
			if(reach<=i&&nums[i]==0)
				return false;
			if(nums[i]+i>reach)
				reach = nums[i]+i;
		}
		return false;
		
	}
}
