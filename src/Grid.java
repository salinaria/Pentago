/**
 * @author Ali Ansari
 * @version 1.0
 * This class is for 4 grids of the game board
 */
public class Grid {
    private int[][] grid = new int[3][3];

    /**
     * Getter for grid
     *
     * @return Grid
     */
    public int[][] getGrid() {
        return grid;
    }

    /**
     * This function sets all cells of grid 0
     */
    public void start() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) grid[i][j] = 0;
    }

    /**
     * This function turn grid clockwise or counter-clockwise
     *
     * @param direction This parameter is for clockwise(1) or counter-clockwise(-1)
     */
    public void turn(int direction) {
        int[][] copy = grid.clone();
        if (direction == 1) {
            grid[0][2] = copy[0][0];
            grid[1][2] = copy[0][1];
            grid[2][2] = copy[0][2];

            grid[0][1] = copy[1][0];
            grid[1][1] = copy[1][1];
            grid[2][1] = copy[1][2];

            grid[0][0] = copy[2][0];
            grid[1][0] = copy[2][1];
            grid[2][0] = copy[2][2];
        } else {
            grid[0][0] = copy[0][2];
            grid[0][1] = copy[1][2];
            grid[0][2] = copy[2][2];

            grid[1][0] = copy[0][1];
            grid[1][1] = copy[1][1];
            grid[1][2] = copy[2][1];

            grid[2][0] = copy[0][0];
            grid[2][1] = copy[1][0];
            grid[2][2] = copy[2][0];
        }
    }

    /**
     * This function indicates whether this grid has a point or not
     * @return A boolean
     */
    public boolean checkFill(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(grid[i][j]!=0)return true;
            }
        }
        return false;
    }
}
