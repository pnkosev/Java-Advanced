import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Pr04BasicQueueOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int n = tokens[0];
        int s = tokens[1];
        int x = tokens[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .limit(n)
                .forEach(queue::offer);

        while (s-- > 0) {
            queue.poll();
        }

        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            int min = queue.stream().min(Integer::compareTo).orElse(0);
            System.out.println(min);
        }
    }
}
