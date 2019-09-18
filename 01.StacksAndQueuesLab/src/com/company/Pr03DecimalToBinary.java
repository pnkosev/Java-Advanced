package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Pr03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int numberToTransform = Integer.parseInt(scanner.nextLine());

        if (numberToTransform == 0) {
            System.out.println(0);
        } else {
            while (numberToTransform != 0) {
                stack.push(numberToTransform % 2);
                numberToTransform /= 2;
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
