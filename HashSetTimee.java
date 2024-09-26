/*
 * This is another part of the lab solution with HashSet
 * Objective is the time it takes to check if certain values exist in the HashSet
 * using the contains() method.
 *
 * Testing again with different sizes (1000, 10000, 100000, 1000000):
 * 1. Fills the HashSet with sequential numbers.
 * 2. Measures the time to check if each value is contained in the HashSet.
 *
 *
 *
 *
 */


//Necessary library to make the code work, use to create the hash set
import java.util.HashSet;

public class HashSetTimee {
    public static void main(String[] args) {
        // Defining the sizes to be used for testing the HashSet inside a list
        int[] sizesToBeCalculated = {1000, 10000, 100000, 1000000};

        // Loop to perform the tests for each size of HashSet
        for (int size : sizesToBeCalculated) {
            System.out.println("\nTesting Size: " + size);  // Print the current size being tested

            // Create a new HashSet
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with sequential values
            for (int i = 0; i < size; i++) {
                hashSet.add(i);  // Add value i to the HashSet
            }

            // calculating the time for "Read by value" using .contains()
            long startTime = System.nanoTime();  // Start measuring time
            for (int i = 0; i < size; i++) {
                hashSet.contains(i);  // It is going to check if the HashSet contains the value i
            }
            long endTime = System.nanoTime();  // End measuring time
            System.out.println("Time took to read the value: " + (endTime - startTime) + " ns");//printing the time took to read the values
        }
    }
}
