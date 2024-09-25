import java.util.ArrayList;

public class TimeComplexityArrayList {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // 1. Read by Index (Middle)
            long startTime = System.nanoTime();
            int element = arrayList.get(size / 2);  // Reading from the middle
            long endTime = System.nanoTime();
            System.out.println("Time taken for reading by index in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 2. Read by Value (search last element)
            startTime = System.nanoTime();
            arrayList.contains(size - 1);  // Searching for the last element
            endTime = System.nanoTime();
            System.out.println("Time taken for reading by value in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 3. Insert at Head
            startTime = System.nanoTime();
            arrayList.add(0, -1);  // Insert at head
            endTime = System.nanoTime();
            System.out.println("Time taken for insertion at head in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 4. Insert at Mid
            startTime = System.nanoTime();
            arrayList.add(size / 2, -1);  // Insert in the middle
            endTime = System.nanoTime();
            System.out.println("Time taken for insertion in the middle in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 5. Insert at Tail
            startTime = System.nanoTime();
            arrayList.add(-1);  // Insert at the tail
            endTime = System.nanoTime();
            System.out.println("Time taken for insertion at tail in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 6. Delete from Head
            startTime = System.nanoTime();
            arrayList.remove(0);  // Remove from head
            endTime = System.nanoTime();
            System.out.println("Time taken for deletion from head in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 7. Delete from Mid
            startTime = System.nanoTime();
            arrayList.remove(size / 2);  // Remove from middle
            endTime = System.nanoTime();
            System.out.println("Time taken for deletion from middle in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 8. Delete from Tail
            startTime = System.nanoTime();
            arrayList.remove(arrayList.size() - 1);  // Remove from tail
            endTime = System.nanoTime();
            System.out.println("Time taken for deletion from tail in ArrayList of size " + size + ": " + (endTime - startTime) + " nanoseconds");
        }
    }
}
