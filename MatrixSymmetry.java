import java.util.Scanner;

public class MatrixSymmetry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int[][] transpose = new int[n][n];

        // 1. Input the Matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // 2. Compute Transpose
        // The transpose is created by swapping rows (i) and columns (j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // 3. Display Transpose
        System.out.println("\nThe Transpose of the matrix is:");
        printMatrix(transpose, n);

        // 4. Check for Symmetry
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != transpose[i][j]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break; 
        }

        if (isSymmetric) {
            System.out.println("\nResult: The matrix IS symmetric.");
        } else {
            System.out.println("\nResult: The matrix is NOT symmetric.");
        }
        
        scanner.close();
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}