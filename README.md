# semicolons
## personnel
    Helen Chan 
    Tahmid Jamal

## statement of problem
    Returns the Boolean value of the statement “the maze is navigable, having a legal
    travel path that is continuous from start point (where the explorer is first dropped) to existing treasure”

## recursive abstraction
    When I am asked to
        solve for a path through a maze with n junctions,
    the recursive abstraction can
        find a path through the maze to reach the (n-1)th junction.
   
## base case 
    The explorer is at the treasure.
    
## algorithm 
    //If the treasure is in the next junction, return true. 
    If the explorer is at the treasure, return true.
    If there is no path available, return false. 
    Otherwise, for every path available, 
        enter that path and try to solve from there using 
            this method recursively. 
    Return false. 
    
## classes, with fields and methods  

## version *n* wish list 
    

