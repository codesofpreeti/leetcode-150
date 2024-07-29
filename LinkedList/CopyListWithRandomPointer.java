import java.util.HashMap;

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;

        Node pointer=head;//to iterate
        Node prev=null;
        Node copy=null;// to return

        // using Hahsmap to add address of every random pointer corresponding to pointer in current
        Map<Node,Node> hm= new HashMap<>();

        //iterating over the LL and creating the new LL
        while(pointer!=null){
            Node newNode= new Node(pointer.val);
            hm.put(pointer,newNode);
            if(copy==null){
                copy=newNode;
                prev=copy;
            }
            else{
                prev.next=newNode;
                prev=newNode;
            }
            pointer=pointer.next;
        }

        //Attaching the random pointer to the new LL
        pointer=head;
        Node copyPointer=copy;
        while(pointer!=null){
            if(pointer.random==null){
                copyPointer.random=null;
            }
            else{
                copyPointer.random=hm.get(pointer.random);
            }
            pointer=pointer.next;
            copyPointer=copyPointer.next;
        }

        return copy;
    }
}