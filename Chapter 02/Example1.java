import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> hr_numbers = new ArrayList<>();

        // Add elements to the list
        hr_numbers.add(1983);
        hr_numbers.add(2008);

        // Access elements by index
        int startYear = hr_numbers.get(0); 
        int endYear = hr_numbers.get(1); 

        // Add another element to the list
        hr_numbers.add(endYear-startYear);

        // Iterate through the list
        for (int number : hr_numbers) {
            System.out.println(number);
        }
    }
}
