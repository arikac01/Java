package ReadWrite;

import java.io.*;

public class Serialization {

    public static void main(String [] args) {

        //-> Serialization is the process of converting an object into a stream of bytes
        // to store or transmit it to memory, a database, or over a network.
        //-> Serialization is used when we need to persist or transmit the state of an object.
        //-> It's commonly used in file I/O, network communication, and in distributed systems.
        //-> Serialization allows objects to be stored, transmitted, and reconstructed later,
        // enabling data persistence and inter-process communication.

        //					Steps to Serialize
        //					---------------------------------------------------------------
        //					1. Your class should implement Serializable interface
        //					2. add import java.io.Serializable;
        //					3. FileOutputStream fileOut = new FileOutputStream(file path)
        //					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //					5. out.writeObject(objectName)
        //					6. out.close(); fileOut.close();
        //					---------------------------------------------------------------

        //Deserialization = 	The reverse process of converting a byte stream into an object.


        // important notes	1. children classes of a parent class that implements Serializable will do so as well
        //					2. static fields are not serialized (they belong to the class, not an individual object)
        //					3. Fields declared as "transient" aren't serialized, they're ignored
        //					4. the class's definition ("class file") itself is not recorded, cast it as the object type
        //					5. serialVersionUID is a unique version ID

        //SerialVersionUID =	serialVersionUID is a unique ID that functions like a version #
        //					verifies that the sender and receiver of a serialized object,
        //					have loaded classes for that object that are compatible
        //					Ensures object will be compatible between machines
        //					Number must match. otherwise this will cause a InvalidClassException
        //					A SerialVersionUID will be calculated based on class properties, members, etc.
        //					A serializable class can declare its own serialVersionUID explicitly (recommended)

        User user = new User();

        user.name = "Bro";
        user.password = "I<3Pizza";

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\15108\\Desktop\\emp.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);

            out.close();
            fileOut.close();
            System.out.println("Object saved!");
        } catch (IOException i) {
            i.printStackTrace();
        }

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: "+serialVersionUID);
    }
}
