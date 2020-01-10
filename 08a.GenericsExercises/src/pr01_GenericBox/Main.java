package pr01_GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericBox<String> gb = new GenericBox<>();

        int nbOfLines = Integer.parseInt(scanner.nextLine());

        while (nbOfLines-- > 0) {
            gb.add(scanner.nextLine());
        }

        System.out.println(gb.toString());
    }
}
