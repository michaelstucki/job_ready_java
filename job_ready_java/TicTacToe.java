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
            {' ', boardModel[0][0], ' ', '|', ' ', boardModel[0][1], ' ', '|', ' ', boardModel[0][2], ' '},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {' ', boardModel[1][0], ' ', '|', ' ', boardModel[1][1], ' ', '|', ' ', boardModel[1][2], ' '},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {' ', boardModel[2][0], ' ', '|', ' ', boardModel[2][1], ' ', '|', ' ', boardModel[2][2], ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
    };

    // Mappings between boardModel and boardView
    static int[] rowMap = {1, 3, 5};
    static int[] colMap = {1, 5, 9};

    // Update board view
    static void updateBoardView(int row, int col) {
        boardView[rowMap[row]][colMap[col]] = boardModel[row][col];
    }

    // Display board view to console
    static void displayBoardView() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char[] row : boardView) {
            for (char c : row) {
                stringBuilder.append(c);
            }
            stringBuilder.append('\n');
        }
        System.out.println(stringBuilder);
    }

    public static <List> void main(String[] args) {
        displayBoardView();

        int row = 0;
        int col = 0;
        boardModel[row][col] = 'X';
        updateBoardView(row, col);
        displayBoardView();

    }
}
