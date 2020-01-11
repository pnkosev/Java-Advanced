package pr07_GenericList.interfaces;

public interface GenericList<T extends Comparable<T>> extends Addable<T>, Removable<T>, Containable<T>, Swappable, Printable {
    T getMin();
    T getMax();
    int countGreaterThan(T element);
    int getSize();
    T get(int index);
}
