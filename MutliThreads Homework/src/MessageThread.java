public class MessageThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from thread");
    }

    public static void main(String[] args) {

        MessageThread thread = new MessageThread();

        thread.start();
    }
}