// Bhavy Bhuva
// 220130318038
/*Write a Java program that creates a thread that performs a long-running task (e.g. sorting a large list). Use a separate thread to display a progress bar that updates every second, indicating the percentage of the task that has been completed. */
class LongRunningTask extends Thread {
    public void run() {
        // Simulating a long-running task (sorting a large list)
        int[] largeList = new int[10000];
        for (int i = 0; i < largeList.length; i++) {
            largeList[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < largeList.length - 1; i++) {
            for (int j = 0; j < largeList.length - i - 1; j++) {
                if (largeList[j] > largeList[j + 1]) {
                    int temp = largeList[j];
                    largeList[j] = largeList[j + 1];
                    largeList[j + 1] = temp;
                }
            }
        }
    }
}

class ProgressBar extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r[" + getProgressBar(i) + "] " + i + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String getProgressBar(int percent) {
        int length = 50;
        int numChars = (int) (((double) percent / 100) * length);
        StringBuilder progressBar = new StringBuilder();
        for (int i = 0; i < numChars; i++) {
            progressBar.append("=");
        }
        for (int i = numChars; i < length; i++) {
            progressBar.append(" ");
        }
        return progressBar.toString();
    }
}

public class P12 {
    public static void main(String[] args) {
        LongRunningTask taskThread = new LongRunningTask();
        ProgressBar progressBarThread = new ProgressBar();

        taskThread.start();
        progressBarThread.start();
    }
}
