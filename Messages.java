package roland.barrenmoore;

public class Messages {
	//MESSAGES TO PLAYER
	
		//Prints an introduction message to initialise the game
		public Messages() {
			System.out.println("You slowly awaken, and open your eyes. You look around, and");
			System.out.println("are unable to recognise your surroundings. You are");
			System.out.println("enveloped in a thick fog. It is so dense it looks like a");
			System.out.println("wall around you, you are unable to see for further than a");
			System.out.println("metre or so ahead. The landscape feels devoid of life, but for");
			System.out.println("a few weeds poking out of the dirt. You cannot remember how");
			System.out.println("or why you are here. What looks like a strange watch is");
			System.out.println("strapped to your wrist. It displays a direction, that turns");
			System.out.println("with you, and a number. It looks like a compass of some sort.");
			System.out.println("You wonder what it directs you towards, and how you got it.");
			System.out.println("It seems likely that it points towards objects.\n");
		}
		
		//Treasure Chest
		public void playerFindsTreasure() {
			System.out.println("You stumble upon a strange looking box poking out of the");
			System.out.println("ground. You walk towards it, kneel, and start clawing at");
			System.out.println("the ground around it. Eventually you uncover the lid, the");
			System.out.print("catch looks locked. ");

		}
		public void playerCantOpenTreasure(){
			System.out.println("After a few tries, you realise you need");
			System.out.println("a key to open this chest.");
		}
		public void playerTakesTreasure(){
			System.out.println("You insert the key into the lock, and");
			System.out.println("give it a few turns. The catch is stiff, but it eventually");
			System.out.println("unlocks and falls away. You push back the lid. It is heavy,");
			System.out.println("but you manage to open it. In it there is a stange device");
			System.out.println("with a button. You decide to press it, and you are");
			System.out.println("teleported home!\n");
			System.out.println("CONGRATULATIONS! YOU HAVE WON THE GAME!");
		}
		
		//Key
		public void playerFindsKey() {
			System.out.println("You see something glinting in the ground. After shuffling");
			System.out.println("the dirt around a little with your foot, you realise there");
			System.out.println("is a key on the floor. You decide to take it with you, but");
			System.out.println("but you wonder what it opens.");
		}
		
		//Map
		public void playerFindsMap() {
			System.out.println("You take a fright as you see a bleached skeleton half buried");
			System.out.println("in the dirt. Clutched in its hands are a blank clay tablet");
			System.out.println("and a stylus. You wonder how long the corpse must have been");
			System.out.println("here but there is no way to tell. You decide to take the writing");
			System.out.println("implements so you can remember any coordinates you have visited.");
			System.out.println("(Type 'map' to access)");
		}
		
		//Goggles
		public void playerFindsGoggles() {
			System.out.println("You see something shining in the dirt, half hidden under a");
			System.out.println("thorny bush. You reach underneath the bush to pull it our and");
			System.out.println("realise it is a strange pair of goggles with a note. The note");
			System.out.println("is in a strange language, but when you read it through the");
			System.out.println("goggles you can understand it somehow. It reads:");
			System.out.println("'USE THESE WISELY'");
		}
		
		//Sign1
		public void playerFindsSign1() {
			System.out.println("You stumble upon a strange rock. Scratched into it's surface");
			System.out.print("is a message in a strange looking language. ");
		}
		public void playerDoesntUnderstandSign1() {
			System.out.println("It looks like you");
			System.out.println("need to learn how to understand this before it can help you.");
		}
		public void playerUnderstandsSign1() {
			System.out.println("You decipher the");
			System.out.println("message and you realise they are coordinates for a key of");
			System.out.println("some sort:");
		}
		
		//Sign2
		public void playerFindsSign2() {
			System.out.println("You stumble upon a strange signpost. Displayed on it's surface");
			System.out.print("is a message in a strange looking language. ");
		}
		public void playerDoesntUnderstandSign2() {
			System.out.println("It looks like you");
			System.out.println("need to learn how to understand this before it can help you.");
		}
		public void playerUnderstandsSign2() {
			System.out.println("You decipher the");
			System.out.println("message and you realise they are coordinates for a chest of");
			System.out.println("some sort:");
		}
}
