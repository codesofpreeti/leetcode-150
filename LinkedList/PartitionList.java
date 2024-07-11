package LinkedList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode left=new ListNode(0);
        ListNode right= new ListNode(0);

        ListNode leftEnd=left;
        ListNode rightEnd=right;
        while(head!=null){
            if(head.val<x){
                leftEnd.next=head;
                leftEnd=leftEnd.next;
            }
            else{
                rightEnd.next=head;
                rightEnd=rightEnd.next;
            }
            head=head.next;
        }
        rightEnd.next=null;
        leftEnd.next=right.next;
        return left.next;
    }
}
