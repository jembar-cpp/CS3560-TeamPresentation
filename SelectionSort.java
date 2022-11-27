public class SelectionSort implements SortStrategy {

    // Implements Selection Sort
    @Override
    public void sort(int[] arr) {
        System.out.println("\n - Using Selection sort - ");
        int l = arr.length - 1;
        for (int i = 0; i < l; i++) {
            int m = i;
            for(int j = i + 1; j < l + 1; j++) {
                if(arr[j] < arr[m]) {
                    m = j;
                }
            }
            if(m != i) {
                arr[i] = arr[m] - arr[i];
                arr[m] -= arr[i];
                arr[i] += arr[m];
            }
        }
    }
}
