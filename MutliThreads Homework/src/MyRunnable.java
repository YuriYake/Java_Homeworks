public class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello from MyRunnable");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);

        thread.start();
    }
}