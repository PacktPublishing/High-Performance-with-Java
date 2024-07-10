import java.util.EmptyStackException;

public class Example9 {
    private double[] stack;
    private int top;

    public Example9(int capacity) {
        stack = new double[capacity];
        top = -1;
    }

    public void push(double transactionAmount) {
        if (top == stack.length - 1) {
            // Stack is full, handle overflow (e.g., resize or throw an exception)
            throw new RuntimeException("Stack is full.");
        }
        stack[++top] = transactionAmount;
    }

    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Example9 transactionStack = new Example9(10);

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
