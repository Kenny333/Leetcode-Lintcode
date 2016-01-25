import java.util.Arrays;
import java.util.HashSet;


public class Solution {
	public int lengthOfLongestSubstring(String s){
		if(s == null||s.length() == 0){
			return 0;
		}
		HashSet<Character> set = new HashSet<Character>();
		int slow = 0;
		int max = 0;
		for(int fast = 0;fast<s.length();fast++){
			if(set.contains(s.charAt(fast))){
				while(slow<fast && s.charAt(slow)!= s.charAt(fast)){
					set.remove(s.charAt(slow));
					slow++;
				}
				slow++;
			}
			else{
				set.add(s.charAt(fast));
				max = Math.max(max, fast-slow+1);
			}
		}
		return max;
	}
}
