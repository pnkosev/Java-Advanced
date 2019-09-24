package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Pr06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] kids = scanner.nextLine().split(" ");

        Collections.addAll(queue, kids);

        int step = Integer.parseInt(scanner.nextLine());

        while (queue.size() > 1) {
            for (int i = 0; i < step - 1; i++) {
                String kid = queue.remove();
                queue.offer(kid);
            }
            System.out.println("Removed " + queue.remove());
        }
        System.out.println("Last is " + queue.peek());
    }
}
