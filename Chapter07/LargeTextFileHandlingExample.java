import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeTextFileHandlingExample {
    public static void main(String[] args) {
        // Path to the large text file
        String filePath = "advanced_guide_to_java.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Process each line
                // For demonstration, we'll simply print each line
                System.out.println("Line " + (++lineCount) + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

