import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pr07Somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculs statistiques");
        System.out.println("Entrez un nombre (0 pour sortir)");
        List<Integer> listeNombres = new ArrayList<>();

        String nombre;

        int somme = 0;

        while (!(nombre = scanner.nextLine()).equals("0")) {
            System.out.println("Entrez un nombre (0 pour sortir)");
            int n = Integer.parseInt(nombre);
            listeNombres.add(n);
            somme += n;
        }

        List<Integer> listeOrdonnee = listeNombres.stream().sorted().collect(Collectors.toList());

        System.out.println("Statistiques sur les nombre saisis :");
        System.out.println(listeNombres.size() + " nombres saisis");
        System.out.println("Compris entre " + listeOrdonnee.get(0) + " et " + listeOrdonnee.get(listeOrdonnee.size() - 1));
        System.out.println("Pour une somme de " + somme);
        System.out.println("Pour une somme de " + somme / listeNombres.size());

//        System.out.println("Pour une somme de " + listeNombres.stream().mapToInt(Integer::intValue).sum());
//        System.out.println("Pour une somme de " + (int)(listeNombres.stream().mapToInt(Integer::intValue).average().getAsDouble()));
    }
}
