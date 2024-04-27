// Bhavy Bhuva
// 220130318038
/*Write a Java program that creates two threads. The first thread should print out the even numbers from 0 to 100, while the second thread should print out the odd */
class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + " :: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(Thread.currentThread().getName() + " :: " + i);
        }
    }
}

public class P11 {
    public static void main(String[] args) {
        Thread evenThread = new EvenThread();
        Thread oddThread = new OddThread();

        evenThread.setName("Even Thread Number");
        oddThread.setName("Odd Thread Number");

        evenThread.start();
        oddThread.start();
    }
}

