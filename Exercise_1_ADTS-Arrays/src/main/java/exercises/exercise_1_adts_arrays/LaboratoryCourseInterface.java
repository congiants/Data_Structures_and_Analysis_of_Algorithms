package exercises.exercise_1_adts_arrays;

public interface LaboratoryCourseInterface {
    
    public boolean insert(Lab l);
    
    public boolean delete(Lab l);
    
    public int studentNumber();
    
    public void passFail();
    
    public void passFailRatio();
    
    public void averageGrade();
    
}
