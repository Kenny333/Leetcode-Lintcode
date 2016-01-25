
public class Solution {
	public String countAndSay(int n){
		if(n<=0){
			return null;
		}
		String s="1";
		int num=1;
		for(int j=0;j<n-1;j++){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i+1) && i<s.length()-1){
				num++;
			}else{
				sb.append(num+""+s.charAt(i));
				num=1;
			}
		}
		s=sb.toString();
		}
		return s;
		}
}
