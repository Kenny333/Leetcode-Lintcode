
public class Solution {
	public ListNode deleteDuplicates(ListNode head){
		if(head==null)
			return head;
		ListNode p=head;
		ListNode cur=p.next;
		while(cur!=null){
			if(p.val==cur.val){
				p.next=cur.next;
				cur=cur.next;
			}else{
				cur=cur.next;
				p=p.next;
			}
		}
		return head;
	}
}
