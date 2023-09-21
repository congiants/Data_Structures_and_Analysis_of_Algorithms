package heap;

import java.util.Arrays;

public class testing {

    public static void main(String[] args) {
        Heap h = new Heap(10);
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 =4;
        int n5 =5;
        int n6 = 6;
        int n7 = 7;
        int n8 = 8;
        int n9 = 9;
        
        h.insert(n1);
        h.insert(n2);
        h.insert(n3);
        h.insert(n4);
        h.insert(n5);
        h.insert(n6);
        h.insert(n7);
        h.insert(n8);
        h.insert(n9);
        
        h.printHeap();
        
        System.out.println("=======");
        Object t = h.Hsort();
        System.out.println(Arrays.toString(h.Hsort()));
    }
}
