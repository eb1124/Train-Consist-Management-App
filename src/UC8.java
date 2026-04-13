import java.util.*;
import java.util.stream.Collectors;

public class UC8 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Bogie -> Capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("General", 90);
        bogieCapacity.put("Luxury", 40);
        bogieCapacity.put("Cargo", 120);

        // Filter: Only high-capacity passenger bogies (>= 60)
        List<Map.Entry<String, Integer>> filteredBogies =
                bogieCapacity.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() >= 60) // condition
                        .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nHigh Capacity Bogies (>= 60):");
        filteredBogies.forEach(entry ->
                System.out.println(entry.getKey() + " -> " + entry.getValue())
        );
    }
}