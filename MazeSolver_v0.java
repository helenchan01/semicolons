/**
  Solve a maze 
  
  As of v0, shows whether it is possible to for an explorer 
  dropped on an arbitrary start position to legally trace a 
  path to the treasure.
 */
public class MazeSolver_v0 {
    
    private Maze maze;
    public MazeSolver( Maze maze) {
        this.maze = maze;
    }
    public boolean solve() {
        if (maze.explorerIsOnA() == maze.TREASURE) {
            return true;
		}
        if (maze.explorerIsOnA() == maze.WALL) {
            return false;
        }
	Maze snapshot = new Maze(maze);
	maze.go(Maze.EAST);
	if (maze.explorerIsOnA() == maze.WALL) {
		
	//dummy.go(Maze.EAST);
	//MazeSolver mini = new MazeSolver ( dummy);
	//return mini.solve();
	return false;
    }
}
