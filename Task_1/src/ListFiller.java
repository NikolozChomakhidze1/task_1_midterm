import java.util.List;
import java.util.ArrayList;

/**
 * The {@code ListFiller} class demonstrates how to manipulate arrays and lists in Java.
 * This program fills a list with values based on index positions provided by an array,
 * then prints the resulting list.
 *
 * The program works with two arrays:
 * 1. {@code list1} - an integer array representing indices of the second array.
 * 2. {@code list2} - a string array that holds the values that will be added to a new list
 *    based on the indices in {@code list1}.
 *
 * It uses these arrays to populate a {@code List<String>} by using the values in {@code list1}
 * as the indices to fetch corresponding values from {@code list2}.
 * Finally, it prints the newly populated list.
 *
 * Example:
 * The program prints the following output:
 * {@code list3: [tfd, rrc, gxq, pzd, oia, hjk, beg, mny, byv]}
 *
 * This demonstrates the basic use of arrays, lists, and the concept of indexed access in Java.
 */
public class ListFiller {

    /**
     * The main method is the entry point for this program.
     * It initializes two arrays, populates a list based on those arrays,
     * and prints the populated list to the console.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Declare and initialize the arrays
        int[] list1 = {9, 7, 3, 4, 10, 5, 8, 6, 1, 2};
        String[] list2 = {
                "mfv", "mny", "byv", "gxq", "pzd", "hjk", "beg", "rrc", "ygk", "tfd", "oia", "qch"
        };

        // Create a list to store the results
        List<String> list3 = new ArrayList<>();

        // Populate list3 by adding elements from list2 using indices from list1
        for (int index : list1) {
            list3.add(list2[index]);
        }

        // Print out the contents of list3
        System.out.println("list3: " + list3);
    }
}
