package Queue;

public class CircularQueue extends CustomQueue{

     protected int data[];
     private static final int DEFAULT_SIZE= 10;
     protected int endPointer = 0;
     protected int startPointer = 0;

     protected int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value){
        if(isFull()){
            System.out.println("Queue is full!!, Not able to add " + value);
            return false;
        }
        data[endPointer++] = value;
        endPointer = endPointer % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        int removed = data[startPointer++];
        startPointer = startPointer % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        return data[startPointer];
    }
    public void printQueue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        int i = startPointer;
        do{
            System.out.print(data[i]+ "->");
            i++;
            i %= data.length;
        }while(i!=endPointer);
        System.out.println("End");
    }
    boolean isFull(){
        return size == data.length; // pointer is at last index
    }
    boolean isEmpty(){
        return size == 0; // pointer is at first index
    }

    public static void main(String[] args) throws Exception {
        CircularQueue cq = new DynamicQueue(5);
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.printQueue();
        cq.remove();
        cq.printQueue();
        System.out.println(cq.front());
        cq.insert(6);
        cq.insert(7);
        cq.insert(8);
        cq.printQueue();
    }
}
