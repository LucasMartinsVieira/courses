package ExceptionPackage;

public class CheckedVsNotChecked {
    public static void main(String[] args) {
        generateError1();

        try {
            generateError1();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            generateError2();
        } catch (Throwable e) {
            System.err.println(e.getMessage());
        }

        System.out.println("That's all folks! :)");
    }


    // Not checked or verified
    static void generateError1() throws RuntimeException {
        throw new RuntimeException("A very cool Error happened #01! ");
    }

    // Checked Exception or verified
    static void generateError2() throws Exception {
        throw new Exception("A very cool Error happened #02! ");
    }
}
