package classe;

public class ValueVsReference {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // attribution per value

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(2024, 5, 6);
        Data d2 = d1; // Attribution per reference

        d1.day = 31;
        d2.month = 12;

        System.out.println(d1.getDateFormatted());

        System.out.println(d2.getDateFormatted());

        getDateToUnix(d1);

        System.out.println(d1.getDateFormatted());
        System.out.println(d2.getDateFormatted());

        int c = 5;
        changePrimitive(c);

        System.out.println(c);

        String s1 = "";
    }

    static void getDateToUnix(Data d) {
        d.year = 1970;
        d.month = 1;
        d.day = 1;
    }

    static void changePrimitive(int a) {
        a++;
    }
}
