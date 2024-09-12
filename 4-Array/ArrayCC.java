import java.util.*;

public class ArrayCC {

    public static boolean linearSearch(String numbers[], String key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return true;
            }
        }
        return false;

    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];

            }

        }
        return largest;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {// right
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reversedArray(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;

        }
    }

    public static void printPairs(int nubmers[]) {
        // 1st element
        for (int i = 0; i < nubmers.length; i++) {
            int curr = nubmers[i]; // 2, 4, 6 , 8...
            // 2nd element
            for (int j = i + 1; j < nubmers.length; j++) {
                System.out.print("(" + curr + "," + nubmers[j] + ")");
            }
            System.out.println();
        }

    }

    public static void subArrays(int nubmers[]) {

        for (int i = 0; i < nubmers.length; i++) {

            for (int j = i; j < nubmers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {

                    // System.out.print(nubmers[k] + " ");
                    sum += nubmers[k];
                }

                System.out.print("sum: " + sum);
                System.out.println();
            }

            System.out.println();
        }

    }

    public static void maxSubArrays(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {

                    sum += numbers[k];
                    // sum max
                    if (sum > maxSum) {
                        maxSum = sum;
                    }

                }
                System.out.print("sum of sub arrays is: " + sum);
                System.out.println();

            }
            System.out.println();
        }
        System.out.print("The maximum of subarray is: " + maxSum);

        System.out.println();
    }

    public static void kadaneAlgo(int n[]) {
        int sumMax = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n.length; i++) {
            currSum += n[i];
            currSum = currSum < 0 ? 0 : currSum;
            sumMax = sumMax < currSum ? currSum : sumMax;

        }
        System.out.println(sumMax);

    }

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // calculate left max boundry - aarya
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundry - aarya
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(lmb, rmb)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static int buyAndSellStocks(int n[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < n.length; i++) {
            if (buyPrice < n[i]) {
                int profit = n[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = n[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        /*
         * int numbers[] = { 1, 2, 3, 5, 45, 7498324, 23434, 56 };
         * int key = 56;
         * int n = Math.inf
         * String menu[] = { "idli", "dosa", "idli-fry", "samosa", "chay" };
         * String order = "adsfsdf";
         * boolean index = linearSearch(menu, order);
         * if (index == false) {
         * System.out.println("Sorry! We don't recommend it.");
         * } else {
         * System.out.println("Lelo " + order);
         * }
         */

        /*
         * int numbers[] = { 1, 3, 5, 9, 2343434, Integer.MAX_VALUE };
         * System.out.println(getLargest(numbers));
         */

        /*
         * int numbers[] = { 1, 3, 5, 6, 78, 9090, 10000 };
         * int key = 0;
         * int index = binarySearch(numbers, key);
         * if (index == -1) {
         * System.out.println("NOT found!");
         * } else
         * System.out.println("Value found at index: " + index);
         */

        /*
         * int numbers[] = { 1, 3, 5, 6, 78, 9090, 10000 };
         * reversedArray(numbers);
         * for (int i = 0; i < numbers.length; i++) {
         * 
         * System.out.println(numbers[i]);
         * }
         */
        // int numbers[] = { 1, -2, 6, -1, 3 };
        /*
         * int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
         * int height[] = { 4, 2, 0, 6, 3, 2, 5 };
         * System.out.println(trappedRainWater(height));
         */

        int height[] = { 4, 2, 4, 6, 3, 2, 5 };
        System.out.println(buyAndSellStocks(height));
    }
}