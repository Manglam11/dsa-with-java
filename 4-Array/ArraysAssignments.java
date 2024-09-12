import java.util.*;;

public class ArraysAssignments {

    public static boolean valueCheking(int n[]) { // O(n*n)

        for (int i = 0; i < n.length; i++) {
            int curr = n[i];
            for (int j = 0; j < n.length; j++) {
                if (i == j) {
                    break;
                } else if (curr == n[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int findingNumber(int n[], int k) {

        for (int i = 0; i < n.length; i++) {
            if (n[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void maxProfit(int n[]) {
        // int maxProfit = Integer.MAX_VALUE;
        // int currProfit = 0;
        for (int i = 0; i < n.length; i++) {

        }
    }

    public static void main(String[] args) {

        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number: ");
        int k = sc.nextInt();
        int result = findingNumber(nums, k);

        if (result == -1) {
            System.out.println("Sorry no. does't exist!");
        } else {
            System.out.println("Your Number is found at index: " + result);
        }
    }
}
