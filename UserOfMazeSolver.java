/**
  Test the MazeSolver class.

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  
 */
public class UserOfMazeSolver {
    private static Displayer displayer;
    
    public static void main(String[] commandLine) 
        
        throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0], Integer.parseInt( commandLine[1]), Integer.parseInt( commandLine[2]));
        System.out.println( maze + System.lineSeparator());
      
        Displayer displayer = new Displayer( Integer.parseInt( commandLine[3]));

        //MazeSolver solver = new MazeSolver( maze);
        System.out.println(MazeSolver.solve(maze));

        }
    
    
}

