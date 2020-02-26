package pr04benchmarking;

import java.util.Scanner;
import java.util.concurrent.*;

public class Benchmarking {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int to = Integer.parseInt(scanner.nextLine());

        ExecutorService es = Executors.newFixedThreadPool(1);
        Future[] results = new Future[to + 1];

        long start = System.nanoTime();
        for (int i = 0; i <= to; i++) {
            int primeCandidate = i;
            Future<Boolean> future = es.submit(() -> isPrimeInefficient(primeCandidate));
            results[i] = future;
        }
        es.awaitTermination(100L, TimeUnit.MILLISECONDS);

        System.out.printf("Execution time: %d", System.nanoTime() - start);

        es.shutdown();
        System.exit(1);
    }

    static boolean isPrimeInefficient(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrimeEfficient(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
