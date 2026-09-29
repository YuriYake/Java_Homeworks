public class DownloadTask implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Downloading " + i + "%");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {

        DownloadTask downloadTask = new DownloadTask();

        Thread thread = new Thread(downloadTask);

        thread.start();
    }
}