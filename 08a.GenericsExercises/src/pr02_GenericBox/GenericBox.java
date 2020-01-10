package pr01_GenericBox;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {
    List<T> list;

    public GenericBox() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T element: list) {
            sb.append(element.getClass().getName())
                    .append(": ")
                    .append(element)
                    .append(System.lineSeparator());
        }

        return sb.toString();
    }
}
