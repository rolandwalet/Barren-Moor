package roland.barrenmoore;

public class Grid {
	
	int[][] grid = {
			{0,0},									//Player location
			{0,0},									//Treasure location
			{0,0},									//Key location
			{0,0},									//Sign1 location
			{0,0},									//Sign2 location
			{0,0},									//Goggles location
			{0,0},									//Map location
	};
	
	int length = grid.length;
	
	public void compass() {							//check nearest object and print distance and direction
		double distance = 10000.0;
		String direction = "";
		
		for (int i = 1; i<length; i++) {
			
			double horizontal = Math.abs((double) grid[i][0] - (double) grid[0][0]);		//calculate horizontal distance
			double vertical = Math.abs((double) grid[i][1] - (double) grid[0][1]);			//calculate vertical distance
			double hypotenuse = Math.hypot(horizontal, vertical);							//calculate overall distance
			
			if (hypotenuse!=0) {
				if (hypotenuse < distance) {
				
					distance=hypotenuse;
					direction="";
					
					if ((grid[i][1]-grid[0][1])!=0) {											//check vertical direction
						if ((grid[i][1]-grid[0][1])>0) direction += "north";
						else if((grid[i][1]-grid[0][1])<0) direction += "south";
					}
				
					if ((grid[i][1]-grid[0][1])!=0 && (grid[i][0]-grid[0][0])!=0)				//check for multiple directions
						direction += "-";
				
					if ((grid[i][0]-grid[0][0])!=0) {
						if ((grid[i][0]-grid[0][0])>0) direction += "east";						//check horizontal direction
						else if ((grid[i][0]-grid[0][0])<0) direction += "west";
					}
				}
				
				
			}
			
		}
		System.out.println("'The distance to the nearest object is " + distance + "m to the " + direction + "'");
	}
	
	public boolean checkMatch() {															//returns true if on location
		boolean check=false;
		for (int i=1; i<length; i++) {
			
			if (grid[i][0]==grid[0][0] && grid[i][1]==grid[0][1]) {
				check=true;
				break;
			}
		}
		return check;
	}
}
