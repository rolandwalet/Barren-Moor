package roland.barrenmoore;

import java.util.*;

public class Player extends Grid {
	public int health = 100;
	public boolean hasKey = false, hasWon = false, isAlive=true, foundChest = false, foundKeyLocation = false,
			foundSign1 = false, foundSign2 = false, foundGoggles = false, hasMap = false;
	
	//Method to move the player, taking input off player for action
	public void act() {
		
		String action;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Please enter action to take or type help: ");
			action = scanner.nextLine();																//take input
		} while (  !action.equals("north")																//check input is valid
				&& !action.equals("south")
				&& !action.equals("east")
				&& !action.equals("west")
				&& !action.equals("help")
				&& !action.equals("map")
				&& !action.equals("compass")); 

//		System.out.println(action);

		if 	    (action.equals("north")) {											//move north
			grid[0][1] +=1;
			System.out.println("You move north");
		}
		else if (action.equals("south")) {											//move south
			grid[0][1] -=1;
			System.out.println("You move south");
		}
		else if (action.equals("east")) {											//move east
			grid[0][0] +=1;
			System.out.println("You move east");
		}
		else if (action.equals("west")) {											//move west
			grid[0][0] -=1;
			System.out.println("You move west");
		}
		else if (action.equals("help")) {											//help command
			System.out.println("north   - move character north");
			System.out.println("south   - move character south");
			System.out.println("east    - move character east");
			System.out.println("west    - move character west");
			System.out.println("compass - check compass");
			if (hasMap) System.out.println("map     - check your map");
		}
		else if (action.equals("map")) {											//Check map
			if (!hasMap) System.out.println("What map???");
			else {
				System.out.println("Your position is: " + grid[0][0] + ", " + grid[0][1]);
				if(foundChest) {
					System.out.println("Chest: " + grid[1][0] + ", " + grid[1][1]);
				}
				if(foundSign1) {
					System.out.println("Signpost: " + grid[3][0] + ", " +grid[3][1]);
				}
				if(foundSign2) {
					System.out.println("Scratched Rock: " + grid[4][0] + ", " +grid[4][1]);
				}
				if(hasKey || foundKeyLocation) {
					System.out.println("Key: " + grid[2][0] + ", " +grid[2][1]);
				}
				if(foundGoggles) {
					System.out.println("Goggles: " + grid[5][0] + ", " +grid[5][1]);
				}
				if(hasMap) {
					System.out.println("Map: " + grid[6][0] + ", " +grid[6][1]);
				}
			}
		}
		else if(action.equals("compass")) {											//check compass
			compass();
		}
	}
}