
public class Recursion {
    public static void printInc(int count, int n) {

        if (count == n) {
            System.out.println(count);
            return;
        }
        System.out.print(count + " ");
        printInc(count + 1, n);
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc_2(int n) {

        if (n == 1) {
            System.out.print(n);
            return;
        }
        printInc_2(n - 1);
        System.out.print(n + " ");

    }

    public static int printFac(int n) {
        if (n == 0) {
            // System.out.print(n);

            return 1;
        }

        int fac = n * printFac(n - 1);

        return fac;
    }

    public static int calSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + calSum(n - 1);
        return sum;

    }

    public static int calFibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int fibo = calFibo(n - 1) + calFibo(n - 2);
        return fibo;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);

    }

    public static int lastOccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i + 1);
        if (arr[i] == key && isFound == -1) {
            return i;
        }
        return isFound;

    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tillingProblem(int n) { // 2 X n (floor size)
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int verticalChoice = tillingProblem(n - 1);

        // horizontal choice
        int horizontalChoice = tillingProblem(n - 2);

        return verticalChoice + horizontalChoice;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean arr[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (arr[currChar - 'a'] == true) {
            // duplicates
            removeDuplicates(str, idx + 1, newStr, arr);
        } else {
            arr[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), arr);
        }
    }

    public static int pairingProble(int n) {
        if (n == 2 || n == 1) {
            return n;
        }

        int nm1 = pairingProble(n - 1);
        int nm2 = pairingProble(n - 2) * (n - 1);
        return nm1 + nm2;
    }

    public static void printBinStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        /*
         * int n = 26;
         * 
         * // printDec(n);f
         * // printInc(1, n);
         * // System.out.println(printFac(n));
         * // // System.out.println(calSum(n));System.out.println(calFibo(23));
         * // System.out.println(calFibo(24));
         * // System.out.println(calFibo(25));
         * // System.out.println(calFibo(26));
         * // System.out.println(calFibo(27));
         * // System.out.println(calFibo(28));
         * // System.out.println(calFibo(29));
         * 
         * // int arr[] = { 1, 2, 3, 4, 4, 5 };
         * // // System.out.println(isSorted(arr, 0));
         * // // System.out.println(firstOccur(arr, 5, 0));
         * // System.out.println(lastOccur(arr, 4, 0));
         * 
         * // System.out.println(power(2, 10));
         * System.out.println(optimizedPower(2, 10));
         * ;System.out.println(tillingProblem(4));
         * 
         * 
         * int a = (int) 'c' - 'a';
         * // char b = 'z';
         * System.out.println(a);
         * 
         * String str = "manglam";
         * removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
         * 
         * System.out.println(pairingProble(2));
         */
        printBinStrings(10, 0, "");
    }
}
