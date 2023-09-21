package queue;

public class Car {
    private int number;

    public Car() {
    }

    public Car(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String carInfo() {  
        return Integer.toString(number);
    }
    
    
}
