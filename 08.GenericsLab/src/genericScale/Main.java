package genericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("left", "right");
        Scale<Integer> integerScale = new Scale<>(5, 7);

        System.out.println(stringScale.getHeavier());
        System.out.println(integerScale.getHeavier());
    }
}
