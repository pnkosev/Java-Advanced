package pr07_GenericList.models;

import pr07_GenericList.interfaces.GenericList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericListImpl<T extends Comparable<T>> implements GenericList<T> {
    private List<T> collection;

    public GenericListImpl() {
        this.collection = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        this.collection.add(element);
    }

    @Override
    public boolean contains(T element) {
        return this.collection.contains(element);
    }

    @Override
    public T remove(int index) {
        return this.collection.remove(index);
    }

    @Override
    public void swap(int indexOne, int indexTwo) {
        T elOne = this.collection.get(indexOne);
        T elTwo = this.collection.get(indexTwo);
        this.collection.set(indexOne, elTwo);
        this.collection.set(indexTwo, elOne);
    }

    @Override
    public int countGreaterThan(T element) {
        int[] count = {0};

        this.collection.forEach(e -> {
            if (e.compareTo(element) > 0) {
                count[0]++;
            }
        });

        return count[0];
    }

    @Override
    public int getSize() {
        return this.collection.size();
    }

    @Override
    public T get(int index) {
        return this.collection.get(index);
    }

    @Override
    public T getMin() {
        return this.collection.stream().min(Comparable::compareTo).orElse(null);
    }

    @Override
    public T getMax() {
        return this.collection.stream().max(Comparable::compareTo).orElse(null);
    }

    @Override
    public void print() {
        for (T element : this.collection) {
            System.out.println(element);
        }
    }

    public void sort() {
        Collections.sort(this.collection);
    }
}
