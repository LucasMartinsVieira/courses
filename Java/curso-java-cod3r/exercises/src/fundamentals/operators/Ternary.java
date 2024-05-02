package fundamentals.operators;

public class Ternary {
    public static void main(String[] args) {
       double average = 5.6;
       String resultNotApproved = average >= 5.0 ? "second chance" : "not approved";
       String finalResult = average >= 7 ? "approved" : resultNotApproved;

        System.out.println("The student is " + finalResult);
    }
}
