package threads_and_interfaces;

public class MyThread extends Thread {
    Count counter;

    MyThread(Count counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().threadId() + " value: " + i);
        }
    }
}
