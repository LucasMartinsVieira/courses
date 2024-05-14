package streams;

public class AverageTest {
    public static void main(String[] args) {
        Average a1 = new Average().add(8.3).add(6.7);
        Average a2 = new Average().add(7.9).add(6.6);

        System.out.println(a1.getValue());
        System.out.println(a2.getValue());

        System.out.println(Average.combine(a1, a2).getValue());
    }
}
