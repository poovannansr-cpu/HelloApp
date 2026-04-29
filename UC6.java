public class UpdateBoard {

    // Method to update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {

        // Place symbol on board
        board[row][col] = symbol;
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

        // Create empty board
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        System.out.println("Board Before Update:");
        displayBoard(board);

        // Update board with player symbol
        updateBoard(board, 1, 1, 'X');

        // Update board with computer symbol
        updateBoard(board, 0, 2, 'O');

        System.out.println("Board After Update:");
        displayBoard(board);
    }
}