interface Pen{
    void writing();
}
class Reynolds implements Pen{

    @Override
    public void writing() {
        System.out.println("Writing with Reynolds pen");
    }
}
class Flair implements Pen{

    @Override
    public void writing() {
        System.out.println("Writing with Flair Pen");
    }
}
class Cello implements Pen{

    @Override
    public void writing() {
        System.out.println("Writng with Cello Pen");
    }
}
public class MainPen {
    public static void main(String[] args){
        Pen cello = new Cello();
        Pen reynolds = new Reynolds();
        Pen flair = new Flair();
        cello.writing();
        reynolds.writing();
        flair.writing();
    }
}
