package stack;

public class testing {

    public static void main(String[] args) {
        /*
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
        Student s12 = new Student(12, "Gareos Fanis", 20, 'm', 5, 7);
        
        ArrayStack S = new ArrayStack(3);
        
        S.push(s1);
        S.push(s2);
        S.push(s3);
        //S.push(s4);
        
        System.out.println(S.isEmpty());
        System.out.println(S.isFull());
        
        System.out.println(S.top());
        
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
        //System.out.println(S.pop());
        
        System.out.println(S.isFull());        
        */
        
        Parenthesis P = new Parenthesis();
        
        //P.ParenthesisCheck("((3+5)(");
        P.AdvancedParenthesisCheck("{[}()]}");
    }
}
