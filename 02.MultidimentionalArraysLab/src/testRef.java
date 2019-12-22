import java.util.Arrays;

public class testRef {
    public static void main(String[] args) {
        int[] chiffres = { 5, 2 };
        int a = 5;

        changerChiffre(a);
        changerChiffre(chiffres);

        System.out.println(a);
        System.out.println(chiffres[0]);
    }

    private static void changerChiffre(int chiffre) {
        chiffre += 100;
    }

    private static void changerChiffre(int[] chiffres) {
        int[] newArray = Arrays.copyOf(chiffres, chiffres.length);
        newArray[0] += 100;
    }
}
