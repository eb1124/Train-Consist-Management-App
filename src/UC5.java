import java.util.LinkedHashSet;
import java.util.Set;

public class UC5{

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for ordered & unique bogies
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // محاولة إضافة تكرار (duplicate)
        train.add("Sleeper"); // duplicate - will be ignored

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");

        // Display total bogies
        System.out.println("\nTotal bogies: " + train.size());
    }
}