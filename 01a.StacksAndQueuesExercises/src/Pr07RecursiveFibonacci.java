import java.util.Scanner;

import static java.lang.System.in;

public class Pr07RecursiveFibonacci {
    private static long[] memory;
    private static long counter;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        memory = new long[n + 1];
        counter = 0;

        long result = fibonacci(n);

        System.out.println(result);
        System.out.println(counter);
    }

    private static long fibonacci(int n) {
        counter++;
        if (n < 2) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        return memory[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
