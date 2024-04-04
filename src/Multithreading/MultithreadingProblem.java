package Multithreading;

public class MultithreadingProblem {

    /* Multithreading is very good whenever we want to complete our task ASAP,
    * But in some situation it may provide some wrong result or corrupted data.
    * This situation occur whenever a same resource is accessible
    * by multiple threads at the same time.*/
}

class Bus implements Runnable{
    int available = 1, passenger;
    Bus(int passenger){
        this.passenger = passenger;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(available >= passenger){
            System.out.println(name+" Reseverd Seat!");
            available = available - passenger;
        }
        else{
            System.out.println("Sorry, Seat not available.");
        }
    }
}
class Customer{
    public static void main(String[] args) {
        Bus r = new Bus(1);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        t1.start(); t2.start(); t3.start();
    }
}