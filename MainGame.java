package roland.barrenmoore;

public class MainGame {
	
	public MainGame() {
		//create all objects
		Player player = new Player();
		Items items = new Items();
		Messages messages = new Messages();
			
		//assign positions to grid
		player.grid[1] = items.treasureLocation;
		player.grid[2] = items.keyLocation;
		player.grid[3] = items.sign1Location;
		player.grid[4] = items.sign2Location;
		player.grid[5] = items.gogglesLocation;
		player.grid[6] = items.mapLocation;
			
			//playing loop
			do {
				if (player.grid[0][0] == player.grid[1][0] && player.grid[0][1]==player.grid[1][1]) {		//treasure
					messages.playerFindsTreasure();													//Arrival at treasure
					player.foundChest = true;
					
					
					if (player.hasKey) {																//checks for key
						messages.playerTakesTreasure();													//plays victory script
						player.hasWon = true;
					}
					else {
						messages.playerCantOpenTreasure();												//sends away to find key
						player.act();
					}
				}
				
				if (player.grid[0][0] == player.grid[2][0] && player.grid[0][1]==player.grid[2][1]) {	//key
					if(!player.hasKey) {
						messages.playerFindsKey();
						player.hasKey = true;
					}
					player.act();
				}
				
				if (player.grid[0][0] == player.grid[3][0] && player.grid[0][1]==player.grid[3][1]) {	//Sign1
					messages.playerFindsSign1();
					if (player.foundGoggles) {
						messages.playerUnderstandsSign1();
						player.foundKeyLocation = true;
					}
					else if (!player.foundGoggles) {
						messages.playerDoesntUnderstandSign1();
					}
					player.act();
					player.foundSign1 = true;
				}
				
				if (player.grid[0][0] == player.grid[4][0] && player.grid[0][1]==player.grid[4][1]) {	//Sign2
					messages.playerFindsSign2();
					if (player.foundGoggles) {
						messages.playerUnderstandsSign2();
						player.foundChest = true;
					}
					else if (!player.foundGoggles) {
						messages.playerDoesntUnderstandSign2();
					}
					player.act();
					player.foundSign2 = true;
				}
				
				if (player.grid[0][0] == player.grid[5][0] && player.grid[0][1]==player.grid[5][1]) {	//Goggles
					if(!player.foundGoggles) {
						messages.playerFindsGoggles();
						player.foundGoggles=true;
					}
					player.act();
				}
				
				if (player.grid[0][0] == player.grid[6][0] && player.grid[0][1]==player.grid[6][1]) {	//Map
					if(!player.hasMap) {
						messages.playerFindsMap();
						player.hasMap=true;
					}
					player.act();
				}
				
				if(!player.checkMatch()) {																//player action
					player.act();
				}
			} while (!player.hasWon && player.isAlive);
	}
}