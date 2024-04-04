package ReadWrite;
import java.io.*;

/* To write data to a binary file, we use output streams like FileOutputStream
from the java.io package.
->Output streams allow us to write raw bytes to a file,
which is essential for creating binary files*/

public class WriteBinaryFile {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("binaryfile.dat");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

            byte[] data = {65, 66, 67, 68, 69}; // Sample data to write to the file

            bufferedOutputStream.write(data);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
