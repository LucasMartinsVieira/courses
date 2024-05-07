package classe;

public class Data {
    int day;
    int month;
    int year;

    Data() {
        this(1970, 1 ,1);
    }

    Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    String getDateFormatted() {
        final String format = "%d-%d-%d";
        return String.format(format, this.year, this.month, this.day);
    }

    void printFormattedDate() {
        System.out.printf("%d-%d-%d", this.year, this.month, this.day );
    }
}
