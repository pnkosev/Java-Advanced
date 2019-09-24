package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Pr08BrowserHistoryUpdate {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayDeque<String> backward = new ArrayDeque<>();
//        ArrayDeque<String> forward = new ArrayDeque<>();
//
//        String line;
//
//        while (!(line = scanner.nextLine()).equals("Home")) {
//            if (!line.equalsIgnoreCase("back") && !line.equalsIgnoreCase("forward")) {
//                backward.push(line);
//                System.out.println(line);
//                if (!forward.isEmpty()) {
//                    forward.clear();
//                }
//            } else if (line.equalsIgnoreCase("back")) {
//                if (backward.size() < 2) {
//                    System.out.println("no previous URLs");
//                } else {
//                    String url = backward.pop();
//                    System.out.println(backward.peek());
//                    forward.offer(url);
//                }
//            } else if (line.equalsIgnoreCase("forward")) {
//                if (forward.isEmpty()) {
//                    System.out.println("no next URLs");
//                } else {
//                    String url = forward.remove();
//                    System.out.println(url);
//                    backward.push(url);
//                }
//            }
//        }

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backward = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String current = "";

        String line;

        while (!(line = scanner.nextLine()).equals("Home")) {
            if (line.equalsIgnoreCase("back")) {
                if (backward.isEmpty()) {
                    System.out.println("no previous URLs");
                    continue;
                } else {
                    forward.offer(current);
                    current = backward.peek();
                }
            } else if (line.equalsIgnoreCase("forward")) {
                if (forward.isEmpty()) {
                    System.out.println("no next URLs");
                    continue;
                } else {
                    String url = forward.remove();
                    System.out.println(url);
                    current = url;
                    continue;
                }
            } else {
                if (!current.equals("")) {
                    backward.push(current);
                }
                current = line;
                forward.clear();
            }

            System.out.println(current);
        }
    }
}
