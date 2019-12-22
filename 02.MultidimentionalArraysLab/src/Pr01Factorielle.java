import java.math.BigInteger;
import java.util.Scanner;

public class Pr01Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bigNum = BigInteger.valueOf(Integer.parseInt(scanner.nextLine()));

        System.out.println(fact(bigNum));
    }

//        do {
//            System.out.println("Entrez un nombre");
//            BigInteger nombre = BigInteger.valueOf(Integer.parseInt(scanner.nextLine()));
//
//            BigInteger factorielle = fact(nombre);
//
//            System.out.println("La factorielle de " + nombre + " est donc : " + factorielle);
//            System.out.println("Voulez-vous recommencer (o/n)?");
//        } while (scanner.nextLine().equals("o"));


    static BigInteger fact(BigInteger n) {
        if (n.equals(BigInteger.valueOf(0))) {
            return BigInteger.valueOf(1);
        } else {
            return (n.multiply(fact(n.subtract(BigInteger.valueOf(1)))));
        }
    }
//
//    static BigInteger getRidOfTrailingZeroes(BigInteger n) {
//        while (n.remainder(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0))) {
//            n = n.divide(BigInteger.valueOf(10));
//        }
//        return n;
//    }
}
