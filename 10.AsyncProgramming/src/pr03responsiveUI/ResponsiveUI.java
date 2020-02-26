package pr03responsiveUI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ResponsiveUI {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int to = Integer.parseInt(scanner.nextLine());

        Runnable task = () -> printPrimes(to);
        Thread thread = new Thread(task);
        thread.start();

        String command;

        while (true) {
            command = scanner.nextLine();
            if ((command).equalsIgnoreCase("stop")) {
                thread.interrupt();
                break;
            } else {
                System.out.println("Unknown command");
            }
        }

        thread.join();

        System.exit(1);
    }

    static void printPrimes(int to) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 1; i < to; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }

            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted...");
                break;
            }
        }

        System.out.println(primes.stream().limit(10).collect(Collectors.toList()) + "...");
        System.out.println(primes.size());
    }

    static boolean isPrime(int num) {
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
}
