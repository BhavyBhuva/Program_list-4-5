// Bhavy Bhuva
// 220130318038
/*Write a program in Java to demonstrate use of synchronization of threads when multiple threads and trying to update common variable. */
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class P1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        IncrementThread[] threads = new IncrementThread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new IncrementThread(counter);
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            threads[i].join();
        }

        System.out.println("Final count is :: " + counter.getCount());
    }
}
