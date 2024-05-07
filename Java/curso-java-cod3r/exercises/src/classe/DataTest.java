package classe;

public class DataTest {
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(2003, 11, 29);

        String dataFormatted1 = d1.getDateFormatted();
        String dataFormatted2 = d2.getDateFormatted();

        System.out.println(dataFormatted1);
        System.out.println(dataFormatted2);
    }
}
