package roland.barrenmoore;

import java.util.Random;

public class Items {

	
	public int[] treasureLocation, keyLocation, mapLocation, gogglesLocation, sign1Location, sign2Location;
	
	public Items() {
		treasureLocation = makePosition(10);									//set locations
		keyLocation = makePosition(5);
		while (keyLocation[0] == treasureLocation[0] && keyLocation[1] == treasureLocation[1]) {
			keyLocation = makePosition(5);
		}
		mapLocation = makePosition(2);
		while ((mapLocation[0] == treasureLocation[0] && mapLocation[1] == treasureLocation[1]) ||
				(mapLocation[0] == keyLocation[0] && mapLocation[1] == keyLocation[1])) {
			mapLocation = makePosition(2);
		}
		gogglesLocation = makePosition(5);
		while ((gogglesLocation[0] == treasureLocation[0] && gogglesLocation[1] == treasureLocation[1]) ||
				(gogglesLocation[0] == keyLocation[0] && gogglesLocation[1] == keyLocation[1]) ||
				(gogglesLocation[0] == mapLocation[0] && gogglesLocation[1] == mapLocation[1])) {
			gogglesLocation = makePosition(5);
		}
		sign1Location = makePosition(3);
		while ((sign1Location[0] == treasureLocation[0] && sign1Location[1] == treasureLocation[1]) ||
				(sign1Location[0] == keyLocation[0] && sign1Location[1] == keyLocation[1]) ||
				(sign1Location[0] == mapLocation[0] && sign1Location[1] == mapLocation[1]) || 
				(sign1Location[0] == gogglesLocation[0] && sign1Location[1] == gogglesLocation[1])) {
			sign1Location = makePosition(3);
		}
		sign2Location = makePosition(3);
		
		while ((sign2Location[0] == treasureLocation[0] && sign2Location[1] == treasureLocation[1]) ||
				(sign2Location[0] == keyLocation[0] && sign2Location[1] == keyLocation[1]) ||
				(sign2Location[0] == mapLocation[0] && sign2Location[1] == mapLocation[1]) ||
				(sign2Location[0] == gogglesLocation[0] && sign2Location[1] == gogglesLocation[1]) ||
				(sign2Location[0] == sign1Location[0] && sign2Location[1] == sign1Location[1])) {
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