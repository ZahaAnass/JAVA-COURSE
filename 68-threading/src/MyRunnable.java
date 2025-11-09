public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }

            if(i == 10) {
                System.out.println("\nTime's up!");
                System.exit(0);
            }
        }
    }

}
