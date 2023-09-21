package queue;

public class ArrayQueue implements Queue{
    private int first = 0;
    private int last = 0;
    private int capacity;
    private static int CAPACITY = 1000;
    private Object queue[];

    public ArrayQueue(){ 
        this(CAPACITY);
    } 
    
    public ArrayQueue(int cap){ 
        capacity=cap;
         queue=new Object[capacity];
    }
    
    @Override
    public int size() {
        return (last - first);
    }

    @Override
    public boolean isEmpty() {
        return(first == last);
    }

    @Override
    public boolean isFull() {
        return(size()==capacity);
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (isEmpty()) throw new QueueEmptyException("Queue is empty");
        return queue[first];
    }

    @Override
    public void enqueue(Object item) throws QueueFullException {
        if (last == capacity) throw new QueueFullException("Queue overflow");
        queue[last++] = item;
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty()) throw new QueueEmptyException("Queue is empty");
        Object item = queue[first];
        queue[first++] = null;
        return item;
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setLast(int last) {
        this.last = last;
    }
}
