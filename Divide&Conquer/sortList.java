package Divide&Conquer;

public class sortList {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        temp.next=null;

        ListNode leftWala=sortList(head);
        ListNode rightWala=sortList(slow);

        return merge(leftWala, rightWala);
    }
    public ListNode merge(ListNode left, ListNode right){
        ListNode head= new ListNode(0);
        ListNode temp=head;
        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
            }
            else{
                temp.next=right;
            }
            temp=temp.next;
        }
        while(left!=null){
            temp.next=left;
        }
        while(right!=null){
            temp.next=right;
        }

        return head.next;
    }
    
}
