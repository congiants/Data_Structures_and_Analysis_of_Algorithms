package heap;

public class Heap implements HeapInterface{
    private Object btree[];
    private int capacity;
    private static int CAPACITY = 1000;
    private int index;

    public Heap() {
        this(CAPACITY);
    }

    public Heap(int capacity) {
        this.capacity = capacity;
        btree = new Object [capacity+1];
        index = 0;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public boolean isFull() {
        return index == capacity;
    }

    @Override
    public void insert(Object item) throws HeapFullException {
        if (isFull()) throw new HeapFullException("Heap is full");
        index++;
        btree[index] = item;
        System.out.println(index);
        if (index >1){
            int father = index /2;
            int son = index;
            Comparable coFather = (Comparable)btree[father];
            Comparable coSon = (Comparable)btree[son];            
            while(coFather.compareTo(coSon) < 0){
                Object tempO = btree[father];
                btree[father] = btree[son];
                btree[son] = tempO;
                son = father;
                father = son/2;
                coFather = (Comparable)btree[father];
                coSon = (Comparable)btree[son];
                if (son <=1)break;
            }
        }
    }

    @Override
    public Object remove() throws HeapEmptyException {
        if (isEmpty()) throw new HeapEmptyException("Heap is empty");
        int father =1;
        Object removeObject= btree[father];
        btree[father] = btree[index];
        btree[index] = null;
        index --;
        int son = father * 2;
        Comparable coSon1 = (Comparable)btree[son];
        Comparable coSon2 = (Comparable)btree[son +1]; 
        if (index > 2 && coSon1.compareTo(coSon2) < 0) {
             son = father * 2 + 1;
        }
        Comparable coFather = (Comparable)btree[father];
        Comparable coSon = (Comparable)btree[son];
            while(son < index && coFather.compareTo(coSon) < 0){
                Object temp = btree[father];
                btree[father] = btree[son];
                btree[son]=temp;
                father = son;
                son = 2 * father;
                coSon1 = (Comparable)btree[son];
                coSon2 = (Comparable)btree[son +1];
                if (son < index && coSon1.compareTo(coSon2) < 0) {
                    son = father * 2 + 1;
                }
            }
            return removeObject;
    }    
    /*
     10
     /   \
   5     3
  /  \
4    1
    */ 
    
    public void printHeap(){
        for (int i =0; i < index; i++){
            System.out.println(btree[i]);
            
        }
    }

    public Object[] getBtree() {
        return btree;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public int getIndex() {
        return index;
    }

    public void setBtree(Object[] btree) {
        this.btree = btree;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    
}
