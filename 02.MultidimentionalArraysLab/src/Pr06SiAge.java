import java.util.Scanner;

public class Pr06SiAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre âge :");

        int age = Integer.parseInt(scanner.nextLine());

        if (age < 18) {
            System.out.println("Programme réservé aux personnes majeures");
        } else if (age <= 26) {
            System.out.println("Statut jeune");
        } else if (age <= 65) {
            System.out.println("Statut adulte");
        } else {
            System.out.println("Programme réservé aux personnes non-retraitées");
        }
    }
}
