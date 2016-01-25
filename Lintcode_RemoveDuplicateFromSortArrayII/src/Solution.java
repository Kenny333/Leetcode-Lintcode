
public class Solution {
	public int removeDuplicates(int[] nums){
		if(nums == null||nums.length == 0)
			return 0;
		int index = 0;
		int count = 0;
		for(int i = 0;i<nums.length;i++){
			if(nums[index]!=nums[i]){
				nums[++index] = nums[i];
			}
			else if(nums[index]==nums[i]&&count<1){
				nums[++index] = nums[i];
				count++;
			}
		}
		return index+1;
	}
}
