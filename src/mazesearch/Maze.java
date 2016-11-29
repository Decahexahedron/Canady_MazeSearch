package mazesearch;

public class Maze {

    private final int tried = 2;
    private final int path = 4;
    public static int[][] grid
            = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    public boolean traverse(int row, int column) throws InterruptedException {

        if (valid(row, column)) {
            grid[row][column] = tried;
        } else {
            return false;
        }

        if (traverse(row - 1, column) || traverse(row + 1, column) || traverse(row, column - 1)
                || traverse(row, column + 1) || row == grid[0].length && column == grid[1].length) { //fix recursion
            grid[row][column] = path;
            print();
            return true;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }

        print();
        Thread.sleep(200);

        if (grid[7][12] == tried || grid[7][12] == path) {
            return true;
        }

        return false;
    }

    private boolean valid(int row, int column) throws InterruptedException {
        return row < grid.length && row >= 0 && column < grid[0].length && column >= 0 && grid[row][column] == 1;
    }

    void print() {
        for (int i = 0; i < grid[0].length - 5; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
