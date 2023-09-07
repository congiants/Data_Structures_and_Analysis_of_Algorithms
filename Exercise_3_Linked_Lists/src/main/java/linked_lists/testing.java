package linked_lists;

public class testing {
    
    public Student maxScore(LinkedList l, Student s)throws ListEmptyException{
        Node currentN = l.getFirstNode();
        Student currentS = (Student)l.getFirstNode().getData();
        int counter =0;
        double max = currentS.getScore();
        while(currentN.getNext() != null){
        
            if(currentN.getNext() == null){
                if (currentS.getScore() > max){
                //max = currentS.getScore();
                break;
                }
                return currentS;
            }
            
            if (currentS.getScore() > max){
                max = currentS.getScore();
            }
            currentS = (Student)currentN.getNext().getData();
            currentN =currentN.getNext();
            counter++;
        }
        System.out.println(max);
        System.out.println(counter); 
        return currentS;
    }

    public static void main(String[] args) {
        
        /*
        l.insertFirst("A");
        l.insertLast("B");
        l.insertLast("C");
        l.insertLast("D");
        
        l.printList();
        System.out.println("=================");
        
        l.removeFirst();
        l.removeLast();
        
        
        l.printList();
        System.out.println("=================");
        
        LinkedList l2 = new LinkedList();
        
        l2.insertFirst("A");
        l2.insertFirst("B");
        l2.insertFirst("C");
        l2.insertFirst("D");

        l2.printList();
        System.out.println("=================");
        
        System.out.println(l2.size());
        System.out.println("=================");
        
        l2.bubbleSort();
        l2.printList();
        System.out.println("=================");
        
        System.out.println(l2.maxOfList());
        System.out.println("=================");
        
        System.out.println(l2.exists("a"));
        System.out.println("=================");
        
        System.out.println(l2.isEmpty());
        System.out.println("=================");
    
        l2.removeFirst();
        l2.removeLast();
        l2.removeFirst();
        l2.removeLast();
        System.out.println(l2.isEmpty());
        System.out.println("================="); */        
        
        LinkedList l = new LinkedList();
        
        Student s1 = new Student(1, "Areos Nikos", 20, 'm', 1, 9);
        Student s2 = new Student(2, "Areos Giorgos", 24, 'm', 1, 5);
        Student s3 = new Student(3, "Areos Maria", 19, 'f', 1, 6);
        Student s4 = new Student(4, "Areos Fanis", 21, 'm', 0, 7);
        
        Student s5 = new Student(5, "Bareos Nikos", 21, 'm', 0, 9);
        Student s6 = new Student(6, "Bareos Giorgos", 22, 'm', 0, 10);
        Student s7 = new Student(7, "Bareos Maria", 18, 'f', 5, 6);
        Student s8 = new Student(8, "Bareos Fanis", 25, 'm', 4, 7);
        
        Student s9 = new Student(9, "Gareos Nikos", 27, 'm', 5, 9);
        Student s10 = new Student(10, "Gareos Giorgos", 22, 'm', 5, 4);
        Student s11 = new Student(11, "Gareos Maria", 19, 'f', 5, 2);
        Student s12 = new Student(12, "Gareos Fanis", 20, 'm', 5, 13);
        
        l.insertFirst(s1);
        l.insertLast(s2);
        l.insertLast(s3);
        l.insertLast(s4);
        l.insertLast(s5);
        l.insertLast(s6);
        l.insertLast(s7);
        l.insertLast(s8);
        l.insertLast(s9);
        l.insertLast(s10);
        l.insertLast(s11);
        l.insertLast(s12);
        
        l.printList();
        System.out.println("=================");
        
        System.out.println(l.size());
        System.out.println("=================");
        
        //Highers score of student
        Node currentN = l.getFirstNode();
        Student currentS = (Student)l.getFirstNode().getData();
        int counter =0;
        double max = currentS.getScore();
        while(currentN!= null){
        
            if(currentN.getNext() == null){
                if (currentS.getScore() > max){
                max = currentS.getScore();
                }
                counter++;
                break;
            }
            
            if (currentS.getScore() > max){
                max = currentS.getScore();
            }
            currentS = (Student)currentN.getNext().getData();
            currentN =currentN.getNext();
            counter++;
        }
        System.out.println(max);
        System.out.println(counter);
        System.out.println(currentS);
        
        
    }
}
