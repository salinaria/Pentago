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
}
