package job_ready_java;

/**
 *
 * @author michaelstucki
 */
public class TicTacToe {

    // Board model
    static char[][] boardModel = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

    // Board view
    static char[][] boardView = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    };

    // Mappings between boardModel and boardView
    static int[] rowMap = {1, 3, 5};
    static int[] colMap = {1, 5, 9};

    // Set board view
    static void setBoardView() {
        for (int i = 0; i < rowMap.length; i++) {
            for (int j = 0; j < colMap.length; j++) {
                boardView[rowMap[i]][colMap[j]] = boardModel[i][j];
            }
        }
    }

    // Display board view to console
    static void displayBoardView() {
        for (int i = 0; i < boardView.length; i++) {
            for (int j = 0; j < boardView[0].length; j++) {
                System.out.print(boardView[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        setBoardView();
        displayBoardView();
        boardModel[0][0] = 'X';
        setBoardView();
        displayBoardView();
    }
}
