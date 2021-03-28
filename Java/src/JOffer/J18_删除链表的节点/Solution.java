package JOffer.J18_删除链表的节点;

/**
 * @author Aduner
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val) {
            return head.next;
        }
        ListNode node=head.next;
        ListNode preNode=head;
        while (node.val!=val){
            preNode=node;
            node= node.next;
        }
        preNode.next=node.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}