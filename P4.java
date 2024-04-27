// Bhavy Bhuva
// 220130318038
/*Write a Java program that executes two threads. One thread will print the numbers divisible by 3 and another thread print numbers divisible by 5 between 1 to 50. */
class Three extends Thread {
    public void run() {
        System.out.println("Numbers divisible by 3");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

class Five extends Thread {
    public void run() {
        System.out.println("Numbers divisible by 5");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class P4 {
    public static void main(String[] args) {
        Three t1 = new Three();
        Five f1 = new Five();

        t1.start();
        f1.start();
    }
}
