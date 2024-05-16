package generics;

import java.util.Arrays;
import java.util.List;

public class ListUtilTest {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String lastLanguage = (String) ListUtil.getLast1(langs);
        System.out.println(lastLanguage);

        Integer lastNumber = (Integer) ListUtil.getLast1(nums);
        System.out.println(lastNumber);

        String lastLanguage2 = ListUtil.getLast2(langs);
        System.out.println(lastLanguage2);

        Integer lastNumber2 = ListUtil.getLast2(nums);
        System.out.println(lastNumber2);
    }
}
