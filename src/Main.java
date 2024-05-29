import java.util.Scanner;

public class Main {
    private static int[] array;

    private static void sort() {

        // Insert code here:

    }

    // Method that changes two numbers in an array
    public static void swap(int index1, int index2) {
        // Illegal parameters
        if (array == null || index1 >= array.length ||
                index2 >= array.length || index1 < 0 || index2 < 0)
            throw new IllegalArgumentException("Invalid array or indices");

        // Swap the elements
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Example sorting algorithm (selection sort)
    private static void exampleSort() {
        for (int i = 0; i < array.length-1; i++) {
            // Determine the smallest number
            int smallest = i;
            for (int j = i; j<array.length; j++) {
                int ne = array[j];
                int nooo = array[smallest];
                smallest = array[j]<array[smallest]? j : smallest;
            }

            // Replace it with the last one
            swap(i, smallest);
        }
    }

    // You can ignore the main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of the numbers that need to be sorted
        // Max size is parsed in the console
        System.out.print("Please type in the amount of numbers you want to sort: ");
        array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) array[i] = (int) (Math.random() * 10000000);

        // Name of the algorithm
        // If nothing, then it remains "Unnamed Algorithm"
        System.out.print("Please type in the name: ");
        String name = sc.next();
        sc.close();

        // Measure the time of your algorithm
        long startTime = System.currentTimeMillis();
        exampleSort();
        long endTime = System.currentTimeMillis();
        System.out.println((name != null ? name : "Unnamed Algorithm") + ": " + (endTime - startTime) + " ms");

        // Testing if the algorithm has worked correctly
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            // When the sorted numbers aren't really sorted
            if (temp > array[i]) {
                System.err.println("The operation was unsuccessful!");
                System.err.println("The First mistake was this: "+temp+" is accually bigger than "+array[i]);
                System.err.println("Here is the result:");
                for (int num : array) System.err.print(num + ", ");
                return;
            }
            temp = array[i];
        }
        System.out.println("The operation was successful, good job!");
    }
}