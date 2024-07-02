package LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode fast=head;
        ListNode slow=head.next;

        while(slow!=fast){
            if(fast==null || fast.next==null) return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
    
}
