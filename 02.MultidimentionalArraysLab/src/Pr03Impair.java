public class Pr03Impair {
    public static void main(String[] args) {
        int counter = 1;

        System.out.println("Liste des 20 premiers nombres impairs");
        for (int i = 1; counter <= 20; i += 2) {
            System.out.println(i + " est le " + counter++ + " eme nombre impair");
        }
    }
}
