import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessagePassingExample {
    static class Message {
        private final String content;

        public Message(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }

    static class Sender implements Runnable {
        private final BlockingQueue<Message> queue;

        public Sender(BlockingQueue<Message> q) {
            this.queue = q;
        }

        @Override
        public void run() {
            // Sending messages
            String[] messages = {"First message", "Second message", "Third message", "Done"};
            for (String m : messages) {
                try {
                    Thread.sleep(1000); // Simulating work
                    queue.put(new Message(m));
                    System.out.println("Sent: " + m);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class Receiver implements Runnable {
        private final BlockingQueue<Message> queue;

        public Receiver(BlockingQueue<Message> q) {
            this.queue = q;
        }

        @Override
        public void run() {
            try {
                Message msg;
                // Receiving messages
                while (!((msg = queue.take()).getContent().equals("Done"))) {
                    System.out.println("Received: " + msg.getContent());
                    Thread.sleep(400); // Simulating work
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Thread senderThread = new Thread(new Sender(queue));
        Thread receiverThread = new Thread(new Receiver(queue));

        senderThread.start();
        receiverThread.start();
    }
}
