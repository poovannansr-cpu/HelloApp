public class ValidateMove {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check row and column boundaries
        if (row < 0 || row > 2 || col < 0 || col > 2) {

            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {

            return false;
        }

        // Move is valid
        return true;
    }

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

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'X', 'O', ' '},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };

        displayBoard(board);

        int row = 1;
        int col = 0;

        // Validate move
        if (isValidMove(board, row, col)) {

            System.out.println("Valid Move");
        } else {

            System.out.println("Invalid Move");
        }
    }
}