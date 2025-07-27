import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] product = new int[rows][cols];

      
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = array1[i][j] * array2[i][j];
            }
        }
        System.out.println("Sum of the arrays:");
        printArray(sum);

        System.out.println("Element-wise multiplication of the arrays:");
        printArray(product);
    }
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
