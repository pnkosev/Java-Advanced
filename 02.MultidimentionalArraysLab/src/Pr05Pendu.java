import java.util.Arrays;
import java.util.Scanner;

public class Pr05Pendu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jeu du pendu");
        System.out.println("Entrez le mot caché :");
        String motCache = scanner.nextLine();

        char[] motDecouvert = new char[motCache.length()];
        Arrays.fill(motDecouvert, '*');

        System.out.println("Vous avez droit à " + motCache.length() * 2 + " essais.");
        System.out.println("Mot découvert : " + String.valueOf(motDecouvert));

        boolean aGagne = false;
        int nombreEssais = 0;
        int nombreLettresDevinee = 0;

        for (int i = 1; i <= motCache.length() * 2; i++) {
            System.out.println("Entrez une lettre :");
            char character = scanner.nextLine().charAt(0);

            if (motCache.indexOf(character) >= 0 && motDecouvert[motCache.indexOf(character)] == '*') {
                System.out.println("Super! Continuez.");
                modifierMotDecouvert(motCache, character, motDecouvert);
                nombreLettresDevinee++;
            } else {
                System.out.println("Dommage... Coninuez quand même");
            }

            System.out.println("Vous en êtes à " + String.valueOf(motDecouvert));

            if (String.valueOf(motDecouvert).equals(motCache)) {
                aGagne = true;
                nombreEssais = i;
                break;
            }
        }

        if (aGagne) {
            System.out.println("Bravo! Vous avez gagné en " + nombreEssais + " essais!");
        } else {
            System.out.println("Perdu! Le mot était " + motCache);
            System.out.println("Vous avez trouvé " + nombreLettresDevinee + " bonnes lettres ; vous ferez mieux la prochaine fois!");
        }
    }

    private static void modifierMotDecouvert(String mot, char character, char[] motDecouvert) {
        for (int j = 0; j < mot.length(); j++) {
            if (mot.charAt(j) == character) {
                if (motDecouvert[j] == '*') {
                    motDecouvert[j] = character;
                }
            }
        }
    }
}
