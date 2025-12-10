// 7. Write a Java program to find the sum of all elements in an integer array.

import java.util.*;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
