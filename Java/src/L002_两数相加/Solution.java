package L002_两数相加;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode likeList=null,head=null;
        int carry=0,sum,n1,n2;
        while (l1 != null || l2 != null) {
            n1=l1!=null?l1.val:0;
            n2=l2!=null?l2.val:0;
            sum=n1+n2+carry;
            if(likeList==null){
                likeList=head=new ListNode(sum%10);
            }
            else{
                likeList.next=new ListNode(sum%10);
                likeList=likeList.next;
            }
            carry=sum/10;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry>0)
            likeList.next=new ListNode(carry);
        return head;
    }
}