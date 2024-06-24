import java.util.LinkedList;
import java.util.Queue;

public class Example10 {
    public static void main(String[] args) {
        Queue<Double> transactionQueue = new LinkedList<>();

        // Simulate bank transactions (enqueue into the queue)
        transactionQueue.offer(100.0);
        transactionQueue.offer(-50.0);
        transactionQueue.offer(200.0);

        // Process transactions (dequeue from the queue)
        while (!transactionQueue.isEmpty()) {
            double transactionAmount = transactionQueue.poll();
            // Process the transaction (e.g., update account balance)
            System.out.println("Transaction: " + transactionAmount);
        }
    }  
}
