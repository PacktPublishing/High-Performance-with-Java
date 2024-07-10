import java.util.LinkedList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        List<String> petNames = new LinkedList<>();

        // Add elements to the LinkedList
        petNames.add("Brandy");
        petNames.add("Muzz");
        petNames.add("Java");
        petNames.add("Bougie");

        // Access elements by index
        String firstPet = petNames.get(0); 
        String secondPet = petNames.get(1);

        // Iterate through the LinkedList
        for (String pet : petNames) {
            System.out.println(pet);
        }

        // Remove an element by value
        petNames.remove("Brandy");

        // Check if the LinkedList contains an element
        boolean containsBrandy = petNames.contains("Brandy"); 
        System.out.println(containsBrandy);

        // Get the size of the LinkedList
        int size = petNames.size(); 
        System.out.println("You have " + size + " pets.");
    }
    
}
