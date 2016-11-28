package mazesearch;

public class MazeSearch {

    static Maze labyrinth = new Maze();

    public static void main(String[] args) throws InterruptedException {
        labyrinth.traverse(0, 0);
        labyrinth.print();
    }

}
