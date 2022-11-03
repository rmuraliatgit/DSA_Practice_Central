package LinkedList;

public class DoublyLinkedList {

    private Node head;
    private static class Node{
        private int value;
        private Node next;
        private Node previous;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    void insertAtFirst(int value){
        if(head==null){
            Node temp = new Node(value);
            head=temp;
        }
        else{
            Node temp = new Node(value);
            temp.next=head;
            head.previous=temp;
            this.head = temp;
        }
    }
    void print(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp=temp.next;
        }
        System.out.print("END");
        Node last= null;
        while(last!=null){
            System.out.println("asdf");
            System.out.print(last.value+"-->");
            last=last.previous;
        }
    }
    Node find(int value){
        Node node = this.head;
        while(node!=null){
            if(node.value==value)return node;
            node=node.next;
        }return null;
    }
    void insertInBetween(int valueToBeInserted, int whereToBeInserted){

        Node node = new Node(valueToBeInserted);
        Node found = find(whereToBeInserted);
        if(found==null ) {
            System.out.println(whereToBeInserted+" does not exists, hence not able to insert: "+valueToBeInserted);return;
        }
        Node next = found.next;
        found.next = node;
        node.previous = found;
        node.next = next;
        next.previous = node;

    }
    void insertAtLast(int value){
        Node temp = this.head;
        while(temp!=null){
            if(temp.next==null){
                temp.next = new Node(value);
                break;
            }
            temp = temp.next;
        }
    }
    void delete(int value){
        Node temp = this.head;
        if(temp.value==value){             // delete at first
            temp.next.previous=null;
            head=temp.next;
        }
        else {
            while (temp != null) {
                if(temp.next.value==value && temp.next.next==null){   //delete at last
                    temp.next=null;break;
                }
                 if (temp.value == value) {                           // delete in between
                    temp.previous.next = temp.next;
                    temp.next.previous = temp.previous;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst(1);
        dll.insertAtFirst(2);
        dll.insertAtFirst(3);
        dll.insertAtFirst(4);
        //dll.print();
        dll.insertAtLast(0);
        //dll.print();
        //dll.delete(2);
        dll.print();
        System.out.println();
        dll.insertInBetween(9,3545);
        dll.print();
    }
}
