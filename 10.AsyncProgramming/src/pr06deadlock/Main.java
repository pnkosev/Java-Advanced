package pr06deadlock;

public class Main {
    public static void main(String[] args) {
        MyClass first = new MyClass("First");
        MyClass second = new MyClass("Second");

        Thread t1 = new Thread(() -> first.a(second));
        Thread t2 = new Thread(() -> second.a(first));

        t1.start();
        t2.start();
    }

    static class MyClass {
        String id;

        public MyClass(String id) {
            this.id = id;
        }

        synchronized void a(MyClass other) {
            System.out.printf("%s called %s%n", this.id, other.id);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            other.b(this);
        }

        synchronized void b(MyClass other) {
            System.out.printf("%s called %s%n", other.id, this.id);
            other.c();
        }

        synchronized void c() {
            System.out.println(this.id + " done!");
        }
    }
}
