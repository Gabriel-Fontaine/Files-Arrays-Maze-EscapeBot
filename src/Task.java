import java.io.FileNotFoundException;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.MazeCity;

public class Task {

	public void run() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		MazeCity mC = new MazeCity (15,15,1,1); // creates a randomly generated maze with a size of 15 by 15
		
		EscapeBot eB = new EscapeBot (mC, 3 , 4, Direction.SOUTH); // creates a robot
		
		do { // loops initially
			eB.escape(); //instructs the bot to escape the maze
		} while (eB.getMazeSolved() == false); // provides the initial looping for the process of the maze being solved and navigated by the robot, with this loop being necessary due to the fact that it is impossible to recurse this method within itself otherwise, as each time the robot functionally has finished solving the maze in a simulation, the robot requires another reference as to which object is being utilized in the process of simulating and calling the same method

		
	}

}
