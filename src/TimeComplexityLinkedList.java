import java.util.LinkedList;

public class TimeComplexityLinkedList {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // 1. Read by Index (Middle)
            long startTime = System.nanoTime();
            int element = linkedList.get(size / 2);  // Reading from the middle
            long endTime = System.nanoTime();
            System.out.println("Time taken for reading by index in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 2. Read by Value (search last element)
            startTime = System.nanoTime();
            linkedList.contains(size - 1);  // Searching for the last element
            endTime = System.nanoTime();
            System.out.println("Time taken for reading by value in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 3. Insert at Head
            startTime = System.nanoTime();
            linkedList.addFirst(-1);  // Insert at head
            endTime = System.nanoTime();
            System.out.println("Time taken for insertion at head in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 4. Insert at Mid
            startTime = System.nanoTime();
            linkedList.add(size / 2, -1);  // Insert in the middle
            endTime = System.nanoTime();
            System.out.println("Time taken for insertion in the middle in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 5. Insert at Tail
            startTime = System.nanoTime();
            linkedList.addLast(-1);  // Insert at the tail
            endTime = System.nanoTime();
            System.out.println("Time taken for insertion at tail in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 6. Delete from Head
            startTime = System.nanoTime();
            linkedList.removeFirst();  // Remove from head
            endTime = System.nanoTime();
            System.out.println("Time taken for deletion from head in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 7. Delete from Mid
            startTime = System.nanoTime();
            linkedList.remove(size / 2);  // Remove from middle
            endTime = System.nanoTime();
            System.out.println("Time taken for deletion from middle in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // 8. Delete from Tail
            startTime = System.nanoTime();
            linkedList.removeLast();  // Remove from tail
            endTime = System.nanoTime();
            System.out.println("Time taken for deletion from tail in LinkedList of size " + size + ": " + (endTime - startTime) + " nanoseconds");
        }
    }
}
