public class refValueTest {
    public static void main(String[] args) {
        int[] a = new int[1];
        a[0] = 5;
        System.out.println(a[0]);
        incI(a);
        System.out.println(a[0]);
    }

    private static void incI(int[] i) {
        i[0]++;
    }
}
