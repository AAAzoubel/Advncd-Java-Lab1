/*
 * Another part of the lab with Array.
 * It measures the time taken to:
 * 1. Access array elements by index.
 * 2. Search for values manually in the array.
 *
 *
 *
 *
 */

public class ArrayTime {
    public static void main(String[] args) {
        // Define the array sizes to test with
        int[] sizesToBeCalculated = {1000, 10000, 100000, 1000000};

        // Loop to perform the tests for each array size
        for (int size : sizesToBeCalculated) {
            System.out.println("\nTesting Size: " + size);  // Print the current array size being tested

            // Create an array with the specified size
            int[] array = new int[size];

            // Fill the array with sequential values from 0 to size
            for (int i = 0; i < size; i++) {
                array[i] = i;  // Assign value i to index i of the array
            }

            // calculating the time to access the array (reading by index)
            long startTime = System.nanoTime();  // Record the start time before the loop

            // Read all the values from the array
            for (int i = 0; i < size; i++) {
                int val = array[i];  // Read the value at index i of the array
            }

            long endTime = System.nanoTime();  // Record the end time after the loop

            // Calculate and print the time taken to read all the values from the array
            System.out.println("Time took to read index: " + (endTime - startTime) + " ns");

            // calculating the time to "Read by value" in the array (manual search)
            startTime = System.nanoTime();  // Record the start time before the search

            // Search for each value manually by iterating over the array
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (array[j] == i) {  // Check if the value i exists in the array
                        break;  // Break out of the inner loop if found
                    }
                }
            }

            endTime = System.nanoTime();  // Record the end time after the search

            // Print the time taken to perform the "Read by value" operation (manual search)
            System.out.println("Time took to read the value: " + (endTime - startTime) + " ns");
        }
    }
}
