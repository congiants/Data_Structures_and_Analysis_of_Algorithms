package linked_lists;

public class LinkedList implements List{

    private Node firstNode, lastNode;
    
    public LinkedList() {
        firstNode=lastNode=null;
    }

    @Override
    public boolean isEmpty() {
        return(firstNode==null);
    }        
    
    @Override
    public int size() {
        Node current = firstNode;
        int size=0;
        while(current!= null){
            current=current.getNext();
            size++;
        }
        return size;
    }
    
    @Override
    public void insertFirst(Object data) {
        if(isEmpty()){
            firstNode = lastNode = new Node(data, null);
        }
        else{
            firstNode = new Node(data, firstNode);
        }
        
    }

    @Override
    public void insertLast(Object data) {
        if (isEmpty()){
            firstNode = lastNode = new Node(data, null);
        }
        else{
            lastNode.setNext(new Node(data, null));
            lastNode = lastNode.getNext();
        }
    }

    @Override
    public Object removeFirst() throws ListEmptyException {
        if (isEmpty()) throw new ListEmptyException("List is empty");
        Object returnData = firstNode.getData();
        if (firstNode == lastNode){
            firstNode = lastNode = null;
            return returnData;
        }
        else{
            firstNode = firstNode.getNext();
            return returnData;
        }
    }

    @Override
    public Object removeLast() throws ListEmptyException {
        if (isEmpty()) throw new ListEmptyException("List is empty");
        Object returnData = lastNode.getData();
        if (firstNode == lastNode){
            firstNode = lastNode = null;
            return returnData;
        }
        else{
            Node current = firstNode;
            while(current.getNext() != lastNode){
                current=current.getNext();
            }
            lastNode = current;
            lastNode.setNext(null);
        }
        return returnData;
    }
    
    public Object maxOfList() throws ListEmptyException{
        if (isEmpty()) throw new ListEmptyException("List is empty");
        Node current = firstNode;
        Object max = firstNode.getData();
        while(current != null){
            Comparable coMax = (Comparable)max;
            Comparable coCur = (Comparable)current.getData();            
            if(coMax.compareTo(coCur)>0) max=current.getData();
            current=current.getNext();
        }
        return max;
    }

    public Boolean exists(Object Data) throws ListEmptyException{
        if (isEmpty()) throw new ListEmptyException("List is empty");
        Node current = firstNode;
        while(current != null){            
            if(current.getData() == Data) return true;
            current=current.getNext();
        }
        return false;
    }
    
    public void sort()throws ListEmptyException{
        if (isEmpty()) throw new ListEmptyException("List is empty");
        Node current, min;
        Node index = firstNode;
        while (index != null){
            current = index;
            min = index;
            while(current != null){
                Comparable coMin = (Comparable)min.getData();
                Comparable coCur = (Comparable)current.getData();            
                if(coCur.compareTo(coMin)<0) min=current;
                current=current.getNext();
            }
            String temp = (String)index.getData();
            index.setData(min.getData());
            min.setData(temp);
            index = index.getNext();
        }
    }
    
    public void bubbleSort()throws ListEmptyException{
        if (isEmpty()) throw new ListEmptyException("List is empty");
        Node current = firstNode;
        while (current != null){
            Node next = current.getNext();
            while(next != null){
                Comparable coNext = (Comparable) next.getData();
                Comparable coCur = (Comparable)current.getData();            
                if(coCur.compareTo(coNext)>0){
                    String temp = (String) current.getData();
                    current.setData(next.getData());
                    next.setData(temp);
                }
                next = next.getNext();
            }        
            current = current.getNext();
        }     
    }
    
    public void printList()throws ListEmptyException{
        if (isEmpty()) throw new ListEmptyException("List is empty");
        Node current = firstNode;
        while (current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }   
    
    public Node getFirstNode() {
        return firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
}
