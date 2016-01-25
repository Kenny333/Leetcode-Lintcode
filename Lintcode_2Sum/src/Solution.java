import java.util.HashMap;

public class Solution {
	public static void main(String args[]){
		int []numbers = {2,11,15,7};
		int target = 9;
		int []ans = twoSum(numbers,target);
		for(int i = 0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
	}
	public static int[] twoSum(int[] numbers, int target){
		int [] indices = {0,0};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<numbers.length;i++){
			if(map.containsKey(target-numbers[i])){
				indices[0] = map.get(target-numbers[i])+1;
				indices[1] = i+1;
				break;
			}
			else{
				map.put(numbers[i], i);
			}
		}
		return indices;
	}
	
}
