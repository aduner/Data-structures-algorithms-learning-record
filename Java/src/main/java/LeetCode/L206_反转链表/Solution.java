package LeetCode.L206_反转链表;

/**
 * @author Aduner
 */
public class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev=null;
		ListNode node=head;
		while (node!=null){
			ListNode nextNode=node.next;
			node.next=prev;
			prev=node;
			node=nextNode;
		}
		return prev;
	}
	
}
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
