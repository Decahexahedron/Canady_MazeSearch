package mazesearch;

public class Maze {

    private final int tried = 2;
    private final int path = 3;
    static int[][] grid
            = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    boolean traverse() throws InterruptedException {
        if (0 == 1) {
            return true;
        }
        return false;
    }

    void print() {
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
    }
}
