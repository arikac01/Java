package ReadWrite;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 123;
    String name;
    transient String password; //transient values are ignored

    /* the transient keyword is used to mark class variables that should not be serialized.
    When an object of a class implementing Serializable interface is serialized,
    the values of all non-transient variables are written to the output stream.
    However, the values of transient variables are not included in the serialization process.*/

    public void hello() {
        System.out.println("Welcome "+name);
    }
}