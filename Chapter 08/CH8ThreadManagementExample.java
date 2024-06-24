import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CH8ThreadManagementExample {

    public static void main(String[] args) {
        // Creates a fixed thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit 10 tasks to be executed by the pool
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Executing task " + taskId + " Thread: " + Thread.currentThread().getName());
                try {
                    // Simulate task execution time
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // set the interrupt flag
                    System.out.println("Task " + taskId + " was interrupted");
                }
            });
        }

        // Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted
        executor.shutdown();

        try {
            // Wait for all tasks to finish execution or timeout after 60 seconds
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Cancel currently executing tasks and return the list of those tasks that were awaiting execution
                System.out.println("Executor did not terminate in the specified time.");
                // Wait a bit for tasks to respond to being cancelled
                if (!executor.awaitTermination(60, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");
            }
        } catch (InterruptedException ie) {
            // Re-cancel if the current thread also interrupted
            executor.shutdownNow();
            // Preserve interrupt status
            Thread.currentThread().interrupt();
        }

        System.out.println("Finished all threads");
    }
}
