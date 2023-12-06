

/*  
AUTHOR:WERE VINCENT
Reg Number:J17/MNU/7428/2020
PROGRAME:Java program generates the first n (50 in this case)numbers of the Fibonacci sequence
DATE:21st November 2023

*/
/**
 * This Java program generates the first n (50 in this case) numbers of the Fibonacci sequence
 * and measures the runtime of the generation process.
 */
public class FibonacciGenerator {

    public static void main(String[] args) {
        // Set the number of Fibonacci numbers to generate
        int n = 50;

        // Record the start time
        long startTime = System.currentTimeMillis();

        // Call the method to generate and print the Fibonacci sequence
        generateFibonacci(n);

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate and print the runtime
        long runtime = endTime - startTime;
        System.out.println("\n");
        System.out.println("\nRuntime (T) is: " + runtime + " milliseconds");
    }

    public static void generateFibonacci(int n) {
        int[] fibonacciSequence = new int[n];

        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        System.out.println("First " + n + " numbers of the Fibonacci sequence:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}
