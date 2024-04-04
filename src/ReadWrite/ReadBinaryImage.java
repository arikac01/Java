package ReadWrite;
import java.io.*;

public class ReadBinaryImage {
    public static void main(String[] args) throws IOException {

        FileReader fis=new FileReader("C:\\Users\\15108\\Desktop\\JavaTestFiles\\Source.jpg");
        FileWriter fos=new FileWriter("C:\\Users\\15108\\Desktop\\JavaTestFiles\\Target.jpg");

        int ch=fis.read();
        while(ch!=-1)
        {
            fos.write(ch);
            ch=fis.read();
        }
        fis.close();
        fos.close();
        System.out.println("data changed!");
    }
}
