package TCS_NQT_Coding;

import java.util.Arrays;
import java.util.Scanner;

public class StringMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Calculate the number of rows and columns for the matrix
        int length = input.length();
        int rows = (int) Math.ceil(Math.sqrt(length));
        int cols = (int) Math.ceil((double) length / rows);

        // Create a 2D array to represent the matrix
        char[][] matrix = new char[rows][cols];

        // Populate the matrix with characters from the input string
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (index < length) {
                    matrix[i][j] = input.charAt(index);
                    index++;
                } else {
                    matrix[i][j] = ' '; // Fill with spaces if the string is shorter than the matrix size
                }
            }
        }

        // Print the matrix
        System.out.println("Matrix Form:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println(Arrays.deepToString(matrix));

        scanner.close();
    }
}
