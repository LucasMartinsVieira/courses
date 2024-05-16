package generics;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> boxA = new Box<>();
        boxA.save("Secret!");

        String somethingA = boxA.open();
        System.out.println(somethingA);

        Box<Double> boxB = new Box<>();
        boxB.save(3.1415);

        Double somethingB = boxB.open();
        System.out.println(somethingB);
    }
}
