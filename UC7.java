import java.util.Random;

public class ComputerMove {

    // Method to display board
    public static void displayBoard(char[][] board) {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    // Method for computer random move
    public static void computerMove(char[][] board) {

        Random random = new Random();

        int slot;
        int row;
        int col;

        // Loop until valid move found
        while (true) {

            // Generate random slot between 1 and 9
            slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if cell is empty
            if (board[row][col] == ' ') {

                // Place computer move
                board[row][col] = 'O';

                System.out.println("Computer selected slot: " + slot);

                break;
            }
        }
    }

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'X', ' ', 'O'},
                {' ', 'X', ' '},
                {' ', ' ', ' '}
        };

        System.out.println("Board Before Computer Move:");
        displayBoard(board);

        // Computer makes move
        computerMove(board);

        System.out.println("Board After Computer Move:");
        displayBoard(board);
    }
}