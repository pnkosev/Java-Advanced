import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Pr02BasicStackOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] tokens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = tokens[0];
        int s = tokens[1];
        int x = tokens[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(n)
                .forEach(stack::push);

        while (s-- > 0) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else {
//            System.out.println((stack.iterator().next()));
            int min = stack.stream().min(Integer::compareTo).orElse(0);
            System.out.println(min);
        }
    }
}
