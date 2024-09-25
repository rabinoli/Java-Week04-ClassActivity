import java.util.Set;
import java.util.HashSet;

public class Sett {
    public static void main(String[] args) {
    
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.add("Alice");

        if (names.contains("Alice")) {
            System.out.println("Alice is in the set!");
        }

        names.remove("Charlie");

        System.out.println("Set size of the set: " + names.size());

        for (String name : names) {
            System.out.println(name);
        }
    }
}
