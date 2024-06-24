public class StackandHeapExample {

    // Method to recursively call itself to produce a StackOverflowError
    public static void causeStackOverflow() {
        causeStackOverflow();
    }

    // Method to allocate memory to cause an OutOfMemoryError
    public static void causeOutOfMemory() {
        long[] largeArray = new long[Integer.MAX_VALUE];
    }

    public static void main(String[] args) {
        // Catch StackOverflowError
        try {
            causeStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError");
        }

        // Catch OutOfMemoryError
        try {
            causeOutOfMemory();
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError");
        }
    }
}
