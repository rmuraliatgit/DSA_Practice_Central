package LinkedList;

public class LinkedList {

     static class Node {
         int value;
         Node next;
         Node(int value) {
            this.value = value;
        }
         Node(int value, Node node){
            this.value = value;
            this.next =  node;
        }
    }
     Node head;
    public LinkedList(Node head) {
        this.head = head;
    }

    void Print(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp = temp.next;
        }
        System.out.print("END");
    }
     void insertAtLast(Node node){
        Node temp = this.head;
        while(temp!=null){
            if(temp.next==null){
                temp.next=node;
                node.next=null;
                break;
            }
            temp=temp.next;
        }
    }
    void delete(Node node){
        Node temp = this.head;
        while(temp!=null){
            if(temp.next.value==node.value ){
                 temp.next=temp.next.next;
                 break;
            }
            temp=temp.next;
        }
    }
    void insertAtFirst(Node node){
        Node temp = this.head;
        this.head = node;
        node.next = temp;
    }

    void insertInBetween(Node insertAfter, Node insert){
        Node temp = this.head;
        while(temp!=null){
            if(temp.next.value==insertAfter.value){
                Node t =temp.next.next;
                temp.next.next = insert;
                insert.next=t;
                break;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
            Node n = new Node(1);
            LinkedList ll = new LinkedList(n);
            ll.head.next = new Node(2);
            ll.Print();System.out.println();
            ll.insertAtLast(new Node(5));
            ll.Print();System.out.println();
            ll.delete(new Node(2));
            ll.Print();System.out.println();
            ll.insertAtFirst(new Node(9));
            ll.Print();System.out.println();
            ll.insertInBetween(new Node(1),new Node(11));
            ll.Print();System.out.println();
    }
}
