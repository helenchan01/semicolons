# semicolons
## personnel
    Helen Chan 
    Tahmid Jamal

## statement of problem
    Returns the Boolean value of the statement “the maze is navigable, having a legal
    travel path that is continuous from start point to existing treasure.” The path 
    should consist of right-angle turns and should not cross any walls or another 
    part of the path. 

## recursive abstraction
    When I am asked to
        solve for a path through a maze where an explorer is on a stone,
    the recursive abstraction can
        solve a smaller maze in which the explorer has been moved to the next stone.
   
## base case 
    The explorer is on treasure or in a wall.  
    
## algorithm 
    If the explorer is on treasure, return true. 
    If the explorer is in a wall, return false. 
    Otherwise, for every legal direction you can make from the explorer's position,
        save a snapshot of the maze
        turn the stone the explorer is on into a wall
        move the explorer in one legal direction
        attempt to solve this smaller maze.
            If you can solve the smaller maze, return true.
            If you can't, revert to the snapshot and perform the next possible legal
                move.
    Return false. 
    
## classes, with fields and methods  

## version *n* wish list

## known bugs 
   can only solve mazes that go in the west and/or east directions.
 
    

