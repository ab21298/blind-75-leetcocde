package LinkedList;

public class LinkedList {
    Node head;
    public void add(int data){
        Node node = new Node(data);
        Node temp;
        if(head != null){
            temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }else{
            head = node;
        }
    }
    public void printList(Node head){
        Node temp;
        if(head == null){
            return;
        }
        temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
