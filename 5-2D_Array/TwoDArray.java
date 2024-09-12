
public class TwoDArray {

    public static boolean search(int matrix[][], int key) {
        int n = 3, m = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("found at index: (" + i + "," + j + ")");
                    return true;
                }

            }

        }
        System.out.println("key not found!");
        return false;

    }

    public static void largest(int matrix[][], int key) {
        int n = 3, m = 3;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }

        }
        System.out.print("largest element in matrix is: " + largest);

    }

    public static void smaleest(int matrix[][], int key) {
        int n = 3, m = 3;
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                largest = Math.min(largest, matrix[i][j]);
            }

        }
        System.out.print("smallest element in matrix is: " + largest);

    }

    public static void printSpiral(int matrix[][]) { // matrix instead of matric
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) { // Changed loop start from startRow + 1
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i > startRow; i--) { // Changed loop to endRow - 1
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            /*
             * for (int j = 0; j < matrix[0].length; j++) {
             * if (i == j || i + j == matrix.length - 1) {
             * sum += matrix[i][j];
             * }
             * 
             * }
             */
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }

        }
        System.out.println(sum);
    }

    public static boolean stairCaseSearch(int matrix[][], int key) {
        // int row = 0, col = matrix[0].length - 1;
        /*
         * while (row < matrix.length && col >= 0) {
         * if (matrix[row][col] == key) {
         * System.out.print("found key at index: (" + row + "," + col + ")");
         * return true;
         * } else if (key < matrix[row][col]) {
         * col--;
         * } else {
         * row++;
         * }
         */

        int row = matrix.length - 1;
        int col = 0;

        while (col < matrix[0].length && row >= 0) {
            if (key == matrix[row][col]) {
                System.out.print("found key at index: (" + row + "," + col + ")");
                return true;
            } else if (key > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int key = 16;
        stairCaseSearch(matrix, key);
    }

}
