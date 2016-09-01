package elfunc;

public class RollDiceFunc {
	static String[] paths = {"one","two","three","four","five","six"};

	public static String rollDiceResult(){
		int tmp = (int)(Math.random()*6);
		 
		return paths[tmp];
	}
}
