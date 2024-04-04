package Multithreading;

public class MultithreadingSolution {
    //Synchronization is the solution preventing Corrupted data
    /* Synchronization in Java is the capability to control the
    access of multiple threads to any shared resource.
    Java Synchronization is better option where we want to allow only
    one thread to access the shared resource. */
}
class Bus1 implements Runnable{
    int available = 1, passenger;
    Bus1(int passenger){
        this.passenger = passenger;
    }
    @Override
    public synchronized void run() {
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
class Customer1{
    public static void main(String[] args) {
        Bus1 r = new Bus1(1);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        t1.start(); t2.start(); t3.start();
    }
}