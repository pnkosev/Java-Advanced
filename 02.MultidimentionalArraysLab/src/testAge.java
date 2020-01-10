import java.util.Scanner;

public class testAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageDefini = 30;
        System.out.println("Quel age a Momo?");
        int ageSaisi = Integer.parseInt(scanner.nextLine());

        while (ageDefini != ageSaisi) {
            if (ageDefini > ageSaisi) {
                System.out.println("L'age entre est inf");
            } else {
                System.out.println("L'age entre est sup");
            }
            System.out.println("Quel age a Momo?");
            ageSaisi = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Felicitations!");
    }
}
