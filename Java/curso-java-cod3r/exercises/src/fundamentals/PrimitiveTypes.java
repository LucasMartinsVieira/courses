package fundamentals;

public class PrimitiveTypes {
  public static void main(String[] args) {
    // Info on the employee

    // Integer Numeric types
    byte enterpriseYears = 23;
    short numberOfFlights = 542;
    int id = 56789;
    long accumulatedPoints = 2_234_845_223L;

    // Float numeric types
    float salary = 11_445.44F;
    double accumulatedSales = 2_991_797_103.01;

    // Boolean Type
    boolean isOnVacation = false;

    // Char Type
    char status = 'a';
    // char status = '\u0010';

    // Enterprise Days
    System.out.println(enterpriseYears * 365);

    // Number of Trips
    System.out.println(numberOfFlights / 2);

    // Points per money
    System.out.println(accumulatedPoints / accumulatedSales);

    System.out.println(id + ": got -> " + salary);
    System.out.println("Vacation? " + isOnVacation);
    System.out.println("Status: " + status);
  }
}
