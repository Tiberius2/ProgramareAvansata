import java.util.Scanner;
import java.util.*;

public class Homework {

    public static void main(String[] args)
    {
        System.out.print("Enter the number: ");
        int n = validateInput(args);
        long startTime = System.nanoTime();;
        int[][] matrix = generateLatinSquare(n);
        long endTime = System.nanoTime();
        System.out.println("Latin Square Matrix:");
        printMatrix(matrix);

        System.out.println("Line concatenations:");
        printLineConcatenations(matrix);

        System.out.println("Column concatenations:");
        printColumnConcatenations(matrix);

        System.out.println("Running time: " + (endTime - startTime) + " in nanoseconds");
    }

    public static int validateInput(String[] args) {
        if (args.length != 1) {
            System.err.println("Invalid input: please provide a single positive integer argument");
            System.exit(1);
        }
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input: please provide a single positive integer argument");
            System.exit(1);
        }
        if (n <= 0) {
            System.err.println("Invalid input: please provide a single positive integer argument");
            System.exit(1);
        }
        return n;
    }

    public static int[][] generateLatinSquare(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (i + j) % n + 1;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Print the concatenations of symbols in each line
    public static void printLineConcatenations(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String lineConcatenation = "";
            for (int j = 0; j < matrix[i].length; j++) {
                lineConcatenation += matrix[i][j];
            }
            System.out.println(lineConcatenation);
        }
    }

    // Print the concatenations of symbols in each column
    public static void printColumnConcatenations(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            String columnConcatenation = "";
            for (int i = 0; i < matrix.length; i++) {
                columnConcatenation += matrix[i][j];
            }
            System.out.println(columnConcatenation);
        }
    }

}
