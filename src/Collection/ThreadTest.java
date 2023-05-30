package Collection;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count: " + counter.getCount());

    }
}

/*
class Counter implements Runnable {
    private int count;

    public synchronized void increment() {
        count++;
        System.out.println(count);
    }

    public synchronized int getCount() {
        return count;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
*/
class Counter implements Runnable {
    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}