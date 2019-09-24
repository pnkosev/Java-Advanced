import java.util.ArrayDeque;
import java.util.Scanner;

public class Pr03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands-- > 0) {
            String line = scanner.nextLine();
            if (line.startsWith("1")) {
                String[] tokens = line.split(" ");
                int number = Integer.parseInt(tokens[1]);
                stack.push(number);
            } else if (line.startsWith("2")) {
                stack.pop();
            } else {
                int maximumElement = stack.stream().max(Integer::compareTo).orElse(0);
                System.out.println(maximumElement);
            }
        }
    }
}
