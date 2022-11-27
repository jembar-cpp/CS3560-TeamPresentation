public class MergeSort implements SortStrategy {

    /**
     * Implements Merge Sort
     * Code modified from https://www.geeksforgeeks.org/merge-sort/
     */
    @Override
    public void sort(int[] arr) {
        System.out.println("\n - Using Mergesort - ");

        // Overloaded method - invoke default sort
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + j + 1];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
