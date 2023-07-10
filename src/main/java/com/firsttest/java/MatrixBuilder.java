package com.firsttest.java;
//import java.util.Scanner;
//
//public class MatrixBuilder {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int[][] matrix = new int[3][3]; // Create a 2D array with a size of 3x3
//
//        for (int i = 0; i < 9; i++) {
//            System.out.print("Enter a value (1-9): ");
//            int value = scanner.nextInt();
//
//            switch (value) {
//                case 1:
//                    matrix[0][0] = value;
//                    break;
//                case 2:
//                    matrix[0][1] = value;
//                    break;
//                case 3:
//                    matrix[0][2] = value;
//                    break;
//                case 4:
//                    matrix[1][0] = value;
//                    break;
//                case 5:
//                    matrix[1][1] = value;
//                    break;
//                case 6:
//                    matrix[1][2] = value;
//                    break;
//                case 7:
//                    matrix[2][0] = value;
//                    break;
//                case 8:
//                    matrix[2][1] = value;
//                    break;
//                case 9:
//                    matrix[2][2] = value;
//                    break;
//                default:
//                    System.out.println("Invalid value! Please enter a number between 1 and 9.");
//                    i--; // Repeat the current iteration
//                    break;
//            }
//        }
//
//        // Print the matrix
//        System.out.println("\nThe matrix is:");
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//}


//import java.util.Scanner;
//
//public class MatrixBuilder {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        char[][] matrix = new char[3][3]; // Create a 2D char array with a size of 3x3
//        char currentPlayer = 'X'; // Start with 'X' as the current player
//
//        for (int i = 0; i < 9; i++) {
//            System.out.print("Enter the row index (0-2): ");
//            int row = scanner.nextInt();
//
//            System.out.print("Enter the column index (0-2): ");
//            int column = scanner.nextInt();
//
//            if (row >= 0 && row < 3 && column >= 0 && column < 3) {
//                if (matrix[row][column] == '\u0000') {
//                    matrix[row][column] = currentPlayer;
//                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch to the other player
//                } else {
//                    System.out.println("Invalid position! Please try again.");
//                    i--; // Repeat the current iteration
//                }
//            } else {
//                System.out.println("Invalid index! Please try again.");
//                i--; // Repeat the current iteration
//            }
//        }
//
//        // Print the matrix
//        System.out.println("\nThe matrix is:");
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//}
//




//import java.util.Scanner;

//public class MatrixBuilder {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        char[][] matrix = new char[3][3]; // Create a 2D char array with a size of 3x3
//        char currentPlayer = 'X'; // Start with 'X' as the current player
//
//        for (int i = 0; i < 9; i++) {
//            System.out.print("Enter the index of the position (1-9): ");
//            int index = scanner.nextInt();
//
//            int row = (index - 1) / 3; // Calculate row index based on the entered index
//            int column = (index - 1) % 3; // Calculate column index based on the entered index
//
//            if (index >= 1 && index <= 9 && matrix[row][column] == '\u0000') {
//                matrix[row][column] = currentPlayer;
//                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch to the other player
//
//                // Print the updated matrix
//                System.out.println("\nThe matrix after the current move:");
//                for (int r = 0; r < matrix.length; r++) {
//                    for (int c = 0; c < matrix[r].length; c++) {
//                        System.out.print(matrix[r][c] + " ");
//                    }
//                    System.out.println();
//                }
//            } else {
//                System.out.println("Invalid position! Please try again.");
//                i--; // Repeat the current iteration
//            }
//        }
//
//        scanner.close();
//    }
//}


