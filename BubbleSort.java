public class BubbleSort implements SortStrategy {

    // Implements Bubble Sort
    @Override
    public void sort(int[] arr) {
        System.out.println("\n - Using Bubblesort - ");
        int l = arr.length - 1;
        for (int i = 0; i < l; i++) {
            for(int j = 0; j < l-i; j++) {
                if(arr[j+1] < arr[j]) {
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] -= arr[j];
                    arr[j] += arr[j+1];
                }
            }
        }
    }
}
