package fundamentals;

public class DotNotation {
  public static void main(String[] args) {
    String s = "Good Morning X";
    s = s.replace("X", "Sir");
    s = s.toUpperCase();
    s = s.concat(", how are you doing?");
    System.out.println(s);

    String x = "Lucas".toUpperCase();
    System.out.println(x);

    String y = "Good Morning X".replace("X", "Thiago").toUpperCase().concat("!!!");
    System.out.println(y);

    // Primitive types doesn't have the dot "." operator.
    int a = 3;
    System.out.println(a);
  }
}
