import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter countdown time in seconds: ");
        int seconds = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = seconds;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count <= 0) {
                    System.out.println("Happy new Year!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
        scanner.close();

    }
}