//import java.util.Scanner;
//
//public class MatrixBuilder {
//
//    public static void main(String[] args) {
//    	try {
//        Scanner scanner = new Scanner(System.in);
//
//        char[][] matrix = new char[3][3]; // Create a 2D char array with a size of 3x3
//        char currentPlayer = 'X'; // Start with 'X' as the current player
//
//        for (int i = 0; i < 9; i++) {
//            System.out.print("Enter the index of the position (1-9): ");
//            int index = scanner.nextInt();
//
//            int row = (index - 1) / 3; // Calculate row index based on the entered index
//            int column = (index - 1) % 3; // Calculate column index based on the entered index
//
//            if (index >= 1 && index <= 9 && matrix[row][column] == '\u0000') {
//                matrix[row][column] = currentPlayer;
//                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch to the other player
//
//                // Print the matrix with empty and filled positions
//                System.out.println("\nThe matrix:");
//                for (int r = 0; r < matrix.length; r++) {
//                    for (int c = 0; c < matrix[r].length; c++) {
//                        if (matrix[r][c] == '\u0000') {
//                            System.out.print((r * 3 + c + 1) + " ");
//                        } else {
//                            System.out.print(matrix[r][c] + " ");
//                        }
//                    }
//                    System.out.println();
//                }
//            } else {
//                System.out.println("Invalid position! Please try again.");
//                i--; // Repeat the current iteration
//            }
//        }
//
//        scanner.close();
//    	}catch (Exception e) {
//			System.out.println("Invalid Input");
//		}
//    }
//}



//import java.util.Scanner;
//
//public class MatrixBuilder {
//
//    public static void main(String[] args) {
//    	try {
//        Scanner scanner = new Scanner(System.in);
//
//        char[][] matrix = new char[3][3]; // Create a 2D char array with a size of 3x3
//        char currentPlayer = 'X'; // Start with 'X' as the current player
//
//        for (int i = 0; i < 9; i++) {
//            System.out.print("Enter the index of the position (1-9): ");
//            int index = scanner.nextInt();
//
//            int row = (index - 1) / 3; // Calculate row index based on the entered index
//            int column = (index - 1) % 3; // Calculate column index based on the entered index
//
//            if (index >= 1 && index <= 9 && matrix[row][column] == '\u0000') {
//                matrix[row][column] = currentPlayer;
//                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch to the other player
//
//                // Print the matrix with empty and filled positions
//                System.out.println("\nThe matrix:");
//                for (int r = 0; r < matrix.length; r++) {
//                    for (int c = 0; c < matrix[r].length; c++) {
//                        if (matrix[r][c] == '\u0000') {
//                            System.out.print((r * 3 + c + 1) + " ");
//                            //System.out.print("_" + "  ");
//                        } else {
//                            System.out.print(matrix[r][c] + " ");
//                            //System.out.print(matrix[r][c] + "  ");
//                        }
//                    }
//                    System.out.println();
//                }
//
//                // Check for a win condition
//                if (checkWin(matrix)) {
//                	currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
//                    System.out.println("Player " + currentPlayer + " wins!");
//                    break;
//                }
//            } else {
//                System.out.println("Invalid position! Please try again.");
//                i--; // Repeat the current iteration
//            }
//        }
//
//        scanner.close();
//    	}catch (Exception e) {
//			System.out.println("Invalid Input");
//		}
//    }
//
//    // Method to check for a win condition
//    public static boolean checkWin(char[][] matrix) {
//        // Check rows
//        for (int row = 0; row < matrix.length; row++) {
//            if (matrix[row][0] != '\u0000' && matrix[row][0] == matrix[row][1] && matrix[row][1] == matrix[row][2]) {
//                return true;
//            }
//        }
//
//        // Check columns
//        for (int col = 0; col < matrix[0].length; col++) {
//            if (matrix[0][col] != '\u0000' && matrix[0][col] == matrix[1][col] && matrix[1][col] == matrix[2][col]) {
//                return true;
//            }
//        }
//
//        // Check diagonals
//        if (matrix[0][0] != '\u0000' && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
//            return true;
//        }
//        if (matrix[0][2] != '\u0000' && matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
//            return true;
//        }
//
//        return false;
//    }
//}
//



