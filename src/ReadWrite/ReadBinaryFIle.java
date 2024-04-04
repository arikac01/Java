package ReadWrite;
import java.io.*;

/* To read data from a binary file, we use input streams like FileInputStream from the java.io package.
Binary files contain raw data that is not human-readable, such as images or executable files.
-> We use input streams because binary files store data in its raw byte form,
and input streams allow us to read these bytes sequentially from the file.*/

public class ReadBinaryFIle {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("data.bin")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
/*
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class ReadTextBinaryFile {

    public static void main(String[] args) throws IOException {

        FileReader fis=new FileReader("C:\\Users\\acer\\Desktop\\source\\a.txt");
        FileWriter fos=new FileWriter("C:\\Users\\acer\\Desktop\\target\\b.txt");

        int
                ch=fis.read
                ();
        while(ch!=-1)
        {
            fos.write(ch);

            ch=fis.read
                    ();
        }

        fis.close();
        fos.close();
        System.out.println("data has been writton");

    }
}
 */