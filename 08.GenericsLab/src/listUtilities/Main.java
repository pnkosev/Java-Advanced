package listUtilities;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 18, 2, -1);
        Integer maxInteger = ListUtils.getMax(integers);
        System.out.println(maxInteger);

        List<String> strings = Arrays.asList("a", "b", "c");
        String minString = ListUtils.getMin(strings);
        System.out.println(minString);
    }
}
