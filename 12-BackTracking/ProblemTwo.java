public class ProblemTwo {
    public static void findSubSet(String str, String answer, int i) {
        // base case
        if (i == str.length()) {
            if (answer.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(answer + " ");
            }

            return;

        }
        // Yes choice
        findSubSet(str, answer + str.charAt(i), i + 1);
        // No choice
        findSubSet(str, answer, i + 1);

    }

    public static void main(String[] args) {
        String str = "abcdefjh";
        findSubSet(str, "", 0);
    }
}