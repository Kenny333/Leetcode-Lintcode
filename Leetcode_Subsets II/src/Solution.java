import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	public List<List<Integer>> subsetWithDup(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> item = new ArrayList<Integer>();
		if(nums==null || nums.length==0)
			return res;
		Arrays.sort(nums);
		res.add(item);
		dfs(nums,0,res,item);
		return res;
	}
	private void dfs(int[] nums,int start,List<List<Integer>> res,List<Integer> item){
		for(int i=start;i<nums.length;i++){
			
			item.add(nums[i]);
			res.add(new ArrayList<Integer>(item));
			dfs(nums,i+1,res,item);
			item.remove(item.size()-1);
			while(i<nums.length-1 && nums[i]==nums[i+1]){
				i++;
			}
		}
	}
}
