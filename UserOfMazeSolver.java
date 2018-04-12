/**
  Test the MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting

  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt -1 -1 
      
 */
public class UserOfMazeSolver {
    private static Displayer displayer;
    
    public static void main(String[] args) {
        //following up until next comment is taken from UserOfMaze.java
        throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0], Integer.parseInt( commandLine[1]), Integer.parseInt( commandLine[2]));
        System.out.println( maze + System.lineSeparator());
        //
        
        }
    }
    
}