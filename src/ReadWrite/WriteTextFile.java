package ReadWrite;

import java.io.FileWriter;
import java.io.IOException;

/* To write data to a text file, we use writers like FileWriter from the java.io package.
Writers allow us to write character data to a file,
making it suitable for storing human-readable text. */

public class WriteTextFile {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\15108\\Desktop\\JavaTestFiles\\poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
            writer.append("\n(A poem for test)");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}