import java.util.Scanner;

public class Pr02Hypo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez cote1");
        float cote1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Entrez cote2");
        float cote2 = Float.parseFloat(scanner.nextLine());

        float sideC = mathSqrt((cote1 * cote1) + (cote2 * cote2));

        System.out.printf("L'Hypothenuse est donc: %.2f", sideC);
        System.out.println();
    }

    static float mathSqrt(float n) {
        float result = 0.0f;
        for (float i = n / 2; i > 0; i -= 0.000001) {
            if ((i * i) == n) {
                result = i;
                break;
            }
        }
        return result;
    }
}
