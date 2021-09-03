package LeetCode.L876_链表的中间结点;

import java.util.List;

/**
 * @author Aduner
 */
public class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode node1 = head;
		ListNode node2 = head;
		int flag = 1;
		while (node2.next != null) {
			node2 = node2.next;
			if (flag++ % 2 == 0) {
				node1 = node1.next;
			}
		}
		if (flag % 2 == 0) {
			node1 = node1.next;
		}
		return node1;
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