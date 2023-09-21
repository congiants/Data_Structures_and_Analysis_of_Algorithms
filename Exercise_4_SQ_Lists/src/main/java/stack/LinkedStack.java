package stack;

public class LinkedStack implements Stack{
    
    LinkedList S;

    public LinkedStack() {
        S = new LinkedList();
    }

    @Override
    public boolean isEmpty() {
        return(S.isEmpty());
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (S.isEmpty()) throw new StackEmptyException("Stack is empty");
        return S.removeFirst();       
    }

    @Override
    public void push(Object item) throws StackFullException {
        S.insertFirst(item);
    }

    @Override
    public int size() {
        return S.size();
    }

    @Override
    public Object top() throws StackEmptyException {
        if (S.isEmpty()) throw new StackEmptyException("Stack is empty");
        Object top = S.getFirstNode().getData();
        return top;
    }

    
}
