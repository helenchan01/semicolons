/**
  Solve a maze 
  
  As of v0, shows whether it is possible to for an explorer 
  dropped on an arbitrary start position to legally trace a 
  path to the treasure.
 */
public class MazeSolver_v0 {
    
    private static final int[] directions = { Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST );
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
	// for every direction
	for (int dirIndex = 0; dirIndex < 4; dirIndex++ ) {
	    Maze snapshot = new Maze(maze);
	    // debugging
	    System.out.println("snapshot" + System.lineSeparator() + snapshot);	
	    maze.dropA(Maze.WALL);		
	    maze.go(directions[dirIndex]);
	    // if the explorer in recursive maze reaches the treasure, there is a solution	
            if (maze.solve()) {
		return true;
	    }
	    // if explorer hits a wall, restore to previous version	
	    else {
		// debugging
		System.out.println("before restoring" + System.lineSeparator() + maze);    
		maze = snapshot;
		System.out.println("after restoring" + System.lineSeparator() + maze);  
	    }
	}
	return false;
    }
}
