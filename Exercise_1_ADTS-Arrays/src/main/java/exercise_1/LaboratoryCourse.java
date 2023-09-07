package exercise_1;

public class LaboratoryCourse implements LaboratoryCourseInterface{
        private String name;
        private int capacity;
        private int size = 0;
        private Lab labList [];

    public LaboratoryCourse() {
    }
    
    public LaboratoryCourse(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        labList = new Lab [capacity];
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public int getSize() {
        return size;
    }

    public Lab[] getlabList() {
        return labList;
    }

    public void setlabList(Lab[] labList) {
        this.labList = labList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean insert(Lab l){
        if (size < capacity){
            labList[size++] = l;
            System.out.println("Lab successfully inserted!");
            return true;
        }
        
        else{
            System.out.println("Reached lab course capacity!");
            return false;
        }
    }

    @Override
    public boolean delete(Lab l){
        for (int i =0; i < size; i++){
            if (labList[i] == l){
                labList[i] = labList[size-1];
                labList[size-1] = null;
                size--;
                System.out.println("Lab successfully deleted!");
                return true;
            }
        }
        System.out.println("Lab couldn't be found!");
        return false;
        
    }
    
    @Override
    public int studentNumber() {
        int number = 0;
        for (int i =0; i < size; i++){
            number = number + labList[i].getSize();
        }
        System.out.println("Overall students: " + number);
        return number;
    }

    
    @Override
    public void passFail() {
        int pass = 0;
        int fail = 0;
        for (int i =0; i < size; i++){
            pass = pass + labList[i].passedLab();
            fail = fail + labList[i].failedLab();
            System.out.println("Students passed in lab " + labList[i].getLabId() + ": "+ labList[i].passedLab());
            System.out.println("Students failed in lab " + labList[i].getLabId() + ": "+ labList[i].failedLab());
        }
        System.out.println("Passed overall: " + pass);
        System.out.println("Failed overall: " + fail);
        
    }

    @Override
    public void passFailRatio() {
        int number = studentNumber();
        int pass = 0;
        int fail = 0;
        for (int i =0; i < size; i++){
            labList[i].passedLabRatio();
            labList[i].failedLabRatio();
            pass = pass + labList[i].passedLab();
            fail = fail + labList[i].failedLab();
        }
        System.out.println("Students passed ratio overall:" + (double)pass/(double)number);
        System.out.println("Students failed ratio overall:" + (double)fail/(double)number);
    }
    
    

    @Override
    public void averageGrade() {
        double sum = 0;
        for (int i =0; i < size; i++){
           sum = sum + labList[i].avgScore();
        }
        System.out.println("Average score overall: " + sum/size);
    }
    
}
    
    

