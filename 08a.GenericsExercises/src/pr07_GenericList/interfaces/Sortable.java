package pr07_GenericList.interfaces;

public interface Sortable<T extends Comparable<T>> {
    void sort(GenericList<T> list);
}
