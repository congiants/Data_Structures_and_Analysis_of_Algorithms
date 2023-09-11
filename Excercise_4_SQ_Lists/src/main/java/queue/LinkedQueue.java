package queue;

public class LinkedQueue implements Queue{
    
    LinkedList Q;

    public LinkedQueue() {
        Q = new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        return(Q.isEmpty());
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void enqueue(Object item){
        Q.insertLast(item);
    }
    
    @Override
    public Object dequeue() throws QueueEmptyException {
        if (Q.isEmpty()) throw new QueueEmptyException("Queue is empty");
        return Q.removeFirst();
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (Q.isEmpty()) throw new QueueEmptyException("Queue is empty");
        return Q.getFirstNode().getData();
    }

    @Override
    public int size() {
        return Q.size();
    }
    
        
    
}
