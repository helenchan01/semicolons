/**
  Solve a maze 
  
  As of v0, shows whether it is possible to for an explorer 
  dropped on an arbitrary start position to legally trace a 
  path to the treasure.
 */
public class MazeSolver {
    
    private static final int[] directions = { Maze.NORTH, Maze.EAST, Maze.SOUTH, Maze.WEST };
    private Maze maze;
    private static Displayer displayer = new Displayer(20);
    private static int step = 0;
	
    public static boolean solve(Maze maze) {
        if (maze.explorerIsOnA() == maze.TREASURE) {
            return true;
		}
        if (maze.explorerIsOnA() == maze.WALL) {
            return false;
        }
	Maze snapshot = new Maze(maze);
	// for every direction
	// alternatively for (int direction = 1; direction <= 8; direction*2) { 
	for (int dirIndex = 0; dirIndex < 4; dirIndex++ ) {
	    // debugging
	    //System.out.println("snapshot" + System.lineSeparator() + snapshot);	
	    maze.dropA(Maze.WALL);		
	    maze.go(directions[dirIndex]);
	    displayer.atTopOfWindow(maze + "step " + step++);

	    // if the explorer in recursive maze reaches the treasure, there is a solution	
            if (solve(maze)) {
		return true;
	    }
	    // if explorer hits a wall, restore to previous version	
	    else {
		// debugging
		///System.out.println("before restoring" + System.lineSeparator() + maze);    
		maze = new Maze(snapshot);
		//System.out.println("after restoring" + System.lineSeparator() + maze);  
	    }
	}
	return false;
    }
}

