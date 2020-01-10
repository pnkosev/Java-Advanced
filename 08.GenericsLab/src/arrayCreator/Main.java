package arrayCreator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        String[] stringArr = ArrayCreator.create(10, "none");             NOT WORKING SINCE IT CANNOT CAST TO STRING[]
//        Integer[] intArr = ArrayCreator.create(5, 9);                     NOT WORKING SINCE IT CANNOT CAST TO INTEGER[]
        String[] stringArr = ArrayCreator.create(10, "none");
        Object[] intArr = ArrayCreator.create(5, 9);

        String[] yetAnotherStringArr = ArrayCreator.create(String.class, 10, "none");
        Integer[] yetAnotherIntArr = ArrayCreator.create(Integer.class, 10, 0);

        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(intArr));

        System.out.println(String.join(", ", yetAnotherStringArr));
        System.out.println(Arrays.toString(yetAnotherIntArr));
    }
}
