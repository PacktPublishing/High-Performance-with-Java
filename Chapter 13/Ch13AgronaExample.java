import org.agrona.concurrent.ManyToOneConcurrentArrayQueue;

public class Ch13AgronaExample {
    public static void main(String[] args) {
        // Create a queue with a capacity of 10 items
        ManyToOneConcurrentArrayQueue<String> queue = new ManyToOneConcurrentArrayQueue<>(10);

        // Producer thread that offers elements to the queue
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                String element = "Element " + i;
                while (!queue.offer(element)) {
                    // Retry until the element is successfully added
                    System.out.println("Queue full, retrying to add: " + element);
                    try {
                        Thread.sleep(10); // Sleep to simulate backoff
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Produced: " + element);
            }
        });

        // Consumer thread that polls elements from the queue
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                String element;
                while ((element = queue.poll()) == null) {
                    // Wait until an element is available
                    System.out.println("Queue empty, waiting for elements...");
                    try {
                        Thread.sleep(10); // Sleep to simulate processing delay
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Consumed: " + element);
            }
        });

        // Start both threads
        producer.start();
        consumer.start();

        // Wait for both threads to finish execution
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

