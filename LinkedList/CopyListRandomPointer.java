package LinkedList;

public class CopyListRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null)
            return head;
        Node pointer = head;// to iterate
        // step 1: add new duplicate pointers next to original ones
        while (pointer != null) {
            Node remains = pointer.next;
            pointer.next = new Node(pointer.val);
            pointer.next.next = remains;
            pointer = remains;
        }
        // step 2: attach random pointers to them
        pointer = head;
        while (pointer != null && pointer.next != null) {
            if (pointer.random == null) {
                pointer.next.random = null;
            } else{
                pointer.next.random = pointer.random.next;
            }
            pointer=pointer.next.next;
        }
        // step 3: remove the original and copy wali stuff
        Node copy = head.next;
        Node copyIter = copy;
        pointer = head;
        while (pointer != null && copyIter != null) {
            pointer.next = (pointer.next == null) ? null : pointer.next.next;
            copyIter.next = (copyIter.next == null) ? null : copyIter.next.next;

            pointer = pointer.next;
            copyIter = copyIter.next;
        }

        // step 4: return the ans
        return copy;
    }
}