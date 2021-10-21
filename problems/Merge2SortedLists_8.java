package com.mustdo.problems;

public class Merge2SortedLists_8 {
	
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	
	public ListNode mergeLists(ListNode p1, ListNode p2) {
		
		ListNode head = new ListNode(0);
		
		while(p1.next!=null && p2.next!=null) {
			
			if(p1.val < p2.val) {
				
				head.next = p1;
				head = head.next;
				p1 = p1.next;
				
			} else {
				
				head.next = p2;
				head = head.next;
				p2 = p2.next;
			}
		}
		
		while(p1==null) head.next = p2;
		while(p2==null) head.next = p1;
		
		return head;
		
	}

}
