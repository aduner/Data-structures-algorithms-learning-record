package LeetCode.L445_两数相加II;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

/**
 * @author Aduner
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Deque<Integer> stack1 = new ArrayDeque();
		Deque<Integer> stack2 = new ArrayDeque();
		while (l1 != null) {
			stack1.push(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			stack2.push(l2.val);
			l2 = l2.next;
		}
		int carry = 0;
		ListNode head = null;
		while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
			int sum = carry;
			sum += stack1.isEmpty() ? 0 : stack1.pop();
			sum += stack2.isEmpty() ? 0 : stack2.pop();
			ListNode node = new ListNode(sum % 10);
			node.next = head;
			head = node;
			carry = sum / 10;
		}
		return head;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}