import java.lang.reflect.Array;
import java.util.*;

public class BasicSorting {

    public static void bubbleSort(int n[]) {
        for (int turn = 0; turn < n.length; turn++) {
            int swap = 0;

            for (int i = 0; i < n.length - 1 - turn; i++) {

                if (n[i] > n[i + 1]) {
                    // swap
                    int temp = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = temp;

                    swap++;
                }

            }
            // if no elemnts were swapped, the array is already sorted
            if (swap == 0) {
                break;
            }

        }
    }

    public static void selectionSort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n.length - 1; j++) {
                if (n[j] < n[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = n[smallest];
            n[smallest] = n[i];
            n[i] = temp;

        }
    }

    public static void insertionSort(int n[]) {
        for (int i = 1; i < n.length; i++) {
            int curr = n[i];
            int prev = i - 1;
            // finding out correct position to insert
            while (prev >= 0 && n[prev] > curr) {
                n[prev + 1] = n[prev];
                prev--;
            }
            // insertion
            n[prev + 1] = curr;
        }
    }

    public static void coutSort(int n[]) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            maximum = Math.max(maximum, n[i]);
        }

        int count[] = new int[maximum + 1];
        for (int i = 0; i < n.length; i++) {
            count[n[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                n[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 4, 66, 34, 56, 68 };
        // int arr[] = { 1, 2, 6, 44, 66, 340, 560, 680 };
        // insertionSort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr, 1, 6);
        coutSort(arr);
        printArr(arr);
    }
}