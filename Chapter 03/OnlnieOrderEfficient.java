    // This Java application is provided without data, only
    // sufficient code to illustrate the points made in 
    // chapter 3.

import java.util.ArrayList;
import java.util.List;

public class OnlnieOrderEfficient {
    public static void main(String[] args) {
        List<String> orderIDs = getOrderIDs();
        int index = 0; 
        int orderCount = orderIDs.size(); 

        while (index < orderCount) {
            String orderID = orderIDs.get(index);
            if (!orderID.startsWith("OL")) {
                orderIDs.set(index, "OL" + orderID);
            }
            index++;
        }

        System.out.println("Updated Order IDs: " + orderIDs);
    }

    private static List<String> getOrderIDs() {
        // Not implemented; provided for structure.
        return new ArrayList<>();
    }
    
}
