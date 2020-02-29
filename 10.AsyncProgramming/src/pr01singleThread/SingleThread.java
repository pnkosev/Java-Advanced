package p01singleThread;

public class SingleThread {
    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d ", i);
            }
//            while (true) {}
        };

        Thread thread = new Thread(task);

        thread.start();
        thread.join(); // blocks the calling thread so it can wait the called thread to finish execution
        System.exit(1);
    }
}
