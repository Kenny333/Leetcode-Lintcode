import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	public ArrayList<ArrayList<Integer>> combinationSum2(int[]candidates, int target){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> item = new ArrayList<Integer>();
		if(candidates==null||candidates.length==0)
			return res;
		Arrays.sort(candidates);
		helper(candidates,0,target,res,item);
		return res;
	}
	private void helper(int[]candidates,int start,int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> item){
		if(target<0){
			return;
		}
		if(target==0){
			res.add(new ArrayList<Integer>(item));
			return;
		}
		for(int i=start;i<candidates.length;i++){
			if(i>0 && candidates[i]==candidates[i-1])
				continue;
			item.add(candidates[i]);
			int newtarget=target-candidates[i];
			helper(candidates,i+1,newtarget,res,item);
			item.remove(item.size()-1);
		}
	}
}
