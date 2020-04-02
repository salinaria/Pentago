import java.util.Scanner;

public class Game {
    private Board board=new Board();
    private Player player1=new Player(1,board);
    private Player player2=new Player(-1,board);
    public void gameMultiPlayer(){
        board.start();
        int turn=1;
        Scanner sc=new Scanner(System.in);
        while(true){
            board.print();
            if(turn%2==1){
                System.out.println("Player 1:");
                System.out.print("Your Point:");
                int row=sc.nextInt();
                int column=sc.nextInt();
                board.put(row-1,column-1,1);
                if(board.checkFill()){
                    System.out.print("Grid of your turn:");
                    int grid=sc.nextInt();
                    System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                    int direction=sc.nextInt();
                    if(direction==2)direction=-1;
                    board.turn(grid,direction);
                }
                else{
                    System.out.print("Do you want to turn?(1.Yes 2.No)");
                    if(sc.nextInt()==1){
                        System.out.print("Grid of your turn:");
                        int grid=sc.nextInt();
                        System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                        int direction=sc.nextInt();
                        if(direction==2)direction=-1;
                        board.turn(grid,direction);
                    }
                }
            }
            if(turn%2==0){
                System.out.println("Player 2:");
                System.out.print("Your Point:");
                int row=sc.nextInt();
                int column=sc.nextInt();
                board.put(row-1,column-1,-1);
                if(board.checkFill()){
                    System.out.print("Grid of your turn:");
                    int grid=sc.nextInt();
                    System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                    int direction=sc.nextInt();
                    if(direction==2)direction=-1;
                    board.turn(grid,direction);
                }
                else{
                    System.out.print("Do you want to turn?(1.Yes 2.No)");
                    if(sc.nextInt()==1){
                        System.out.print("Grid of your turn:");
                        int grid=sc.nextInt();
                        System.out.print("Direction of your turn(1.Clockwise 2.Counter-clockwise):");
                        int direction=sc.nextInt();
                        if(direction==2)direction=-1;
                        board.turn(grid,direction);
                    }
                }
            }
            turn++;
        }
    }
}
