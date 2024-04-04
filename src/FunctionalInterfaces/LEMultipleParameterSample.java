package FunctionalInterfaces;

interface saying{
    int add(int a, int b);
}
public class LEMultipleParameterSample {
    public static void main(String[] args) {
        saying say = (a,b) -> (a + b);
        System.out.println("Without return keyword: " +say.add(2,3));

        saying say1 = (a,b) -> {
            return (a+b);
        };
        System.out.println("With return keyword: " + say1.add(20, 30));

        saying say2 = (a,b)  -> {
            int c = 3;
            a += c;
            return a+b;
        };
        System.out.println("multiple lines expression: "+ say2.add(2,3));
    }
}
