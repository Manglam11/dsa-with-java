import java.util.*;

public class JavaBasics {

    public static boolean isPlindrom(int n) {
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;

        }
        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPlindrom(11111));

    }
}
