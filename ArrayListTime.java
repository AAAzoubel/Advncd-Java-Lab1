/*
 * Another part of the lab, now calculating the time inside an arraylist
 * It measures the time taken to:
 * 1. Read elements by index and value.
 * 2. Insert elements at the head, middle, and tail.
 * 3. Remove elements from the head, middle, and tail.
 *
 *
 *
 */
//importing library to create the arraylist
import java.util.ArrayList;

public class ArrayListTime {
    public static void main(String[] args) {
        // Define the sizes to be used for testing the ArrayList
        int[] sizesToBeCalculated = {1000, 10000, 100000, 1000000};

        // Loop to perform the tests for each size of the ArrayList
        for (int size : sizesToBeCalculated) {
            System.out.println("\nTesting Size: " + size);  // Print the current size being tested

            // Create a new ArrayList
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with sequential values
            for (int i = 0; i < size; i++) {
                arrayList.add(i);  // Add value i to the ArrayList
            }

            // calculating the time to read all elements from the ArrayList by index
            long startTime = System.nanoTime();  // Start measuring time
            for (int i = 0; i < size; i++) {
                int val = arrayList.get(i);  // Access value by index
            }
            long endTime = System.nanoTime();  // End measuring time
            System.out.println("Time took to read the index: " + (endTime - startTime) + " ns");

            // calculating the time for "Read by value" using .contains()
            startTime = System.nanoTime();  // Start calculating time
            for (int i = 0; i < size; i++) {
                arrayList.contains(i);  // Check if the ArrayList contains the value i
            }
            endTime = System.nanoTime();  // End measuring time
            System.out.println("Time took to read the value: " + (endTime - startTime) + " ns");

            // calculating the time to insert an element at the head of the ArrayList
            startTime = System.nanoTime();
            arrayList.add(0, -1);  // Insert value -1 at the head (index 0)
            endTime = System.nanoTime();
            System.out.println("Time took to insert at head: " + (endTime - startTime) + " ns");

            // calculating the time to insert an element in the middle of the ArrayList
            startTime = System.nanoTime();
            arrayList.add(arrayList.size() / 2, -1);  // Insert value -1 in the middle of the ArrayList
            endTime = System.nanoTime();
            System.out.println("Time took to insert in the middle: " + (endTime - startTime) + " ns");

            // calculating the time to insert an element at the tail of the ArrayList
            startTime = System.nanoTime();
            arrayList.add(-1);  // Insert value -1 at the tail (end)
            endTime = System.nanoTime();
            System.out.println("Time took to insert at tale: " + (endTime - startTime) + " ns");

            // calculating the time to remove an element from the head of the ArrayList
            startTime = System.nanoTime();
            arrayList.remove(0);  // Remove the first element from the ArrayList
            endTime = System.nanoTime();
            System.out.println("Time took to remove from head: " + (endTime - startTime) + " ns");

            // calculating the time to remove an element from the middle of the ArrayList
            startTime = System.nanoTime();
            arrayList.remove(arrayList.size() / 2);  // Remove the middle element
            endTime = System.nanoTime();
            System.out.println("Time took to remove from middle: " + (endTime - startTime) + " ns");

            // calculating the time to remove an element from the tail of the ArrayList
            startTime = System.nanoTime();
            arrayList.remove(arrayList.size() - 1);  // Remove the last element from the ArrayList
            endTime = System.nanoTime();
            System.out.println("Time took to remove from taile: " + (endTime - startTime) + " ns");
        }
    }
}
