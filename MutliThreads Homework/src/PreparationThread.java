public class PreparationThread extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Preparation interrupted");
        }

        System.out.println("Preparation finished");
    }

    public static void main(String[] args) {

        PreparationThread preparationThread =
                new PreparationThread();

        WorkThread workThread =
                new WorkThread();

        preparationThread.start();

        try {
            preparationThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        workThread.start();
    }
}

class WorkThread extends Thread {

    @Override
    public void run() {
        System.out.println("Work started");
    }
}