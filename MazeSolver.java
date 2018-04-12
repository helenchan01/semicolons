/**
  Solve a maze 
  
  As of v0, shows whether it is possible to for an explorer 
  dropped on an arbitrary start position to legally trace a 
  path to the treasure.
 */
public class MazeSolver {
    
    private Maze maze;
    public MazeSolver( Maze maze) {
        this.maze = maze;
    }
    public boolean solve() {
        if (maze.explorerIsOnA() == maze.TREASURE) {
            return true;
        } else if (maze.explorerIsOnA() == maze.WALL) {
            return false;
        }
        return false;
    }
}
