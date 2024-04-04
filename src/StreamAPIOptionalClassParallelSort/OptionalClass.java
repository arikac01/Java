package StreamAPIOptionalClassParallelSort;
import java.util.*;

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(System.out::println);

        Optional<String> nullValue = Optional.ofNullable(null);
        System.out.println(nullValue.orElse("Default Value"));

        Optional<String> emptyValue = Optional.empty();
        System.out.println(emptyValue.orElse("Generated Default Value"));
    }
}
