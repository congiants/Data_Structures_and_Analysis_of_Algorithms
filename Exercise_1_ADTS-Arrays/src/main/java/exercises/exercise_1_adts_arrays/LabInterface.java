package exercises.exercise_1_adts_arrays;

public interface LabInterface {
    
        public boolean insert(Student s);
        
        public boolean delete(Student s);
        
        public boolean findStudent(int studId);
        
        public void attendance();
        
        public int passedLab();
        
        public double passedLabRatio();
        
        public int failedLab();
        
        public double failedLabRatio();
        
        public double avgScore();
}
