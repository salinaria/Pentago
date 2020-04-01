public class Board {
    private Grid grid1=new Grid();
    private Grid grid2=new Grid();
    private Grid grid3=new Grid();
    private Grid grid4=new Grid();
    private int[][] board=new int[6][6];
    public void start(){
        grid1.start();
        grid2.start();
        grid3.start();
        grid4.start();
    }
    public void updateBoard(){
        board[0][0]=grid1.getGrid()[0][0];
        board[0][1]=grid1.getGrid()[0][1];
        board[0][2]=grid1.getGrid()[0][2];
        board[1][0]=grid1.getGrid()[1][0];
        board[1][1]=grid1.getGrid()[1][1];
        board[1][2]=grid1.getGrid()[1][2];
        board[2][0]=grid1.getGrid()[2][0];
        board[2][1]=grid1.getGrid()[2][1];
        board[2][2]=grid1.getGrid()[2][2];

        board[0][3]=grid2.getGrid()[0][0];
        board[0][4]=grid2.getGrid()[0][1];
        board[0][5]=grid2.getGrid()[0][2];
        board[1][3]=grid2.getGrid()[1][0];
        board[1][4]=grid2.getGrid()[1][1];
        board[1][5]=grid2.getGrid()[1][2];
        board[2][3]=grid2.getGrid()[2][0];
        board[2][4]=grid2.getGrid()[2][1];
        board[2][5]=grid2.getGrid()[2][2];

        board[3][0]=grid3.getGrid()[0][0];
        board[3][1]=grid3.getGrid()[0][1];
        board[3][2]=grid3.getGrid()[0][2];
        board[4][0]=grid3.getGrid()[1][0];
        board[4][1]=grid3.getGrid()[1][1];
        board[4][2]=grid3.getGrid()[1][2];
        board[5][0]=grid3.getGrid()[2][0];
        board[5][1]=grid3.getGrid()[2][1];
        board[5][2]=grid3.getGrid()[2][2];

        board[3][3]=grid4.getGrid()[0][0];
        board[3][4]=grid4.getGrid()[0][1];
        board[3][5]=grid4.getGrid()[0][2];
        board[4][3]=grid4.getGrid()[1][0];
        board[4][4]=grid4.getGrid()[1][1];
        board[4][5]=grid4.getGrid()[1][2];
        board[5][3]=grid4.getGrid()[2][0];
        board[5][4]=grid4.getGrid()[2][1];
        board[5][5]=grid4.getGrid()[2][2];
    }
    public void print(){
        updateBoard();

    }
    public void turn(){
    }
}
