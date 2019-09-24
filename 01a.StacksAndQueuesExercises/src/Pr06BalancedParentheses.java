import java.util.Scanner;

public class Pr06BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] array = scanner.nextLine().toCharArray();

        boolean isBalanced = true;

        for (int i = 0; i < array.length / 2; i++) {
            char leftChar = array[i];
            char rightChar = array[array.length - 1 - i];

            if (leftChar == '(' && rightChar != ')') {
                isBalanced = false;
                break;
            } else if (leftChar == '{' && rightChar != '}') {
                isBalanced = false;
                break;
            } else if (leftChar == '[' && rightChar != ']') {
                isBalanced = false;
                break;
            }
        }

        String output = isBalanced ? "YES" : "NO";

        System.out.println(output);
    }
}
