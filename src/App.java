import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
       
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Mango");

        fruits.remove("Orange");

        System.out.println("List size: " + fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list!");
        }

        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        fruits.clear();
        System.out.println("Size after clearing the list: " + fruits.size());
    }
}
