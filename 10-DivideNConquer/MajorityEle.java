public class MajorityEle {

    public static int striahtMethod(int arr[]) {
        int temp[] = new int[10];
        int tempVar = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    tempVar++;
                }
                tempVar = temp[k];
            }
            k++;
        }

        for (int i = 0; i < temp.length; i++) {
            // if (condition) {

            // }
        }
        return -1;
    }

    public static void findMajorityEle(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        findMajorityEle(arr, si, mid);// left-side
        findMajorityEle(arr, mid + 1, ei);// right-side
        merge(arr, si, mid, ei);
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp = 0;
        int i = si; // iterator for left-side
        int j = mid + 1; // iterator for right-side
        // int k = 0; // iterator for temp array

        while (i <= mid && j <= ei || i <= mid || j <= ei) {
            if (arr[i] == arr[j]) {
                temp++;

            }
            i++;
            j++;

        }
        /*
         * // left-side
         * while (i <= mid) {
         * temp[k++] = arr[i++];
         * }
         * // right-side
         * while (j <= ei) {
         * temp[k++] = arr[j++];
         * }
         * // copy temp to original arr
         * for (k = 0, i = si; k < temp.length; k++, i++) {
         * arr[i] = temp[k];
         * }
         */
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        System.out.println(merge(arr, 0, arr.length - 1, 0));
    }
}
