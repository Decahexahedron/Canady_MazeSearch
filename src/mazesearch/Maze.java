package mazesearch;

public class Maze {

    private final int tried = 2;
    private final int path = 3;
    public static int[][] grid
            = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    public boolean traverse(int row, int column) {

        if (valid(row, column)) {
            grid[row][column] = tried;
        } else {
            return false;
        }

        if (traverse(row - 1, column) || traverse(row + 1, column) || traverse(row, column + 1) || traverse(row, column - 1)) {
            grid[row][column] = path;
//            break;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
        print(grid);
        return true;
    }

    private boolean valid(int row, int column) {
        return row < grid.length && row >= 0 && column < grid[0].length && column >= 0;
    }

    void print(int[][] grid) {
        for (int i = 0; i < grid[0].length - 5; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.print("\n");
        }
    }
}
