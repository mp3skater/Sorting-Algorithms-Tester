import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] sort(int[] array) {

        // Insert code here:

        return array;
    }

    // You can ignore the main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of the numbers that need to be sorted
        // Max size is parsed in the console
        System.out.print("Please type in the amount of numbers you want to sort: ");
        int[] original_array = new int[sc.nextInt()];

        // Name of the algorithm
        // If nothing, then it remains "Unnamed Algorithm"
        System.out.print("Please type in the name (can be left blank): ");
        String name = sc.next();

        for(int i = 0; i< args.length; i++)
             original_array[i] = (int)(Math.random()*10000000);

        // Measure the time of your algorithm
        int[] array = Arrays.copyOf(original_array, original_array.length);
        long startTime = System.currentTimeMillis();
        sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println((name!=null? name : "Unnamed Algorithm")+": " + (endTime - startTime) + " ms");
    }
}