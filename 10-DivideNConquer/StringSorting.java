public class StringSorting {
    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);// left-side
        mergeSort(arr, mid + 1, ei);// right-side
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si; // iterator for left-side
        int j = mid + 1; // iterator for right-side
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            // String temp1 = arr[i];
            // String temp2 = arr[j];
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        // left-side
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right-side
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        /*
         * char a = 'a';
         * char b = 'b';
         * if (a < b) {
         * System.out.println(true);
         * }
         */

        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
