package Control;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        String belt = "black";

        switch (belt.toLowerCase()) {
            case "black":
                System.out.println("I know Bassai-Dai...");
            case "brown":
                System.out.println("I know Tekki Shodan");
            case "purple":
                System.out.println("I know Heian Godan");
            case "green":
                System.out.println("I know Heian Yodan");
            case "orange":
                System.out.println("I know Heian Sandan");
            case "red":
                System.out.println("I know Heian Nidan");
            case "yellow":
                System.out.println("I know Heian Shodan");
                break;
            default:
                System.out.println("I don't know nothing");
        }
    }
}