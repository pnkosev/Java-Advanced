package pr02_GenericBox;

import pr01_GenericBox.GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericBox<Integer> gb = new GenericBox<>();

        int nbOfLines = Integer.parseInt(scanner.nextLine());

        while (nbOfLines-- > 0) {
            gb.add(Integer.parseInt(scanner.nextLine()));
        }

        System.out.println(gb.toString());
    }
}
