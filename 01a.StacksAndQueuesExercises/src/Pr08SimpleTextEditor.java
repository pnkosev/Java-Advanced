import java.util.ArrayDeque;
import java.util.Scanner;

public class Pr08SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "";
        ArrayDeque<String> historyStack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());


        while (n-- > 0) {
            String[] input = scanner.nextLine().split(" ");

            switch (input[0]) {
                case "1":
                String lettersToAdd = input[1];

                text.concat(lettersToAdd);
            }
        }
    }
}
