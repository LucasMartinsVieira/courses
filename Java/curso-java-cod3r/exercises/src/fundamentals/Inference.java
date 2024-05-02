package fundamentals;

public class Inference {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Text";
        System.out.println(c);

        c = "Another Text";
        System.out.println(c);

        double d; // Variable declared
        d = 123.65; // Variable initialized
        System.out.println(d); // Variable utilized

        var e = 123.12;
        System.out.println(e);

        var f = 12;
        // f = 12.01;
    }
}
