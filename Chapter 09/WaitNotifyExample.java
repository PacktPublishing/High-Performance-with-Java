public class WaitNotifyExample {
    private static class SharedResource {
        private String message;
        private boolean empty = true;

        public synchronized String take() {
            // Wait until the message is available.
            while (empty) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            }
            // Toggle status to true.
            empty = true;
            // Notify producer that status has changed.
            notifyAll();
            return message;
        }

        public synchronized void put(String message) {
            // Wait until the message has been retrieved.
            while (!empty) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            }
            // Toggle the status to false.
            empty = false;
            // Store the message.
            this.message = message;
            // Notify the consumer that the status has changed.
            notifyAll();
        }
    }

    private static class Producer implements Runnable {
        private SharedResource resource;

        public Producer(SharedResource resource) {
            this.resource = resource;
        }

        public void run() {
            String[] messages = {"Hello", "World", "Java", "Concurrency"};
            for (String message : messages) {
                resource.put(message);
                System.out.println("Produced: " + message);
                try {
                    Thread.sleep(1000); // Simulate time passing
                } catch (InterruptedException e) {}
            }
            resource.put("DONE");
        }
    }

    private static class Consumer implements Runnable {
        private SharedResource resource;

        public Consumer(SharedResource resource) {
            this.resource = resource;
        }

        public void run() {
            for (String message = resource.take(); !message.equals("DONE"); message = resource.take()) {
                System.out.println("Consumed: " + message);
                try {
                    Thread.sleep(1000); // Simulate time passing
                } catch (InterruptedException e) {}
            }
        }
    }

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
