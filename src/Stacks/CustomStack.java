package Stacks;

import java.util.Arrays;

public class CustomStack {
    protected int data[];
    private static final int DEFAULT_SIZE= 10;
    int pointer = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Can't push inside the Stack, Stack is full!!!");
            return false;
        }
        pointer++;
        data[pointer] = value;
        return true;
    }
    void printStack(){
        for (int i = 0; i <=pointer; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an Empty Stack!!!");
        }
//        int removed =  data[pointer];
//        pointer--;
//        return removed;
        return data[pointer--];
    }
    int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an Empty Stack!!!");
        }
        return data[pointer];
    }
    boolean isFull(){
        return pointer==data.length-1; // pointer is at last index
    }
    boolean isEmpty(){
        return pointer==-1; // pointer is at first index
    }
    public static void main(String[] args) throws Exception {
        CustomStack cs = new DynamicStack(5);
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.push(6);
        cs.push(7);
        cs.push(8);
        cs.printStack();
        cs.push(9);
        cs.push(10);
        cs.printStack();
        System.out.println("Popped value: "+cs.pop());
        System.out.println("Peeked value: "+cs.peek());
        cs.printStack();
    }
}
