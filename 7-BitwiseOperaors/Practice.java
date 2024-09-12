public class Practice {
    public static void swapNumbers(int n, int m) {
        n = n ^ m;
        m = n ^ m;
        n = m ^ n;
        System.out.println("n: " + n + " m: " + m);
    }

    public static void main(String[] args) {
        swapNumbers(15, 10);
    }
}
