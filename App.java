import java.util.Arrays;
import java.util.Scanner;

// Uses the strategy to sort an array

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a strategy
        System.out.println("Pick a strategy to sort the array:\n"
            + "0: Bubble sort\n"
            + "1: Merge sort\n"
            + "2: Selection sort");
        int input = sc.nextInt();
        SortStrategy s;

        switch(input) {
            case 0:
                s = new BubbleSort();
                break;
            case 1:
                s = new MergeSort();
                break;
            case 2:
                s = new SelectionSort();
                break;
            default:
                s = null;
        }

        // The array to sort
        int[] arr = {1, 5, 2, 7, 9, 0, 3, 6, 8, 4};
        long time = 0; // Time taken to sort the array

        if(s != null) {
            long start = System.nanoTime();
            s.sort(arr); // Sort the array using the selected strategy
            long end = System.nanoTime();
            time = (end - start);
        }

        else {
            // Just use the built-in sort method
            Arrays.sort(arr);
        }

        for(int i : arr) {
            // Print the array using good coding practices
            System.out.printf("%s%d"+(i == 9 ? "\n" : ", "), (i == 0 ? "Sorted array:\n" : ""), i);
        }
        System.out.printf("Time taken to sort: %.2f ms.", (float) time / 100000);

        sc.close();
    }
}
