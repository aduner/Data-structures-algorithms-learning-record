package JOffer.J06_从尾到头打印链表;

public class Solution {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }
        int[] result = new int[len];
        node = head;
        for (int i = len - 1; i >= 0; i--) {
            result[i] = node.val;
            node = node.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(3);
        head.next.next=new ListNode(2);
        Solution s=new Solution();
        for(int n:s.reversePrint(head)){
            System.out.println(n);
        }
    }
}
