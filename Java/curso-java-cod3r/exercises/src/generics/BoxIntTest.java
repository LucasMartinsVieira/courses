package generics;

public class BoxIntTest {
    public static void main(String[] args) {
        BoxInt boxA = new BoxInt();
        boxA.save(123);

        int somethingA = boxA.open();
        System.out.println(somethingA);
    }
}
