public class MultiplicationTable implements Runnable {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating threads...");
        Thread thread5 = new Thread(new MultiplicationTable(5));
        Thread thread10 = new Thread(new MultiplicationTable(10));

        System.out.println("Starting threads...");
        thread5.start();
        thread10.start();

        try {
            thread5.join();
            thread10.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Threads have completed execution.");
    }
}