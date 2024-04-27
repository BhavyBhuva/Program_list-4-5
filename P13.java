// Bhavy Bhuva
// 220130318038
/*Write a Java program that creates a producer-consumer system using threads. The producer thread should generate random numbers and add them to a shared buffer, while the consumer thread should remove numbers from the buffer and calculate their square roots. Make sure that the producer and consumer threads do not access the shared buffer at the same time. */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class SharedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}

class Producer extends Thread {
    private final SharedBuffer buffer;
    private final Random random = new Random();

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            while (true) {
                int value = random.nextInt(100);
                buffer.produce(value);
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            while (true) {
                int value = buffer.consume();
                double squareRoot = Math.sqrt(value);
                System.out.println("Square root of " + value + ": " + squareRoot);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class P13 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(10);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
