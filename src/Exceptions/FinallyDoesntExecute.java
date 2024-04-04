package Exceptions;

public class FinallyDoesntExecute {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by Zero!");
            System.exit(0); //Thread execution stops here and doesn't go further.
            //When exception comes, if we are handling exception properly, program execution doesn't
            //stop, so finally will be executed.
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }

    }
}
