package mazesearch;

import java.util.Random;

public class Maze {

    private final int tried = 2;
    private final int path = 4;
//    public static int[][] grid
//            = {{1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
//            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
//            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
//            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1},
//            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
//            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
//            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
//            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
    public static int[][] grid = new int[8][13];

    void generate() throws InterruptedException {
        while (!traverse(0, 0)) {
            System.out.println("failed maze check");
            random();
        }
    }

    void random() {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 12; j++) {
                Random r = new Random();
                grid[i][j] = r.nextInt(2);
            }
        }
        grid[0][0] = 1;
        grid[7][12] = 1;
    }

    public boolean traverse(int row, int column) throws InterruptedException {

        if (valid(row, column)) {
            grid[row][column] = tried;
        } else {
            return false;
        }

        if (traverse(row - 1, column) || traverse(row + 1, column) || traverse(row, column - 1)
                || traverse(row, column + 1) || row == grid[0].length && column == grid[1].length) { //fix recursion
            grid[row][column] = path;
            return true;
        }

        if (grid[7][12] == tried || grid[7][12] == path) {
            grid[7][12] = path;
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
                if (grid[i][j] == 0) {
                    System.out.print("██");
                } else if (grid[i][j] == 1) {
                    System.out.print("░░");
                } else if (grid[i][j] == 2) {
                    System.out.print("00");
                } else if (grid[i][j] == 4) {
                    System.out.print("XX");
                }
            }
            System.out.print("\n");
        }
    }
}