//import java.util.Scanner;
//
//public class MatrixBuilder {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        char[][] matrix = new char[3][3]; // Create a 2D char array with a size of 3x3
//        char currentPlayer = 'X'; // Start with 'X' as the current player
//
//        for (int i = 0; i < 9; i++) {
//            System.out.print("Player " + currentPlayer + ", enter the index of the position (1-9): ");
//            int index = scanner.nextInt();
//
//            int row = (index - 1) / 3; // Calculate row index based on the entered index
//            int column = (index - 1) % 3; // Calculate column index based on the entered index
//
//            if (index >= 1 && index <= 9 && matrix[row][column] == '\u0000') {
//                matrix[row][column] = currentPlayer;
//                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch to the other player
//
//                // Print the matrix with empty and filled positions
//                System.out.println("\nThe matrix:");
//                for (int r = 0; r < matrix.length; r++) {
//                    for (int c = 0; c < matrix[r].length; c++) {
//                        if (matrix[r][c] == '\u0000') {
//                            System.out.print((r * 3 + c + 1) + " ");
//                        } else {
//                            System.out.print(matrix[r][c] + " ");
//                        }
//                    }
//                    System.out.println();
//                }
//
//                // Check for a win condition
//                if (checkWin(matrix)) {
//                    System.out.println("Player " + currentPlayer + " wins!");
//                    break;
//                }
//            } else {
//                System.out.println("Invalid position! Please try again.");
//                i--; // Repeat the current iteration
//            }
//        }
//
//        scanner.close();
//    }
//
//    // Method to check for a win condition
//    public static boolean checkWin(char[][] matrix) {
//        // Check rows
//        for (int row = 0; row < matrix.length; row++) {
//            if (matrix[row][0] != '\u0000' && matrix[row][0] == matrix[row][1] && matrix[row][1] == matrix[row][2]) {
//                return true;
//            }
//        }
//
//        // Check columns
//        for (int col = 0; col < matrix[0].length; col++) {
//            if (matrix[0][col] != '\u0000' && matrix[0][col] == matrix[1][col] && matrix[1][col] == matrix[2][col]) {
//                return true;
//            }
//        }
//
//        // Check diagonals
//        if (matrix[0][0] != '\u0000' && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
//            return true;
//        }
//        if (matrix[0][2] != '\u0000' && matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
//            return true;
//        }
//
//        return false;
//    }
//}
//



import java.util.Scanner;

public class MatrixBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[3][3]; // Create a 2D char array with a size of 3x3
        char currentPlayer = 'X'; // Start with 'X' as the current player

        // Print the initial empty matrix
        System.out.println("Lets Start Neu:");
        printMatrix(matrix);

        for (int i = 0; i < 9; i++) {
            System.out.print("Player " + currentPlayer + ", enter the index of the position (1-9): ");
            int index = scanner.nextInt();

            int row = (index - 1) / 3; // Calculate row index based on the entered index
            int column = (index - 1) % 3; // Calculate column index based on the entered index

            if (index >= 1 && index <= 9 && matrix[row][column] == '\u0000') {
                matrix[row][column] = currentPlayer;
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch to the other player

                // Print the matrix with empty and filled positions
                System.out.println("Game On:");
                printMatrix(matrix);

                // Check for a win condition
                if (checkWin(matrix)) {
                	currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch to the other player
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
            } else {
                System.out.println("Invalid position! Please try again.");
                i--; // Repeat the current iteration
            }
        }

        scanner.close();
    }

    // Method to print the matrix with empty and filled positions
    public static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == '\u0000') {
                    System.out.print((r * 3 + c + 1) + " ");
                } else {
                    System.out.print(matrix[r][c] + " ");
                }
            }
            System.out.println();
        }
    }

    // Method to check for a win condition
    public static boolean checkWin(char[][] matrix) {
        // Check rows
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] != '\u0000' && matrix[row][0] == matrix[row][1] && matrix[row][1] == matrix[row][2]) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < matrix[0].length; col++) {
            if (matrix[0][col] != '\u0000' && matrix[0][col] == matrix[1][col] && matrix[1][col] == matrix[2][col]) {
                return true;
            }
        }

        // Check diagonals
        if (matrix[0][0] != '\u0000' && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
            return true;
        }
        if (matrix[0][2] != '\u0000' && matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            return true;
        }

        return false;
    }
}
