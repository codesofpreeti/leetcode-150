package LinkedList;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head; // if it is pointing to same, return the head only 

        ListNode leftstart=null, leftPrev=null; 
        ListNode rightStart=null, rightNext=null;

        int i=1;
        ListNode current=head;
        
        while(current!=null && i<=right){
            if(i<left){
                leftPrev=current;
            }
            if(i==left){
                leftstart=current;
            }
            if(i==right){
                rightStart=current;
                rightNext=current.next;
            }
            current=current.next;
            i++;
        }
        //end of while loop

        rightStart.next=null;
        rightStart=reverseLL(leftstart);

        if(leftPrev!=null){
            leftPrev.next=rightStart;
        }
        else head=rightStart;

        leftstart.next=rightNext;
        return head;
        
    }
    public ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nex= curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
    
}
