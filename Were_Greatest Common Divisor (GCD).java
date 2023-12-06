
/*  
AUTHOR:WERE VINCENT
Reg Number:J17/MNU/7428/2020
PROGRAME:Java program to Calculate the Greatest Common Divisor (GCD) using the Euclidean Algorithm
DATE:21st November 2023

*/
import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two positive integers M and N
        System.out.print("Enter the first positive integer (M): ");
        int m = scanner.nextInt();

        System.out.print("Enter the second positive integer (N): ");
        int n = scanner.nextInt();
// Record the start time
        long startTime = System.currentTimeMillis();
        // Calculate and print the GCD
        int gcd = calculateGCD(m, n);
        System.out.println("GCD of " + m + " and " + n + " is: " + gcd);
// Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate and print the runtime
        long runtime = endTime - startTime;
        System.out.println("\n");
        System.out.println("Runtime (T) is: " + runtime + " milliseconds");
        scanner.close();
        
    }
 /*
     * Calculates the Greatest Common Divisor (GCD) using the Euclidean Algorithm.
     *
     * @param a The first positive integer.
     * @param b The second positive integer.
     * @return The GCD of a and b.
     */
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
