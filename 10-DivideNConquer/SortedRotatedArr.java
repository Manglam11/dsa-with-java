public class SortedRotatedArr {

    public static int search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }

        // on line L1
        if (arr[si] <= arr[mid]) {
            // case a: left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // case b: right
            else {
                return search(arr, target, mid + 1, ei);

            }
        } // on line L2
        else {
            // case c: right
            if (target <= arr[ei] && target >= arr[mid]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d: left
            else {
                return search(arr, target, si, mid - 1);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 52; // output -> 4
        int answer = search(arr, target, 0, arr.length - 1);
        System.out.println(answer);
    }
}
