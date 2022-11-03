package Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int value){
        if(this.isFull()){

            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(startPointer+i)%data.length];
            }
            startPointer = 0;
            endPointer = data.length;
            data = temp;
        }
        return super.insert(value);
    }
}
