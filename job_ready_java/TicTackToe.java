package job_ready_java;

/**
 *
 * @author michaelstucki
 */
public class TicTackToe {

    // Board model
    static String[][] boardModel = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    // Board view
    static String[][] boardView = new String[3][3];

    // Update board view with board model
    static void setBoardView() {
        StringBuilder strBld = new StringBuilder();
        for (int i = 0; i < boardModel.length; i++) {
            for (int j = 0; j < boardModel.length; j++) {
                strBld.append(" ");
                strBld.append(boardModel[i][j]);
                strBld.append(" ");
                boardView[i][j] = strBld.toString();
                strBld.delete(0, strBld.length());
            }
        }
    }

    // Show board view on console
    static void displayBoard() {
        StringBuilder strBld = new StringBuilder();
        for (String[] strings : boardView) {
            for (int j = 0; j < boardView.length; j++) {
                strBld.append(strings[j]);
            }
            System.out.println(strBld.toString());
            strBld.delete(0, strBld.length());
        }
    }

    public static void main(String[] args) {
        setBoardView();
        displayBoard();
    }
}
