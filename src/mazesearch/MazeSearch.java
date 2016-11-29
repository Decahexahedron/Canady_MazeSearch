package mazesearch;

public class MazeSearch {

    static Maze labyrinth = new Maze();

    public static void main(String[] args) throws InterruptedException {
        if(labyrinth.traverse(0, 0)){
            System.out.println("Maze solved!");
        } else{
            System.out.println("Maze not possible!");
        }
        labyrinth.print();
    }

}
