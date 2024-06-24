import java.util.LinkedList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        List<Integer> numbers = new LinkedList<>();

        // Add elements to the LinkedList
        numbers.add(3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(9);

        // Iterate through the LinkedList
        System.out.println("Initial LinkedList elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove an element by value
        numbers.remove(Integer.valueOf(8)); // Removes the first occurrence of 8

        // Check if the LinkedList contains an element
        boolean containsThree = numbers.contains(3); 
        System.out.println("\nThe question of 3: " + containsThree);
        boolean containsEight = numbers.contains(8); 
        System.out.println("The question of 8: " + containsEight);

        // Iterate through the LinkedList
        System.out.println("\nModified LinkedList elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    
}
