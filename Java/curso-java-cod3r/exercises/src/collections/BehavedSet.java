package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BehavedSet {
    public static void main(String[] args) {
//        Set<String> approvedList = new HashSet<>();
        SortedSet<String> approvedList = new TreeSet<>();
        approvedList.add("Ana");
        approvedList.add("Carlo");
        approvedList.add("Luca");
        approvedList.add("Pedro");

        for (String candidate : approvedList) {
            System.out.println(candidate);
        }

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}