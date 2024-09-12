public class RecursionPractice {

    public static void findOccur(int arr[], int key, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == key) {
            System.out.print(index + " ");
        }
        findOccur(arr, key, ++index);
    }

    public static void engString(String arr[], int n) {

        if (n == 0) {
            return;
        }
        engString(arr, n / 10);
        int lastDigit = n % 10;

        System.out.print(arr[lastDigit] + " ");

    }

    public static int strLength(String str) {
        if (str == "") {
            return 0;
        }

        return strLength(str.substring(1)) + 1;
    }

    public static int countSubString(String s, int start, int end) {
        // aba = a, aba, b, a ***** XXXX-> ab, ba
        if (start >= s.length()) {
            return 0;
        }
        int count = 0;

        while (end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                count++;
            }
            end++;
        }
        return count + countSubString(s, start + 1, start + 1);
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2, };
        // String digitMapping[] = { "zero", "one", "two", "three", "four", "five",
        // "six", "seven", "eight", "nine", };
        // findOccur(arr, 2, 0);

        // engString(digitMapping, 1454238750);
        // System.out.println(strLength("manglam"));

        // System.out.println(str.substring(str.length() - 1));

        String str = "abcab";
        System.out.println(countSubString(str, 0, 0));
    }
}
