import java.util.Scanner;

/**
 * @author Ali Ansari
 * @version 1.0
 * This class run the game
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameMultiPlayer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you like play again? 1.Yes 2.No");
        while (sc.nextInt() == 1) {
            game.gameMultiPlayer();
            System.out.println("Do you like play again? 1.Yes 2.No");
        }
    }
}
