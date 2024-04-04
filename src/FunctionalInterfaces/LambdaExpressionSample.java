package FunctionalInterfaces;

interface doable{
    public void doit();
}
interface seeable{
    void seeit(Integer a, Integer b);
}
public class LambdaExpressionSample {
    public static void main(String[] args) {
        int num = 10;
        doable di = () -> System.out.println("Doing " + num);
        di.doit();

        seeable see = (a,b) -> System.out.println(a*b);
        see.seeit(2,3);
    }
}
