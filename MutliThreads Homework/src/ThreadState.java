public class ThreadState extends Thread {

    @Override
    public void run() {

        System.out.println("Task started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Task finished");
    }

    public static void main(String[] args) {

        ThreadState thread = new ThreadState();

        // Before start
        System.out.println("Before start: "
                + thread.getState());

        thread.start();

        // After start
        System.out.println("After start: "
                + thread.getState());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // While the thread is sleeping
        System.out.println("While sleeping: "
                + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // After join
        System.out.println("After join: "
                + thread.getState());
    }
}