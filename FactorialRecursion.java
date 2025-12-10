//3. Write a Java program to find the factorial of a number using recursion.

import java.util.*;

public class FactorialRecursion {

    // Recursive method to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base condition
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = factorial(num);

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
