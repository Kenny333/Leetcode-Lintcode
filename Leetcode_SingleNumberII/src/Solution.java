import java.util.HashMap;


public class Solution {
	public int singleNumber(int[] A){
		/*int count[]=new int[32];
		int result=0;
		for(int i=0;i<32;i++){
			for(int j=0;j<A.length;j++){
				if(((A[j]>>i)&1)==1){
					count[i]=(count[i]+1)%3;
				}
			}
			result |=(count[i]<<i);
		}
		return result;*/
		HashMap<Integer,Integer> map=new HashMap<>();
		int count=1;
		for(int i=0;i<A.length;i++){
			if(map.containsKey(A[i])){
				map.put(A[i], count+1);
			}
			else{
				map.put(A[i], count);
			}
		}
		for(int item:map.keySet()){
			if(map.get(item)==1){
				return item;
			}
		}
		return -1;
	}
}
