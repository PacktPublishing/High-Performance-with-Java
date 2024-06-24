import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Example5 {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

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
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number == 8) {
                iterator.remove();
            }
        }

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
