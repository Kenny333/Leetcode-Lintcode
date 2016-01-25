import java.util.HashMap;


public class Solution {
	public boolean containsNearbyDuplicate(int[]nums,int k){
		if(nums==null || nums.length<2)
			return false;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int j = map.get(nums[i]);
				if(i-j<=k){
					return true;
				}
				else{
					map.put(nums[i], i);
				}
			}
			else{
				map.put(nums[i], i);
			}
		}
		return false;
	}
}
