import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ThreadsHomework {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("Task 1");
        ExecutorService executor1 = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor1.submit(() -> {
                System.out.println("Task " + taskId);
            });
        }

        executor1.shutdown();
        executor1.awaitTermination(2, TimeUnit.SECONDS);

        System.out.println("Task 2");
        ExecutorService executor2 = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            final int taskId = i;
            executor2.submit(() -> {
                System.out.println("Task number: " + taskId + " | Thread name: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor2.shutdown();
        executor2.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Task 3");
        ExecutorService executor3 = Executors.newFixedThreadPool(3);

        Runnable taskNums = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
            }
        };

        Runnable taskLetters = () -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Letter: " + c);
            }
        };

        Runnable taskHello = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
            }
        };

        executor3.submit(taskNums);
        executor3.submit(taskLetters);
        executor3.submit(taskHello);

        executor3.shutdown();
        executor3.awaitTermination(3, TimeUnit.SECONDS);

        System.out.println("Task 4");
        ExecutorService executor4 = Executors.newSingleThreadExecutor();

        executor4.submit(() -> {
            System.out.println("Task started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task finished");
        });

        executor4.shutdown();
        System.out.println("isShutdown() right after shutdown: " + executor4.isShutdown());
        System.out.println("isTerminated() right after shutdown: " + executor4.isTerminated());

        executor4.awaitTermination(3, TimeUnit.SECONDS);
        System.out.println("isTerminated() after task finished: " + executor4.isTerminated());

        System.out.println("Task 5");
        ExecutorService executor5 = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executor5.submit(() -> {
                System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Task " + taskId + " finished");
            });
        }

        executor5.shutdown();
        executor5.awaitTermination(15, TimeUnit.SECONDS);

        System.out.println("Task 7");
        ExecutorService executorSum = Executors.newSingleThreadExecutor();

        Callable<Integer> sumTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        };

        Future<Integer> sumFuture = executorSum.submit(sumTask);
        System.out.println("Sum = " + sumFuture.get());
        executorSum.shutdown();

        System.out.println("Task 2");
        ExecutorService executorMax = Executors.newSingleThreadExecutor();
        List<Integer> numbers = Arrays.asList(5, 20, 8, 45, 3, 17);

        Callable<Integer> maxTask = () -> {
            int max = numbers.get(0);
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        };

        Future<Integer> maxFuture = executorMax.submit(maxTask);
        System.out.println("Max number = " + maxFuture.get());
        executorMax.shutdown();

        System.out.println("Task 3");
        ExecutorService executorTwoCallables = Executors.newFixedThreadPool(2);

        Callable<Integer> call1 = () -> 10 + 20;
        Callable<Integer> call2 = () -> 50 * 5;

        Future<Integer> result1 = executorTwoCallables.submit(call1);
        Future<Integer> result2 = executorTwoCallables.submit(call2);

        System.out.println("First result = " + result1.get());
        System.out.println("Second result = " + result2.get());

        executorTwoCallables.shutdown();
    }
}