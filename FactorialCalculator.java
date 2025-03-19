import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Get a valid non-negative integer input from the user
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        // Loop until a valid non-negative integer is entered
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            // Validate that the input is an integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                // Check if the number is non-negative
                if (number < 0) {
                    System.out.println("Error: The number must be non-negative. Please try again.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }

        return number;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        // The base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Calculate factorial using a loop
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
