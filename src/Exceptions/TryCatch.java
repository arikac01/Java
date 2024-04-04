package Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int a[] = {1,2, 5, 6, 7};
            System.out.println(a[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to access beyond the array limit");
        }

    }

}
