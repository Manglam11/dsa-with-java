
public class MergeSortPractice {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergSort(int arr[], int si, int ei) {
        // base-case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        mergSort(arr, si, mid); // left-side
        mergSort(arr, mid + 1, ei); // right-side
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si; // left-side iterator
        int j = mid + 1; // right-side iterator
        int k = 0; // temp arr iterator

        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 23, 1, 2, 78, -52 };
        mergSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
