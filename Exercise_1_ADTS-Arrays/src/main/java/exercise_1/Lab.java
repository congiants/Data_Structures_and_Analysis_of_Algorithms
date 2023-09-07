package exercise_1;

public class Lab implements LabInterface{
    private String labId;
    private int capacity;
    private int size = 0;
    private Student studentList [];

    public Lab() {
    }
    
    public Lab(String labId, int capacity) {
        this.labId = labId;
        this.capacity = capacity;
        studentList = new Student[capacity];
    }

    public Lab(String labId, int capacity, int size) {
        this.labId = labId;
        this.capacity = capacity;
        this.size = size;
        studentList = new Student[capacity];
    }
    
    public String getLabId(){
        return labId;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getSize(){
        return size;
    }

    public Student[] getStudentList() {
        return studentList;
    }
    
    public void setLabId(String id){
        this.labId = id;
    }
    
    public void setCapacity(int cap){
        this.capacity = cap;
    }
    
    public void setSize(int siz){
        this.size = siz;
    }
    
    public void setStudentList(Student[] s){
        this.studentList = s;
    }
    
    @Override
    public boolean insert(Student s){
        if (size < capacity){
            studentList[size++] = s;
            //size++;
            System.out.println("Student successfully inserted!");
            return true;
        }
        
        else{
            System.out.println("Reached lab capacity!");
            return false;
        }
    }

    @Override
    public boolean delete(Student s){
        for (int i =0; i < size; i++){
            if (studentList[i] == s){
                studentList[i] = studentList[size-1];
                studentList[size-1] = null;
                size--;
                System.out.println("Student successfully deleted!");
                return true;
            }
        }
        System.out.println("Student couldn't be found!");
        return false;
        
    }
    
    @Override
    public boolean findStudent(int studId){
        for (int i =0; i < size; i ++){
            if (studentList[i].getStudId() == studId){
                studentList[i].studentInfo();
                System.out.println("Student successfully detected!");
                return true;
            }
        }
        System.out.println("Student not found!");
        return false;
    }

    @Override
    public void attendance(){
        for (int i =0; i < size; i ++){
                System.out.println("\nStudent " + i + " :\n");
                studentList[i].studentInfo();
        }
        
    }

    @Override
    public int passedLab(){
        int number = 0;
        for (int i =0; i < size; i ++){
            if (studentList[i].getScore() >= 5 && studentList[i].getAbsences() <= 2){
                number ++;
            }
        }
        //System.out.println("Students passed in lab " + labId + ": "+ number);
        return number;
    }

    @Override
    public double passedLabRatio() {
        double ratio = (double)passedLab()/(double)size;
        System.out.println("Students passed ratio in lab " + labId + ": "+ ratio);
        return ratio;
    }

    @Override
    public int failedLab(){
        int number = size - passedLab();
        //System.out.println("Students failed in lab " + labId + ": "+ number);
        return number;
    }

    @Override
    public double failedLabRatio() {
        double ratio = (double)failedLab()/(double)size;
        System.out.println("Students failed ratio in lab " + labId + ": "+ ratio);
        return ratio;
    }
    
    @Override
    public double avgScore(){
        double sum = 0; 
        for (int i =0; i < size; i ++){
                sum = sum + studentList[i].getScore();
        }
        System.out.println("Average score in lab " + labId + ": " + sum /size);
        return sum /(double)size;
    }
}
