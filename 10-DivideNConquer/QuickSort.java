
public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // pivot element
        int pInd = partition(arr, si, ei);
        quickSort(arr, si, pInd - 1);
        quickSort(arr, pInd + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make places for elm smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] >= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 23, 1, 2, 78, -52 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
