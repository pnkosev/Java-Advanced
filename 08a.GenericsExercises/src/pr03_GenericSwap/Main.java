package pr03_GenericSwap;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericSwap<String> gs = new GenericSwap<>();

        int nbOfLines = Integer.parseInt(scanner.nextLine());

        while (nbOfLines-- > 0) {
            gs.add(scanner.nextLine());
        }

        Integer[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        gs.swap(indexes[0], indexes[1]);

        System.out.println(gs.toString());
    }
}
