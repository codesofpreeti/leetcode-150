package LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode one=l1;
        ListNode two=l2;
        ListNode sumHead=new ListNode(0);
        ListNode temp= sumHead;
        int carry=0;

        while(one!=null && two!=null){
            int s1=(one==null) ? 0: one.val;
            int s2=(two==null)? 0:two.val;
            int sum=s1+s2+carry;
            carry=sum/10;

            ListNode sumTemp= new ListNode(sum%10);
            temp.next=sumTemp;
            temp=temp.next;

            if(one!=null) one=one.next;
            if(two!=null) two=two.next;
        }
        if(carry>0 ) temp.next= new ListNode(carry);
        return sumHead.next;
    }
    
}
