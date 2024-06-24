public class EfficiencyTestExample {

    public static void main(String[] args) {
        algorithmEfficiencyTest(); // This executes our test
    }

    // Here is our bubble sort algorithm
    public static void ourBubbleSort(int[] array) {
        int nbrElements = array.length;
        int temp;
        for (int i = 0; i < nbrElements; i++) {
            for (int j = 1; j < (nbrElements - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Method for testing execution time of our bubble sort
    public static void algorithmEfficiencyTest() {
        int[] ourTestArray = new int[30000]; // Array of 30,000 elements
        for (int i = 0; i < ourTestArray.length; i++) {
            ourTestArray[i] = (int) (Math.random() * 30000); // Populate array with random numbers
        }

        long startTime = System.nanoTime(); // Start timer
        ourBubbleSort(ourTestArray); // Execute bubble sort
        long endTime = System.nanoTime(); // End timer

        long duration = (endTime - startTime); // Calculate execution time
        System.out.println("Execution Time (nanoseconds): " + duration);
    }
}
