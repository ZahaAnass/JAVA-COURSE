import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Task executed!");
                count--;
                if(count <= 0) {
                    System.out.println("Task completed, cancelling timer.");
                    timer.cancel(); // Stops the timer and cancels all scheduled tasks
                }
            }
        };

        timer.schedule(task, 3000, 1000); // Schedules the task to run after 3 seconds and then every 1 second

    }

}