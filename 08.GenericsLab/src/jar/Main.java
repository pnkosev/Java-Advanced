package jar;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> integerJar = new Jar<>();
        integerJar.add(5);
        integerJar.add(6);
        integerJar.add(7);
        int removedInt = integerJar.remove();
        System.out.println(removedInt);

        Jar<String> stringJar = new Jar<>();
        stringJar.add("PN");
        stringJar.add("MM");
        stringJar.add("MK");
        stringJar.add("YO");
        System.out.println(stringJar.remove());
    }
}
