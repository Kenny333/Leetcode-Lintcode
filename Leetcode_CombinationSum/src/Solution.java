import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,int target){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> item = new ArrayList<Integer>();
		Arrays.sort(candidates);
		helper(candidates,target,0,res,item);
		return res;
	}
	private void helper(int []candidates,int ntarget,int start,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> item){
		if(ntarget<0){
			return;
		}
		if(ntarget==0){
			res.add(item);
			return;
		}
		for(int i=start;i<candidates.length;i++){
			if(i>0 && candidates[i]==candidates[i-1])
				continue;
			item.add(candidates[i]);
			int newtarget=ntarget-candidates[i];
			helper(candidates,newtarget,i,res,item);
			
			item.remove(item.size()-1);
		}
	}
}
