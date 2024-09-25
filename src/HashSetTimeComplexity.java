import java.util.HashSet;

public class HashSetTimeComplexity {
    public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // HashSet doesn't support index-based read, so we skip "Read by Index"

            // 2. Read by Value (search last element)
            long startTime = System.nanoTime();
            hashSet.contains(size - 1);  // Searching for the last element
            long endTime = System.nanoTime();
            System.out.println("Time taken for reading by value in HashSet of size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // HashSet doesn't support head/tail insertions directly or index-based operations
            // These operations are not practical in HashSet as it's unordered and not indexed.
        }
    }
}
