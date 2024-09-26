/*
 * This program tests the performance operations on a LinkedList
 * as part of a lab solution. It calculates the time taken for reading, inserting,
 * and removing elements at different positions (head, middle, and tail).
 *
 * Testing different sizes (1000, 10000, 100000, 1000000):
 * 1. Fills the LinkedList with sequential numbers.
 * 2. Measures read time by index (using get()) and by value (using contains()).
 * 3. Measures insertion times at the head, middle, and tail.
 * 4. Measures removal times from the head, middle, and tail.
 *
 *
 */
import java.util.LinkedList;

public class LinkedListTime {
    public static void main(String[] args) {
        // Define the sizes to be used for testing the LinkedList
        int[] sizesToBeCalculated = {1000, 10000, 100000, 1000000};

        // Loop to perform the tests for each size of LinkedList
        for (int size : sizesToBeCalculated) {
            System.out.println("\nTesting Size: " + size);  // Print the current size being tested

            // Create a new LinkedList
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with sequential values
            for (int i = 0; i < size; i++) {
                linkedList.add(i);  // Add value i to the LinkedList
            }

            // calculating the time to read all elements from the LinkedList by index
            long startTime = System.nanoTime();  // Start measuring time
            for (int i = 0; i < size; i++) {
                int val = linkedList.get(i);  // Access value by index
            }
            long endTime = System.nanoTime();  // End measuring time
            System.out.println("Time took to read the index : " + (endTime - startTime) + " ns");

            // calculating the time for "Read by value" using .contains()
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                linkedList.contains(i);  // Check if the LinkedList contains the value i
            }
            endTime = System.nanoTime();
            System.out.println("Time took to read the value: " + (endTime - startTime) + " ns");

            // calculating the time to insert an element at the head of the LinkedList
            startTime = System.nanoTime();
            linkedList.addFirst(-1);  // Insert value -1 at the head
            endTime = System.nanoTime();
            System.out.println("Time took to insert head: " + (endTime - startTime) + " ns");

            // calculating the time to insert an element in the middle of the LinkedList
            startTime = System.nanoTime();
            linkedList.add(linkedList.size() / 2, -1);  // Insert value -1 in the middle
            endTime = System.nanoTime();
            System.out.println("Time took to insert in the middle: " + (endTime - startTime) + " ns");

            // calculating the time to insert an element at the tail of the LinkedList
            startTime = System.nanoTime();
            linkedList.addLast(-1);  // Insert value -1 at the tail
            endTime = System.nanoTime();
            System.out.println("Time took to insert in the tale: " + (endTime - startTime) + " ns");

            // calculating the time to remove an element from the head of the LinkedList
            startTime = System.nanoTime();
            linkedList.removeFirst();  // Remove the first element from the LinkedList
            endTime = System.nanoTime();
            System.out.println("Time took to remove from the head: " + (endTime - startTime) + " ns");

            // Measure the time to remove an element from the middle of the LinkedList
            startTime = System.nanoTime();
            linkedList.remove(linkedList.size() / 2);  // Remove the middle element
            endTime = System.nanoTime();
            System.out.println("Time took to remove from the middle: " + (endTime - startTime) + " ns");

            // Measure the time to remove an element from the tail of the LinkedList
            startTime = System.nanoTime();
            linkedList.removeLast();  // Remove the last element from the LinkedList
            endTime = System.nanoTime();
            System.out.println("Time took to remove from the tale: " + (endTime - startTime) + " ns");
        }
    }
}
