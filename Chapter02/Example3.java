import java.util.Vector;
import java.util.Enumeration;

public class Example3 {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> luckyNumbers = new Vector<>();

        // Add elements to the Vector
        luckyNumbers.add(8);
        luckyNumbers.add(19);
        luckyNumbers.add(24);

        // Access elements by index
        int firstNumber = luckyNumbers.get(0); 
        int secondNumber = luckyNumbers.get(2); 

        // Iterate through the Vector using Enumeration 
        Enumeration<Integer> enumeration = luckyNumbers.elements();
        while (enumeration.hasMoreElements()) {
            int number = enumeration.nextElement();
            System.out.println(number);
        }

        // Remove an element by value
        luckyNumbers.removeElement(19);

        // Check if the Vector contains an element
        boolean containsNineteen= luckyNumbers.contains(19); 
        System.out.println(containsNineteen);

        // Get the size of the Vector
        int mySize = luckyNumbers.size(); 
        System.out.println("You have " + mySize + " lucky numbers.");
    }
    
}
