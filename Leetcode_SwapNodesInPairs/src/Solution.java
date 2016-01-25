
public class Solution {
	public ListNode swapPairs(ListNode head){
		if(head==null)
			return null;
		ListNode fakehead=new ListNode(-1);
		fakehead.next=head;
		ListNode p1=fakehead;
		ListNode p2=head;
		
		while(p2!=null && p2.next!=null){
			p1.next=p2.next;
			p2.next=p2.next.next;
			p1.next.next=p2;
			p1=p2;
			p2=p2.next;
		}
		return fakehead.next;
	}
}
