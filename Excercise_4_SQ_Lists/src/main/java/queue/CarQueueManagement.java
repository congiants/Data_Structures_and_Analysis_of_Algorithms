package queue;

import java.util.*; 

public class CarQueueManagement {

    //private ArrayQueue Q = new ArrayQueue();
    //private Car c = new Car();
    
    public CarQueueManagement() {
    }
    
    
    public static void main(String[] args){
        LinkedQueue Q = new LinkedQueue();
        Car c;
        boolean flag = true;
        int input = 0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("MENU");
            System.out.println("1. Car arrival");
            System.out.println("2. Car departure");
            System.out.println("3. Cars waiting");
            System.out.println("4. Exit");
            
            input = sc.nextInt();  

            if(input==1){
                    System.out.println("Arrived car number: ");
                    c = new Car(sc.nextInt());
                    try{
                        Q.enqueue(c);
                        System.out.println("Arrived car number stored.");
                        System.out.println(Q.size());
                    }
                        catch (QueueFullException e){
                            System.out.println(e);
                        }
                }
                
            if (input ==2){
                    try{
                        c = (Car)Q.dequeue();
                        System.out.println("Departed car number: ");
                        System.out.println(c.carInfo());
                        System.out.println("Car departed.");
                        System.out.println(Q.size());
                    }
                        catch (QueueEmptyException e){
                            System.out.println(e);
                        }
                }
                
            if(input==3){
                    if (!Q.isEmpty()){
                        System.out.println("Remaining cars numbers: ");
                        LinkedQueue tempQ = Q;
                        while(tempQ.size()>0){
                            c = (Car)tempQ.front();
                            System.out.println(c.getNumber());
                            System.out.println(tempQ.dequeue());
                        }
                        tempQ = null;
                    }
                    else{
                        System.out.println("No cars waiting.");
                    }
                }
            if(input ==4){
                    flag = false;
                }
            
        }while (flag == true);
    }
}