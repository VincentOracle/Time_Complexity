import java.util.Scanner;

public class MatrixSumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of columns
        System.out.print("Enter the number of columns: ");
        int numColumns = scanner.nextInt();

        // Create an array to store the matrix elements
        int[] matrix = new int[numColumns];

        // Prompt the user to enter the matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < numColumns; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            matrix[i] = scanner.nextInt();
        }

        // Calculate the sum (S) and product (P) of the elements
        int sum = 0;
        int product = 1;

        for (int i = 0; i < numColumns; i++) {
            sum += matrix[i];
            product *= matrix[i];
        }

        // Display the results
        System.out.println("Sum (S) of the elements: " + sum);
        System.out.println("Product (P) of the elements: " + product);

        scanner.close();
    }
}
