package stack;

public class ArrayStack implements Stack{
    private static int CAPACITY = 100;
    private int capacity;
    private Object stack[];
    private int top = -1;
    
    public ArrayStack(){
        this(CAPACITY);
    }
    
    public ArrayStack(int capacity){
        this.capacity = capacity;
        stack = new Object[capacity];
    }

    @Override
    public int size() {
        return (top+1);
    }
    
    @Override
    public boolean isEmpty() {
        return (top < 0);
    }

    @Override
    public boolean isFull() {
        return (top == capacity-1);
    }

    @Override
    public Object top() throws StackEmptyException {
        if (isEmpty()){
            throw new StackEmptyException("Stack is empty.");
        }
        return stack[top];
    }

    @Override
    public void push(Object item) throws StackFullException {
        if (isFull()){
            throw new StackFullException("Stack overflow.");
        }
        
        stack[++top] = item;
    }

    @Override
    public Object pop() throws StackEmptyException {
        Object item;
        if (isEmpty()){
            throw new StackEmptyException("Stack is empty.");
        }
        item = stack[top];
        stack[top--] = null;
        return item;
    }
    
    
}
