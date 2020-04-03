import java.util.Scanner;

/**
 * @author Ali Ansari
 * @version 1.0
 * This class does the work on the game turns
 */
public class Game {
    private Board board = new Board();
    private Player player1 = new Player(1, board);
    private Player player2 = new Player(-1, board);

    /**
     * This function take turns to players and check end game and winner
     */
    public void gameMultiPlayer() {
        board.start();
        int turn = 1;
        board.print();
        Scanner sc = new Scanner(System.in);
        while (!board.checkEndGame()) {
            if (turn % 2 == 1) {
                System.out.println("Player 1:");
                System.out.print("Your Point:");
                int row = sc.nextInt();
                int column = sc.nextInt();
                board.put(row - 1, column - 1, 1);
                if (board.checkFill()) {
                    System.out.print("Grid of your turn:");
                    int grid = sc.nextInt();
                    System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                    int direction = sc.nextInt();
                    if (direction == 2) direction = -1;
                    board.turn(grid, direction);
                } else {
                    System.out.print("Do you want to turn?(1.Yes 2.No)");
                    if (sc.nextInt() == 1) {
                        System.out.print("Grid of your turn:");
                        int grid = sc.nextInt();
                        System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                        int direction = sc.nextInt();
                        if (direction == 2) direction = -1;
                        board.turn(grid, direction);
                    }
                }
                board.print();
            }
            if (player1.checkWinner()) break;
            if (turn % 2 == 0) {
                System.out.println("Player 2:");
                System.out.print("Your Point:");
                int row = sc.nextInt();
                int column = sc.nextInt();
                board.put(row - 1, column - 1, -1);
                if (board.checkFill()) {
                    System.out.print("Grid of your turn:");
                    int grid = sc.nextInt();
                    System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                    int direction = sc.nextInt();
                    if (direction == 2) direction = -1;
                    board.turn(grid, direction);
                } else {
                    System.out.print("Do you want to turn?(1.Yes 2.No)");
                    if (sc.nextInt() == 1) {
                        System.out.print("Grid of your turn:");
                        int grid = sc.nextInt();
                        System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                        int direction = sc.nextInt();
                        if (direction == 2) direction = -1;
                        board.turn(grid, direction);
                    }
                }
                board.print();
            }
            if (player2.checkWinner()) break;
            turn++;
        }
        if (player1.checkWinner()) System.out.println("Player 1 win");
        else if (player2.checkWinner()) System.out.println("Player 2 win");
        else System.out.println("Draw");
    }
}
