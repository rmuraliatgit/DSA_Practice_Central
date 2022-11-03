package LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    void insertAtLast(int value){
        Node node =  new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    void print(){
        Node node = head;
       if(head!=null){
           do{
               System.out.print(node.value+"--> ");
                node=node.next;
           }while(node!=head);
           System.out.println("END");
       }
    }
    void delete(int value){
        Node node = head;
        if(node==null)return;
        if(node.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            if (node.next.value == value) {
                node.next = node.next.next;
            }
            node = node.next;
        } while (node != head);
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtLast(1);
        cll.insertAtLast(2);
        cll.insertAtLast(3);
        cll.insertAtLast(4);
        cll.insertAtLast(5);
        cll.print();
        cll.delete(1);
        System.out.println();
        cll.print();
    }

}