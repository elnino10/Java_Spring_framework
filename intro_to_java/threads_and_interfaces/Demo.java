package threads_and_interfaces;

class Count {
    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Demo {
    public static void main(String[] args) {
        Count counter = new Count();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();
    }
}
