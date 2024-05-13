package lambdas;

public class Threads {
    public static void main(String[] args) {
        Runnable work1 = new Work1();
        Runnable work2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Work #02...");
                }
            }
        };

        Runnable work3 = Threads::work3;

        Thread t1 = new Thread(work1);
        Thread t2 = new Thread(work2);
        Thread t3 = new Thread(work3);

        t1.start();
        t2.start();
        t3.start();
    }

    static void work3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Work #02...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
