package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<List<String>> someList = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println(someList.get());
    }
}
