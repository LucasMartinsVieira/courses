package generics;

public class PairsTest {
    public static void main(String[] args) {
        Pairs<Integer, String> resultCourse = new Pairs<>();

        resultCourse.add(1, "Maria");
        resultCourse.add(2, "Pedro");
        resultCourse.add(3, "Gui");
        resultCourse.add(4, "Ana");
        resultCourse.add(2, "Rebeca");

        System.out.println(resultCourse.getValue(1));
        System.out.println(resultCourse.getValue(4));
        System.out.println(resultCourse.getValue(2));
    }
}
