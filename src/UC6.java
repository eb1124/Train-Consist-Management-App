import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogies with capacity
        bogieCapacity.put("Engine", 0);       // Engine has no seating
        bogieCapacity.put("Sleeper", 72);     // Passenger capacity
        bogieCapacity.put("AC", 50);
        bogieCapacity.put("Cargo", 100);      // Load capacity
        bogieCapacity.put("Guard", 5);

        // Display bogie details
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Access specific bogie capacity
        System.out.println("\nSleeper Capacity: " + bogieCapacity.get("Sleeper"));

        // Check if a bogie exists
        if (bogieCapacity.containsKey("AC")) {
            System.out.println("AC bogie exists in the train.");
        }

        // Total capacity calculation
        int totalCapacity = 0;
        for (int cap : bogieCapacity.values()) {
            totalCapacity += cap;
        }
        System.out.println("\nTotal Train Capacity: " + totalCapacity);
    }
}