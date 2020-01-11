package pr07_GenericList.models;

import pr07_GenericList.interfaces.GenericList;
import pr07_GenericList.interfaces.Sortable;

public class Sorter<T extends Comparable<T>> implements Sortable<T> {
    @Override
    public void sort(GenericList<T> list) {
        for (int i = 0; i < list.getSize(); i++) {
            T elementOne = list.get(i);
            for (int j = i + 1; j < list.getSize(); j++) {
                T elementTwo = list.get(j);
                if (elementOne.compareTo(elementTwo) > 0) {
                    list.swap(i, j);
                }
            }
        }
    }
}
