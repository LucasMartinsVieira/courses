package classe;

public class NullValue {
    public static void main(String[] args) {
        String s1 = "";
        System.out.println(s1.concat("!!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null;

        if (d1 != null) {
            d1.month = 3;
            System.out.println(d1.getDateFormatted());
        }

        String s2 = null;
        if (s2 != null) {
            System.out.println(s2.concat("????"));
        }
    }
}
