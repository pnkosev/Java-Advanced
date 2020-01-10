package genericScale;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int comparison = this.left.compareTo(this.right);
        return comparison == 0 ? null : comparison > 0 ? this.left : this.right;
    }
}
