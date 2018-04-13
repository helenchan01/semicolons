/**
  Solve a maze 
  
  As of v0, shows whether it is possible to for an explorer 
  dropped on an arbitrary start position to legally trace a 
  path to the treasure.
 */
public class MazeSolver_v0 {
    
    private Maze maze;
    public MazeSolver_v0() {
 
    }
    public static boolean mazeIsSolvable(Maze maze) {
        // System.out.println(maze);
        
        if (maze.explorerIsOnA() == maze.TREASURE) {
            return true;
		}
        if (maze.explorerIsOnA() == maze.WALL) {
            return false;
        }
        
		// Maze snapshot = new Maze(maze); //C
        
        int[] legalDirections = new int[4];
        int[] directions = {maze.EAST, maze.NORTH, maze.WEST, maze.SOUTH};
        
        for (int i = 0; i < 4; i++) {
            Maze snapshot = new Maze(maze);
            maze.go(directions[i]);
            // System.out.println("Explorer has moved " + directions[i]);  
            if (maze.explorerIsOnA() != maze.WALL) {
                legalDirections[i] = directions[i];
                // System.out.println("The previous movement was legal");
            }
            maze = snapshot;
            // System.out.println("The previous movement has been reverted");
        }      
        
        for (int direction: legalDirections) {
            if (direction > 0) { 
                Maze snapshot = new Maze(maze);
                maze.dropA(maze.WALL);
                // System.out.println("Moving in the legal direction " + direction);
                maze.go(direction);
                if (mazeIsSolvable(maze)) {
                    return true;
                }
                else {
                    maze = snapshot;
                }
            }
        }
        return false;
    }
}
