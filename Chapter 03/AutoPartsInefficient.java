    // This Java application is provided without data, only
    // sufficient code to illustrate the points made in 
    // chapter 3.

import java.util.ArrayList;
import java.util.List;

public class AutoPartsInefficient {
    public static void main(String[] args) {
        List<String> autoParts = getAutoParts(); // You will need to populate this array
        for (String part : autoParts) {
            processPart(part);
        }
    }

    private static List<String> getAutoParts() {
        // Not implemented; provided for structure.
        return new ArrayList<>();
    }

    private static void processPart(String part) {
        // Not implemented; provided for structure.
    }
    
}
