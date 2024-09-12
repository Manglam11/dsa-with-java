// import java.util.*;

public class StringPractice {

    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                System.out.println(str + " is palindrom.");
                return true;
            }
        }
        System.out.println(str + " is not a palindrom.");

        return false;
    }

    public static void directionSelection(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char direction = str.charAt(i);
            switch (direction) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;

                default:
                    break;
            }

        }
        float displacement = (float) Math.sqrt((x * x) + (y * y));
        System.out.println(displacement);
    }

    public static String toUpperCase(String str) {
        StringBuffer sb = new StringBuffer("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));

            }
        }

        String sb2 = sb.toString();
        System.out.println(sb2);
        return sb2;

    }

    public static String StringCompression(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 0;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static int vowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == ' ')

            {
                count += 0;
            } else {
                count += 1;
            }
        }
        return count;
    }

    // public static boolean isAnagrams(String str1, String str2) {
    // StringBuilder sb = new StringBuilder();

    // }

    public static void main(String[] args) {

        /*
         * // String str = "ns";
         * // String str2 = "adfhosduifuo23";
         * // int substr = str.compareTo(str2);
         * // System.out.println(substr);
         * // isPalindrom(str);
         * // directionSelection(str);
         * // String str1 = "Tony";
         * // String str2 = "Tony";
         * // String str3 = new String("Tony");
         * // if (str1 == str3) {
         * 
         * }
         * 
         * String str = "hi , my name is manglam!  ";
         * toUpperCase(str);
         * 
         * 
         * String str = "kaise ho mere bhai";
         * System.out.println(vowelsCount(str));
         * 
         * 
         * String str1 = "race";
         * String str2 = "care";
         */
        // System.out.println(isAnagrams(str1, str2));
    }
}
