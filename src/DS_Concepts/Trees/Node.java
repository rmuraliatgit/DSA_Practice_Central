package DS_Concepts.Trees;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Node {
    int root =1;
    Node left;
    Node right;

    Node(int root){
        this.root = root;
        right = null;
        left = null;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        int n = 16;
        Queue<Node> queue = new LinkedList<>();
       queue.add(new Node(1));
        int i=2;
        while(i<n){
            Node q = queue.peek();
            System.out.print(q.root);
            q.left = new Node(i);
            q.right = new Node(i+1);
            queue.remove(q);
            queue.add(q.left);
            queue.add(q.right);
            i+=2;
        }
//        preOrder(root);
        System.out.println(root.root);
    }
    static void preOrder(Node node){
        if(node==null)return;
        System.out.print(node.root+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
