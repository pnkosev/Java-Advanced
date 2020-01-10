package pr03_GenericSwap;

import java.util.ArrayList;
import java.util.List;

public class GenericSwap<T> {
    List<T> list;

    public GenericSwap() {
        this.list = new ArrayList<>();
    }

    public void add(T element, int index) {
        this.list.add(index, element);
    }

    public void add(T element) {
        this.list.add(element);
    }

    public void swap(int indexOne, int indexTwo) {
        T elementTwo = this.list.get(indexTwo);
        T oldOne = this.list.remove(indexOne);
        this.add(elementTwo, indexOne);
        this.list.remove(indexTwo);
        this.add(oldOne, indexTwo);
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
