package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode curr=head;
        int len=1;
        while(curr.next!=null){
            len++;
            cur=cur.next;
        }
        //moved last pointer
        curr.next=head;
        k=k%len; //if k is greater than the total LL
        while(k>0){
            cur=curr.next;
            k--;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
    
}
