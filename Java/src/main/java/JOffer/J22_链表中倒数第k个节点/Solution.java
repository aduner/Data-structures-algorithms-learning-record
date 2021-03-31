package JOffer.J22_链表中倒数第k个节点;

/**
 * @author Aduner
 */
public class Solution {
    /**
     * 常规双循环
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        int len=1;
        ListNode node = head;
        while (node.next!=null){
            node=node.next;
            len++;
        }
        if(len<=k) return head;
        node=head;
        for(int i=0;i<len-k;i++){
            node=node.next;
        }
        return node;
    }

    /**
     * 快慢指针
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode low = head;
        ListNode fast = head;
        for(int i=1;i<k;i++){
            if (fast.next==null) return head;
            fast=fast.next;
        }
        while (fast.next!=null){
            low=low.next;
            fast=fast.next;
        }
        return low;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
