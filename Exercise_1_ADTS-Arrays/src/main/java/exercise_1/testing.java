
package exercise_1;

public class testing {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Areos Nikos", 20, 'm', 1, 9);
        Student s2 = new Student(2, "Areos Giorgos", 24, 'm', 1, 5);
        Student s3 = new Student(3, "Areos Maria", 19, 'f', 1, 6);
        Student s4 = new Student(4, "Areos Fanis", 21, 'm', 0, 7);
        
        Student s5 = new Student(5, "Bareos Nikos", 20, 'm', 0, 9);
        Student s6 = new Student(6, "Bareos Giorgos", 24, 'm', 0, 10);
        Student s7 = new Student(7, "Bareos Maria", 19, 'f', 5, 6);
        Student s8 = new Student(8, "Bareos Fanis", 21, 'm', 4, 7);
        
        Student s9 = new Student(9, "Gareos Nikos", 20, 'm', 5, 9);
        Student s10 = new Student(10, "Gareos Giorgos", 24, 'm', 5, 4);
        Student s11 = new Student(11, "Gareos Maria", 19, 'f', 5, 2);
        Student s12 = new Student(12, "Gareos Fanis", 21, 'm', 5, 7);
        
        Lab l1 = new Lab("1o", 5);
        Lab l2 = new Lab("2o", 20);
        Lab l3 = new Lab("3o", 20);
        
        LaboratoryCourse L = new LaboratoryCourse("Data Structures and Algorithms", 3);
        
        l1.insert(s1);
        l1.insert(s2);
        l1.insert(s3);
        l1.insert(s4);
        
        l2.insert(s5);
        l2.insert(s6);
        l2.insert(s7);
        l2.insert(s8);
        
        l3.insert(s9);
        l3.insert(s10);
        l3.insert(s11);
        l3.insert(s12);
        /*
        l1.attendance();
        
        l1.avgScore();
        l1.passedLab();
        l1.failedLab();
        l1.findStudent(1);
        l1.findStudent(7);
        l1.delete(s1);
        */
        l1.attendance();
        
        L.insert(l1);
        L.insert(l2);
        L.insert(l3);
        
        L.studentNumber();
        L.passFail();
        L.averageGrade();
        L.passFailRatio();
        
        //l1.passedLabRatio();
        
    }
}