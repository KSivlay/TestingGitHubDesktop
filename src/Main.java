//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        public class Mergesort {
            void merge(int arr[], int l, int m, int r)
            {
                // Find sizes of two sub arrays to be merged
                int n1 = m - l + 1;
                int n2 = r - m;

                // Create temp arrays
                int L[] = new int[n1];
                int R[] = new int[n2];

                // Copy data to temp arrays
                for (int i = 0; i < n1; ++i)
                    L[i] = arr[l + i];
                for (int j = 0; j < n2; ++j)
                    R[j] = arr[m + 1 + j];

                // Merge the temp arrays

                // Initial indices of first and second sub arrays
                int i = 0, j = 0;

                // Initial index of merged sub array
                int k = l;
                while (i < n1 && j < n2) {
                    if (L[i] <= R[j]) {
                        arr[k] = L[i];
                        i++;
                    }
                    else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }

                // Copy remaining elements of L[] if any
                while (i < n1) {
                    arr[k] = L[i];
                    i++;
                    k++;
                }

                // Copy remaining elements of R[] if any
                while (j < n2) {
                    arr[k] = R[j];
                    j++;
                    k++;
                }
            }

            // Main function that sorts arr[l..r] using
            // merge()
            void sort(int arr[], int l, int r)
            {
                if (l < r) {

                    // Find the middle point
                    int m = l + (r - l) / 2;

                    // Sort first and second halves
                    sort(arr, l, m);
                    sort(arr, m + 1, r);

                    // Merge the sorted halves
                    merge(arr, l, m, r);
                }
            }

            // A utility function to print array of size n
            static void printArray(int[] arr)
            {
                int n = arr.length;
                for (int i = 0; i < n; ++i)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }

            // Driver code
        }

    }
}