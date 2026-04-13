import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Initial state
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // --- Adding Passenger Bogies ---
        trainConsist.add("Passenger Bogie 1");
        trainConsist.add("Passenger Bogie 2");
        trainConsist.add("Passenger Bogie 3");

        System.out.println("\nAfter adding bogies:");
        displayTrain(trainConsist);

        // --- Removing a Bogie ---
        trainConsist.remove("Passenger Bogie 2");

        System.out.println("\nAfter removing Passenger Bogie 2:");
        displayTrain(trainConsist);

        // --- Checking if a Bogie Exists ---
        String checkBogie = "Passenger Bogie 1";
        if (trainConsist.contains(checkBogie)) {
            System.out.println("\n" + checkBogie + " exists in the train.");
        } else {
            System.out.println("\n" + checkBogie + " does NOT exist.");
        }
    }

    // Method to display train consist
    public static void displayTrain(List<String> trainConsist) {
        System.out.println("Total bogies: " + trainConsist.size());
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}