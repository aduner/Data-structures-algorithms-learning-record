package JOffer.J23_反转链表;

/**
 * @author Aduner
 */
public class Solution {
    /**
     * 双指针迭代
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode fastNode = head.next;
        ListNode lowNode=head;
        lowNode.next=null;
        ListNode temp;
        while (fastNode.next!=null){
            temp=fastNode.next;
            fastNode.next=lowNode;
            lowNode=fastNode;
            fastNode=temp;
        }
        fastNode.next=lowNode;
        return fastNode;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}