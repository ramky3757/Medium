package com.mustdo.problems;

import java.util.List;

import com.mustdo.problems.Merge2SortedLists_8.ListNode;

public class MergeKSortedLists_9 {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	public ListNode mergeTwoLists(ListNode p1, ListNode p2) {
		ListNode head = new ListNode(0);
		
		while(p1!=null && p2!=null) {
			
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
		
		return head.next;
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		
		if(lists.length==1){
	        return lists[0];
	    }
	    if(lists.length==0){
	        return null;
	    }
	    
	    ListNode head = mergeTwoLists(lists[0], lists[1]);
	    
	    for(int i=2; i<lists.length;i++) {
	    	head = mergeTwoLists(head, lists[i]);
	    }
	    
	    return head;
	}

}
