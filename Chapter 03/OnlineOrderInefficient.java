    // This Java application is provided without data, only
    // sufficient code to illustrate the points made in 
    // chapter 3.
import java.util.ArrayList;
import java.util.List;

public class OnlineOrderInefficient {
    public static void main(String[] args) {
        List<String> orderIDs = getOrderIDs(); // You will need to populate this list
        int index = 0; 

        while (index < orderIDs.size()) {
            String orderID = orderIDs.get(index);
            if (!orderID.startsWith("OL")) {
                orderID = "OL" + orderID;
                orderIDs.set(index, orderID);
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
