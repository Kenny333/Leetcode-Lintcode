
public class Solution {
	public TreeNode sortedArrayToBST(int[] num){
		if(num.length==0){
			return null;
		}
		return sort(num,0,num.length-1);
	}
	TreeNode sort(int[]num,int start,int end){
		if(start>end)
			return null;
		int mid=(start+end)/2;
		TreeNode root=new TreeNode(num[mid]);
		root.left=sort(num,start,mid-1);
		root.right=sort(num,mid+1,end);
		return root;
		}
}
