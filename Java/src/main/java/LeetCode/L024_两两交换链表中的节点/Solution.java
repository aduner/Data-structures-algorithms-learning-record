package LeetCode.L024_两两交换链表中的节点;


import java.util.Objects;

/**
 @author Aduner
 */
public class Solution {
	public ListNode swapPairs(ListNode head) {
		if(Objects.equals(null,head)||Objects.equals(null,head.next)){
			return head;
		}
		ListNode next = head.next;
		head.next = swapPairs(next.next);
		next.next = head;
		return next;
	}
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
