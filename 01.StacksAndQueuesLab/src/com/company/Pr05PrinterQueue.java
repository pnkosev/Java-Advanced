package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Pr05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String line;

        while (!(line = scanner.nextLine()).equals("print")) {
            if (!line.equals("cancel")) {
                queue.offer(line);
            } else {
                if (!queue.isEmpty()) {
                    String removedLine = queue.poll();
                    System.out.println("Canceled " + removedLine);
                } else  {
                    System.out.println("Printer is on standby");
                }
            }
        }

        for (String command: queue) {
            System.out.println(command);
        }
    }
}
