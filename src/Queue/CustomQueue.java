package Queue;

public class CustomQueue {
    protected int data[];
    private static final int DEFAULT_SIZE= 10;

    int endPointer = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int value){
        if(isFull()){
            System.out.println("Queue is full!!, Not able to add " + value);
            return false;
        }
        data[endPointer++] = value;
        return true;
    }
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty!!");
        }
        return data[0];
    }
    public void printQueue() throws Exception {
        for (int i = 0; i < endPointer; i++) {
            System.out.print(data[i]+" <-");
        }
        System.out.println("END");
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty!!");
        }
        int removed = data[0];
        for (int i = 1; i < endPointer; i++) {
            data[i-1] = data[i];
        }endPointer--;

        return removed;
    }
    boolean isFull(){
        return endPointer==data.length; // pointer is at last index
    }
    boolean isEmpty(){
        return endPointer==0; // pointer is at first index
    }

    public static void main(String[] args) throws Exception {
        CustomQueue cq = new CustomQueue(5);
        cq.insert(1);
        cq.insert(2);
        cq.insert(3);
        cq.insert(4);
        cq.insert(5);
        cq.insert(55);
        cq.insert(44);
        cq.printQueue();
        cq.remove();                    /// Will remove the front element in the queue
        System.out.println();
        System.out.println("Front: "+ cq.front());
        cq.printQueue();

    }
}
