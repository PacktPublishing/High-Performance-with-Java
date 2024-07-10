import java.util.Stack;

public class Example8 {
    public static void main(String[] args) {
        Stack<Double> transactionStack = new Stack<>();

        // Simulate bank transactions (pushing onto the stack)
        transactionStack.push(100.0);
        transactionStack.push(-50.0);
        transactionStack.push(200.0);

        // Process transactions (pop from the stack)
        while (!transactionStack.isEmpty()) {
            double transactionAmount = transactionStack.pop();
            // Process the transaction (e.g., update account balance)
            System.out.println("Transaction: " + transactionAmount);
        }
    }
}
