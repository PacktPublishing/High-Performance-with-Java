public class ProfilingTest {
    public static void main(String[] args) {
        System.out.println("Starting the application...");

        // CPU-intensive task
        long cpuResult = performCpuIntensiveTask();
        System.out.println("CPU-intensive task result: " + cpuResult);

        // Memory-intensive task
        int[] memoryResult = performMemoryIntensiveTask();
        System.out.println("Memory-intensive task completed with array length: " + memoryResult.length);

        // Thread activity
        performThreadActivity();
        System.out.println("Thread activity completed.");

        System.out.println("Application finished.");
    }

    private static long performCpuIntensiveTask() {
        long sum = 0;
        for (long i = 0; i < 1_000_000_000L; i++) {
            sum += i;
        }
        return sum;
    }

    private static int[] performMemoryIntensiveTask() {
        int size = 100_000_000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    private static void performThreadActivity() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
