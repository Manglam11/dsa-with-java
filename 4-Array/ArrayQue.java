import java.util.*;

public class ArrayQue {

    public static int findingOccurence(int matrix[][], int key) {
        int occurences = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    occurences += 1;
                }
            }
        }
        System.out.println(key + " appered in array for " + occurences + " times.");
        return occurences;
    }

    public static int calculatingRowSum(int matrix[][], int rowValue) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[rowValue - 1][i];
        }
        System.out.println("the sum is: " + sum);
        return sum;

    }

    public static void transposeMatrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transpossed[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpossed[j][i] = matrix[i][j];

            }

        }
        // print the transpose matrix
        for (int i = 0; i < transpossed.length; i++) {
            for (int j = 0; j < transpossed[0].length; j++) {
                System.out.print(transpossed[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int num[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int num2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int key = 2;
        // calculatingRowSum(num, key);
        transposeMatrix(num2);
    }
}
