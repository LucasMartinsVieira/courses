package collections;

import java.util.HashSet;
import java.util.Set;

public class MessySet {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(1.2);
        set.add(true);
        set.add("Test");
        set.add(1);
        set.add('x');

        System.out.println(set.size());

        set.add("Test");
        set.add('x');
        System.out.println(set.size());

        System.out.println(set.remove("test"));
        System.out.println(set.remove("Test"));

        System.out.println(set.size());

        System.out.println(set.contains('x'));
        System.out.println(set.contains(1));
        System.out.println(set.contains(false));

        Set numbers = new HashSet();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println(set);

//        set.addAll(numbers);
        set.retainAll(numbers);
        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
