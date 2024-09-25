import java.util.ArrayList;

public class ArrayList2 {
    public static void main (String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Modify an element
        fruits.set(1, "Mango");

        // Remove an element
        fruits.remove("Orange");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits);

        // Check size
        System.out.println("Size: " + fruits.size());

        // Loop through ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if it contains "Mango"
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list!");
        }

        // Clear the ArrayList
        fruits.clear();
        System.out.println("Size after clearing the arraylist: " + fruits.size());
    }
}
