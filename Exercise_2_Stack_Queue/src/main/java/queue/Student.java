package queue;

public class Student {
    
    private int studId;
    private String fullName;
    int age;
    private char gender;
    private int absences;
    private double score;

    public Student() {
    }

    public Student(int studId, String fullName, int age, char gender, int absences, double score) {
        this.studId = studId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.absences = absences;
        this.score = score;
    }

    public int getAbsences() {
        return absences;
    }

    public double getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public char getGender() {
        return gender;
    }

    public double getScore() {
        return score;
    }

    public int getStudId() {
        return studId;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public void studentInfo() {
        System.out.println("ID: "+ studId + " Name: " +fullName+ " Age: " + age + " Gender: " +gender+ " Absences: " + absences + " Score: " + score);
    }
}
