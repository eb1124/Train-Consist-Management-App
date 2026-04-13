import java.util.*;

public class UC7 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // HashMap (Bogie -> Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("General", 90);
        bogieCapacity.put("Luxury", 40);

        // Convert Map to List for sorting
        List<Map.Entry<String, Integer>> bogieList =
                new ArrayList<>(bogieCapacity.entrySet());

        // Sort using Comparator (Descending by capacity)
        Collections.sort(bogieList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> b1,
                               Map.Entry<String, Integer> b2) {
                return b2.getValue() - b1.getValue(); // descending
            }
        });

        // Display sorted bogies
        System.out.println("\nBogies sorted by capacity (High to Low):");
        for (Map.Entry<String, Integer> entry : bogieList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}