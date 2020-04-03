/**
 * @author Ali Ansari
 * @version 1.0
 * This class define player functions and player's turn by player's ID
 */
public class Player {
    private int ID;
    private Board board;

    /**
     * Constructor for player objects
     *
     * @param ID    Player ID it is 1 or -1
     * @param board The board player game on this
     */
    public Player(int ID, Board board) {
        this.ID = ID;
        this.board = board;
    }

    /**
     * This function check a player win or not
     *
     * @return A boolean
     */
    public boolean checkWinner() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (board.getBoard()[i][j] == ID) {
                    if (1 >= j)
                        if (board.getBoard()[i][j + 1] == ID && board.getBoard()[i][j + 2] == ID && board.getBoard()[i][j + 3] == ID && board.getBoard()[i][j + 4] == ID)
                            return true;
                    if (1 >= i)
                        if (board.getBoard()[i + 1][j] == ID && board.getBoard()[i + 2][j] == ID && board.getBoard()[i + 3][j] == ID && board.getBoard()[i + 4][j] == ID)
                            return true;
                    if (j >= 4)
                        if (board.getBoard()[i][j - 1] == ID && board.getBoard()[i][j - 2] == ID && board.getBoard()[i][j - 3] == ID && board.getBoard()[i][j - 4] == ID)
                            return true;
                    if (i >= 4)
                        if (board.getBoard()[i - 1][j] == ID && board.getBoard()[i - 2][j] == ID && board.getBoard()[i - 3][j] == ID && board.getBoard()[i - 4][j] == ID)
                            return true;
                    if (i >= 4 && j >= 4)
                        if (board.getBoard()[i - 1][j - 1] == ID && board.getBoard()[i - 2][j - 2] == ID && board.getBoard()[i - 3][j - 3] == ID && board.getBoard()[i - 4][j - 4] == ID)
                            return true;
                    if (i >= 4 && 1 >= j)
                        if (board.getBoard()[i - 1][j + 1] == ID && board.getBoard()[i - 2][j + 2] == ID && board.getBoard()[i - 3][j + 3] == ID && board.getBoard()[i - 4][j + 4] == ID)
                            return true;
                    if (1 >= i && j >= 4)
                        if (board.getBoard()[i + 1][j - 1] == ID && board.getBoard()[i + 2][j - 2] == ID && board.getBoard()[i + 3][j - 3] == ID && board.getBoard()[i + 4][j - 4] == ID)
                            return true;
                    if (1 >= i && 1 >= j)
                        if (board.getBoard()[i + 1][j + 1] == ID && board.getBoard()[i + 2][j + 2] == ID && board.getBoard()[i + 3][j + 3] == ID && board.getBoard()[i + 4][j + 4] == ID)
                            return true;
                }
            }
        }
        return false;
    }
}
