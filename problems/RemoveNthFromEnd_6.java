package com.mustdo.problems;

public class RemoveNthFromEnd_6 {
	
	
	public void removeNthFromEnd(ListNode head, int k) {
		
		ListNode sl_ptr = head;
		ListNode ft_ptr = head;
		
		for(int i=0; i<k;i++) {
			ft_ptr = ft_ptr.next;
		}
		
		while(ft_ptr.next!=null) {
			
			sl_ptr = sl_ptr.next;
			ft_ptr = ft_ptr.next;
		}
		
		sl_ptr.next = sl_ptr.next.next;
		
	}
	
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }

}
