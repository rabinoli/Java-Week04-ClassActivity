import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        cities.set(1, "Paris");

        cities.removeFirst();
        cities.remove("Tokyo");

        cities.addFirst("Berlin");
        cities.addLast("Sydney");

        for (String city : cities) {
            System.out.println(city);
        }


        cities.clear();
        System.out.println("Size after clearing the linkedlist: " + cities.size());
    }
}
