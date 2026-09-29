public class ThreeThreads {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {

            for (int i = 1; i <= 3; i++) {

                System.out.println(
                        Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }

        }, "Thread-1");


        Thread thread2 = new Thread(() -> {

            for (int i = 1; i <= 3; i++) {

                System.out.println(
                        Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }

        }, "Thread-2");


        Thread thread3 = new Thread(() -> {

            for (int i = 1; i <= 3; i++) {

                System.out.println(
                        Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }

        }, "Thread-3");


        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();


        // Wait for all threads
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }


        System.out.println("All threads finished.");
    }
}