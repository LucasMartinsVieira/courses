package streams;

import java.util.function.UnaryOperator;

public class Utils {
    private Utils() {}
    public final static UnaryOperator<String> uppercase = n -> n.toUpperCase();
    public final static UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
    public final static String scream(String n) {
     return n  + "!!! ";
    }
}
