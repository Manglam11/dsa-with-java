
public class BitwiseOperator {

    public static void oddOrEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            // even
            System.out.println("even number");
        } else {
            // odd
            System.out.println("odd number");
        }
    }

    public static void findIthBit(int n, int i) {
        int bitmask = (1 << i);
        int answer = 0;
        if ((n & bitmask) == 0) {
            answer = 0;
            System.out.println(answer);
        } else {
            answer = 1;
            System.out.println(answer);

        }
    }

    public static void setIthBit(int n, int i) {
        int bitmask = (1 << i);
        int answer = n | bitmask;
        System.out.println(answer);

    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        int answer = n & bitmask;
        return answer;
        // System.out.println(answer);

    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = (newBit << i);
        return n | bitMask;

    }

    public static int clearIBits(int n, int i) {
        int bitMask = ((-1) << i);
        return n & bitMask;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;

        }
        return count;
    }

    public static int findExpo(int a, int n) {
        int answer = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                answer = answer * a;
            }
            a = a * a;
            n = n >> 1;

        }
        return answer;
    }

    public static void main(String[] args) {
        /*
         * oddOrEven(5);
         * oddOrEven(34);
         * oddOrEven(67);
         */

        // setIthBit(10, 2);
        // clearIthBit(10, 1);
        // System.out.println(clearIBits(12, 3));
        // System.out.println(countSetBits(16));
        System.out.println(findExpo(5, 5));

    }
}
