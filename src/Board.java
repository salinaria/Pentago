public class Board {
    private Grid grid1 = new Grid();
    private Grid grid2 = new Grid();
    private Grid grid3 = new Grid();
    private Grid grid4 = new Grid();
    private int[][] board = new int[6][6];

    public int[][] getBoard() {
        return board;
    }

    public void start() {
        grid1.start();
        grid2.start();
        grid3.start();
        grid4.start();
    }

    public void updateBoard() {
        board[0][0] = grid1.getGrid()[0][0];
        board[0][1] = grid1.getGrid()[0][1];
        board[0][2] = grid1.getGrid()[0][2];
        board[1][0] = grid1.getGrid()[1][0];
        board[1][1] = grid1.getGrid()[1][1];
        board[1][2] = grid1.getGrid()[1][2];
        board[2][0] = grid1.getGrid()[2][0];
        board[2][1] = grid1.getGrid()[2][1];
        board[2][2] = grid1.getGrid()[2][2];

        board[0][3] = grid2.getGrid()[0][0];
        board[0][4] = grid2.getGrid()[0][1];
        board[0][5] = grid2.getGrid()[0][2];
        board[1][3] = grid2.getGrid()[1][0];
        board[1][4] = grid2.getGrid()[1][1];
        board[1][5] = grid2.getGrid()[1][2];
        board[2][3] = grid2.getGrid()[2][0];
        board[2][4] = grid2.getGrid()[2][1];
        board[2][5] = grid2.getGrid()[2][2];

        board[3][0] = grid3.getGrid()[0][0];
        board[3][1] = grid3.getGrid()[0][1];
        board[3][2] = grid3.getGrid()[0][2];
        board[4][0] = grid3.getGrid()[1][0];
        board[4][1] = grid3.getGrid()[1][1];
        board[4][2] = grid3.getGrid()[1][2];
        board[5][0] = grid3.getGrid()[2][0];
        board[5][1] = grid3.getGrid()[2][1];
        board[5][2] = grid3.getGrid()[2][2];

        board[3][3] = grid4.getGrid()[0][0];
        board[3][4] = grid4.getGrid()[0][1];
        board[3][5] = grid4.getGrid()[0][2];
        board[4][3] = grid4.getGrid()[1][0];
        board[4][4] = grid4.getGrid()[1][1];
        board[4][5] = grid4.getGrid()[1][2];
        board[5][3] = grid4.getGrid()[2][0];
        board[5][4] = grid4.getGrid()[2][1];
        board[5][5] = grid4.getGrid()[2][2];
    }

    public void print() {
        updateBoard();
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        System.out.println("     1     2     3          4     5     6");
        System.out.println("  +-----+-----+-----+    +-----+-----+-----+");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " |");
            for (int j = 0; j < 6; j++) {
                if (board[i][j] == 0) System.out.print("     |");
                else if (board[i][j] == 1) System.out.print(" " + ANSI_WHITE_BACKGROUND + "   " + ANSI_RESET + " |");
                else System.out.print(" " + ANSI_GREEN_BACKGROUND + "   " + ANSI_RESET + " |");
                if (j == 2) System.out.print("    |");
            }
            System.out.println("");
            System.out.println("  +-----+-----+-----+    +-----+-----+-----+");
        }
        System.out.println("");
        System.out.println("  +-----+-----+-----+    +-----+-----+-----+");
        for (int i = 3; i < 6; i++) {
            System.out.print(i + 1 + " |");
            for (int j = 0; j < 6; j++) {
                if (board[i][j] == 0) System.out.print("     |");
                else if (board[i][j] == 1) System.out.print(" " + ANSI_WHITE_BACKGROUND + "   " + ANSI_RESET + " |");
                else System.out.print(" " + ANSI_GREEN_BACKGROUND + "   " + ANSI_RESET + " |");
                if (j == 2) System.out.print("    |");
            }
            System.out.println("");
            System.out.println("  +-----+-----+-----+    +-----+-----+-----+");
        }
    }
    public boolean checkFill(){
        if(grid1.checkFill() && grid2.checkFill() && grid3.checkFill() && grid4.checkFill())return true;
        return false;
    }
    public void turn(int grid, int direction) {
        if (grid == 1) grid1.turn(direction);
        else if (grid == 2) grid2.turn(direction);
        else if (grid == 3) grid3.turn(direction);
        else grid4.turn(direction);
    }
    public void put(int row, int column, int ID) {
        if (row < 3 && column < 3) grid1.getGrid()[row][column] = ID;
        else if (row < 3 && column >= 3) grid2.getGrid()[row][column - 3] = ID;
        else if (row >= 3 && column < 3) grid3.getGrid()[row - 3][column] = ID;
        else {
            grid4.getGrid()[row - 3][column - 3] = ID;
        }
    }
}
