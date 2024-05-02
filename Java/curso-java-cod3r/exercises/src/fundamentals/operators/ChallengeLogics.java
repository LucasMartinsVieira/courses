package fundamentals.operators;

public class ChallengeLogics {
    public static void main(String[] args) {
        boolean work1 = true;
        boolean work2 = false;

        boolean boughtTV50 = work1 && work2;
        boolean boughtTV32 = work1 ^ work2;
        boolean boughtIceCream = work1 || work2;

        System.out.println("Bought TV 50\"? " + boughtTV50);
        System.out.println("Bought TV 32\"? " + boughtTV32);
        System.out.println("Bought Ice Cream? " + boughtIceCream);
        System.out.println("More healthy? " + !boughtIceCream);
    }
}
