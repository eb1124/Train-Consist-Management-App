import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for ordered train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies in sequence
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        displayTrain(train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        displayTrain(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        displayTrain(train);
    }

    // Method to display train consist
    public static void displayTrain(LinkedList<String> train) {
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}