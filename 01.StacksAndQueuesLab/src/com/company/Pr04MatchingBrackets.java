package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Pr04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(') {
                stack.push(i);
            }
            if (currentChar == ')') {
                int startIndex = stack.pop();
                System.out.println(input.substring(startIndex, i + 1));
            }
        }
    }
}
