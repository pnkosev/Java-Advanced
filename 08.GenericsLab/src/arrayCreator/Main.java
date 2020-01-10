package arrayCreator;

public class Main {
    String[] stringArr = ArrayCreator.create(10, "none");
    Integer[] intArr = ArrayCreator.create(5, 0);

    String[] yetAnotherStringArr = ArrayCreator.create(String.class, 10, "none");
    Integer[] yetAnotherIntArr = ArrayCreator.create(Integer.class, 10, 0);
}
