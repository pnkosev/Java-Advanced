package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Pr07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] kids = scanner.nextLine().split(" ");

        Collections.addAll(queue, kids);

        int step = Integer.parseInt(scanner.nextLine());

        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 0; i < step - 1; i++) {
                String kid = queue.remove();
                queue.offer(kid);
            }

            if (!isPrime(cycle)) {
                System.out.println("Removed " + queue.remove());
            } else {
                System.out.println("Prime " + queue.peek());
            }

            cycle++;
        }
        System.out.println("Last is " + queue.peek());
    }

    private static boolean isPrime(int num) {
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
