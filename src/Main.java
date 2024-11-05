import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        // Task 2: Initialize each element in dataPoints with a random value between 1 and 100
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display dataPoints values in a single line separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + (i < dataPoints.length - 1 ? " | " : ""));
        }
        System.out.println();

        // Task 4: Calculate and display the sum and average of the dataPoints array
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);

        // Task 5: Prompt user for an integer between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int userValue = getRangedInt(scanner, 1, 100);
        System.out.println("You entered: " + userValue);

        // Task 6: Count occurrences of userValue in dataPoints
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " time(s) in the dataPoints array.");

        // Task 7: Search for the first occurrence of a new value in dataPoints
        int secondUserValue = getRangedInt(scanner, 1, 100);
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == secondUserValue) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("The value " + secondUserValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + secondUserValue + " was not found in the dataPoints array.");
        }

        // Task 8: Find minimum and maximum values in dataPoints
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        // Task 9: Calculate and display the average using getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Method to get a valid integer input within a range
    public static int getRangedInt(Scanner scanner, int min, int max) {
        int value;
        do {
            System.out.print("Enter an integer between " + min + " and " + max + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value < min || value > max);
        return value;
    }

    // Method to calculate and return the average of an array of integers
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
