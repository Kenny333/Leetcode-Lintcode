
public class Solution {
	public int titleToNumber(String s){
		if(s==null||s.length()==0){
			return 0;
		}
		int res=0;
		for(int i=0;i<=s.length()-1;i++){
			char ch=s.charAt(i);
			res=26*res+(ch-'A'+1);
		}
		return res;
	}
}
