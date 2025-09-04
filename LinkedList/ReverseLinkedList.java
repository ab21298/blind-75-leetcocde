package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.printList(linkedList.head);
        linkedList.printList(solve(linkedList.head));
    }
    public static Node solve(Node head){
        if(head == null) return null;
        Node prev = null,next = null;
        Node current = head;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
