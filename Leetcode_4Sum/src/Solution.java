
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target){
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums==null || nums.length<4)
			return res;
		Arrays.sort(nums);
		for(int i=0;i<=nums.length-4;i++){
			if(i==0 || nums[i]!=nums[i-1]){
				for(int j=i+1;j<=nums.length-3;j++){
					if(j==i+1 || nums[j]!=nums[j-1]){
					int low = j+1;
					int high = nums.length-1;
					while(low<high){
						int sum=nums[i]+nums[j]+nums[low]+nums[high];
						if(target==sum){
							ArrayList<Integer> unit = new ArrayList<Integer>();
							unit.add(nums[i]);
							unit.add(nums[j]);
							unit.add(nums[low]);
							unit.add(nums[high]);
							res.add(new ArrayList<Integer>(unit));
							
							low++;
							high--;
							while(low<high && nums[low]==nums[low-1])
								low++;
							while(low<high && nums[high]==nums[high+1])
								high--;
						}
						else if(target>sum)
							low++;
						else
							high--;
					}
					}
				}
			}
		}
		return res;
	}
}
