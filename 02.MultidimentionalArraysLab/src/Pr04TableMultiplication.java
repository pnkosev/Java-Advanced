import java.util.Scanner;

public class Pr04TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tables de multiplication");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Table des " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(String.format("%d x %d = %d", i, j, i * j));
            }
            System.out.println("...on respire... frappez espace et validez...");
            scanner.nextLine();
        }
    }
}
