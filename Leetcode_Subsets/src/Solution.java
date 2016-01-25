import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	public List<List<Integer>> subsets(int[] s){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> tmp = new ArrayList<Integer>();
		
		if(s==null || s.length==0){
			return res;
		}
		Arrays.sort(s);
		dfs(s,tmp,res,0);
		return res;
	}
	public void dfs(int[] s,List<Integer> tmp,List<List<Integer>> res,int pos){
		for(int i=pos;i<s.length;i++){
			tmp.add(s[i]);
			res.add(new ArrayList<Integer>(tmp));
			dfs(s,tmp,res,i+1);
			tmp.remove(tmp.size()-1);
			
		}
	}
}
