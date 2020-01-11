package pr05_GenericCountMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();

        int nbOfLines = Integer.parseInt(scanner.nextLine());

        while (nbOfLines-- > 0) {
            stringList.add(scanner.nextLine());
        }

        String input = scanner.nextLine();
        System.out.println(compare(stringList, input));
    }

    private static <T extends Comparable<T>> int compare(List<T> list, T input) {
        int count = 0;

        for (T element: list) {
            if (element.compareTo(input) > 0) {
                count++;
            }
        }

        return count;
    }
}
