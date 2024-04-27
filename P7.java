// Bhavy Bhuva
// 220130318038
/*Write a Java program that executes three threads. One thread displays “Thread-I” every 2500 milisecond, second thread displays “Thread-II” every 5000 milisecond and third thread displays “Thread-III” every 7500 milisecond */
class DisplayThread extends Thread {
    private String message;
    private int interval;

    public DisplayThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class P7 {
    public static void main(String[] args) {
        DisplayThread thread1 = new DisplayThread("Thread-I", 2500);
        DisplayThread thread2 = new DisplayThread("Thread-II", 5000);
        DisplayThread thread3 = new DisplayThread("Thread-III", 7500);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
