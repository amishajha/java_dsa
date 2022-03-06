import java.util.Arrays;

// Merge sort in Java

class Merge {

    // Merge two sub arrays L and M into array






        
    

    // Divide the array into two sub arrays, sort them and merge them


 static   void merge(int arr[], int p, int q, int r) {
        int merged[] = new int[r - p + 1];
        int idx1 = p;
        int idx2 = q + 1;
        int x = 0;

        while (idx1 <= q && idx2 <= r) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];

            } else {
                merged[x++] = arr[idx2++];

            }

            while (idx1 <= q) {
                merged[x++] = arr[idx1++];

            }

            while (idx2 <= r) {
                merged[x++] = arr[idx2++];
            }

            for (int i = 0, j = p; i < merged.length; i++, j++) {
                arr[j] = merged[i];
            }

        }

    }



    public static void mergeSort(int array[], int left, int right) {
        if (left < right) {

            // m is the point where the array is divided into two sub arrays
            int mid = left + (right - left) / 2;

            // recursive call to each sub arrays
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted sub arrays
            merge(array, left, mid, right);
        }
    }
    public static void main(String args[]) {

        // created an unsorted array
        int array[] = { 2,3,1,9,8};


        // call the method mergeSort()
        // pass argument: array, first index and last index
mergeSort(array, 0, array.length - 1);
for(int i=0;i<array.length;i++){
    System.out.println(array[i]);
}

    }
}

