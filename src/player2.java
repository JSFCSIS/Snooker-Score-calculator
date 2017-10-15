
public class player2 {
	
	private static int score;
	private static int red;
	private static int yellow;
	private static int green;
	private static int brown;
	private static int blue;
	private static int pink;
	private static int black;
	
	@SuppressWarnings("unused")
	public player2(){
		int score;
		int red;
		int yellow;
		int green;
		int brown;
		int blue;
		int pink;
		int black;
	}
	
	public static void addRed(){
		score = score + 1;
		red++;
		
	}
	
	public static void addYellow(){
		score = score + 2;
		yellow++;
		
	}
	
	public static void addGreen(){
		score = score + 3;
		green++;
		
	}
	
	public static void addBrown(){
		score = score + 4;
		brown++;
		
	}
	
	public static void addBlue(){
		score = score + 5;
		blue++;
		
	}
	
	public static void addPink(){
		score = score + 6;
		pink++;
		
	}
	
	public static void addBlack(){
		score = score + 7;
		black++;
		
	}
	
	
	public static int getScore(){
		return score;
	}
	
	public static void resetScore(){
		score = 0;
		red = 0;
		yellow = 0;
		green = 0;
		brown = 0;
		blue = 0;
		pink = 0;
		black = 0;
		
	}
	
	public static String getColors(){
		String colors = "\n\nRed: " + red + "\nYellow: " + yellow + "\nGreen: " + green + "\nBrown: " + brown + 
				"\nBlue: " + blue + "\nPink: " + pink + "\nBlack: " + black;
		
		return (colors);
	}
	
	public static int getRed(){
		return red;
	}
	

}
