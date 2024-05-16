package generics;

public class BoxObjectTest {
    public static void main(String[] args) {
        BoxObject boxA = new BoxObject();
        boxA.save(2.3);

        Double somethingA = (Double) boxA.open();
        System.out.println(somethingA);

        BoxObject boxB = new BoxObject();
        boxB.save("Hello");

        String somethingB = (String) boxB.open();
        System.out.println(somethingB);
    }
}
