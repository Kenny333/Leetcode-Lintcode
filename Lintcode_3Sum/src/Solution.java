import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public ArrayList<ArrayList<Integer>> threeSum(int[] numbers){
		ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
		if(numbers == null || numbers.length<3){
			return rst;
		}
		Arrays.sort(numbers);
		for(int i = 0;i<numbers.length-2;i++){
			if(i!=0 && numbers[i] == numbers[i-1]){
				continue;
			}
			int left = i+1;
			int right = numbers.length-1;
			while(left<right){
				int sum = numbers[left]+numbers[right]+numbers[i];
				if(sum == 0){
					ArrayList<Integer> tmp = new ArrayList<Integer>();
					tmp.add(numbers[i]);
					tmp.add(numbers[left]);
					tmp.add(numbers[right]);
					rst.add(tmp);
					left++;
					right--;
					while(left<right && numbers[left]==numbers[left-1]){
						left++;
					}
					while(left<right && numbers[right]==numbers[right+1]){
						right--;
					}
				}else if(sum<0){
					left++;
				}else{
					right--;
				}
			}
		}
		return rst;
	}
}
