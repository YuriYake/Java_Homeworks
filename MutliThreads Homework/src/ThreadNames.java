public class ThreadNames {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            System.out.println(
                    Thread.currentThread().getName()
            );
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            System.out.println(
                    Thread.currentThread().getName()
            );
        }, "Thread-2");

        Thread thread3 = new Thread(() -> {
            System.out.println(
                    Thread.currentThread().getName()
            );
        }, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}