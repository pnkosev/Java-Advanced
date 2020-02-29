package p02multiThread;

public class MultiThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("[%d] ", i);
                Thread.yield(); // causes the currently executing thread object to temporarily pause and allow other threads to execute. HOWEVER IT IS NOT CERTAIN!!!
            }
        };

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.exit(1);
    }
}
