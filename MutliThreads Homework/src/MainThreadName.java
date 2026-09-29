public class MainThreadName {

    public static void main(String[] args) {

        System.out.println(
                "Main thread name: " +
                        Thread.currentThread().getName()
        );
    }
}