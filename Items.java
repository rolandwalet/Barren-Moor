package roland.barrenmoore;

import java.util.Random;

public class Items {

	
	public int[] treasureLocation, keyLocation, mapLocation, gogglesLocation, sign1Location, sign2Location;
	
	public Items() {
		treasureLocation = makePosition(10);									//set locations
		keyLocation = makePosition(5);
		while (keyLocation == treasureLocation) {
			keyLocation = makePosition(5);
		}
		mapLocation = makePosition(2);
		while (mapLocation == treasureLocation || mapLocation == keyLocation) {
			mapLocation = makePosition(2);
		}
		gogglesLocation = makePosition(5);
		while (gogglesLocation == treasureLocation || gogglesLocation == keyLocation || gogglesLocation == mapLocation) {
			gogglesLocation = makePosition(5);
		}
		sign1Location = makePosition(3);
		while (sign1Location == treasureLocation || sign1Location == keyLocation || sign1Location == mapLocation
				|| sign1Location == gogglesLocation) {
			sign1Location = makePosition(3);
		}
		sign2Location = makePosition(3);
		
		while (sign2Location == treasureLocation || sign2Location == keyLocation || sign2Location == mapLocation
				|| sign2Location == gogglesLocation || sign2Location == sign1Location) {
			sign2Location = makePosition(3);
		}
	}
	
	//random position creator
	public int[] makePosition(int size) {
		Random random = new Random();
		int horizontalSign = random.nextInt(2);									//decide horizontal direction
		int horizontalPosition = random.nextInt(size)+2;						//decide horizontal distance
		if (horizontalSign==0) horizontalPosition = horizontalPosition*-1;		//combine horizontal distance and direction
		int verticalSign = random.nextInt(2);									//decide vertical direction
		int verticalPosition = random.nextInt(size)+2;							//decide vertical distance
		if (verticalSign==0) verticalPosition = verticalPosition*-1;			//combine vertical distance and direction
		int[] position = {horizontalPosition, verticalPosition};
		return position;
	}
}