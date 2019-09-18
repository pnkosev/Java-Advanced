package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class Pr02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Deque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, input);

        while (stack.size() > 1) {
            int firstNumber = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            int result = 0;

            switch (operation) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
            }

            stack.push(String.valueOf(result));
        }

        System.out.println(stack.pop());
    }
}
