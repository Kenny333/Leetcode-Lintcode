import java.util.HashSet;


public class Solution {
	public boolean containDuplicate(int[] nums){
		if(nums.length==0||nums==null)
			return false;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(set.contains(nums[i])){
				return true;
			}
			else{
				set.add(nums[i]);
			}
		}
		return false;
	}
}
