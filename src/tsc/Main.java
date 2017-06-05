package tsc;

public class Main {

	public static void main(String[] args) {
		boolean speed_per_char = testSpeedPerCharacter();
		boolean speed_per_word = testSpeedPerWord();

//		System.out.println("Speed per char " + (speed_per_char ? "succeed":"failed"));
//		System.out.println("Speed per word " + (speed_per_word ? "succeed":"failed"));
		
		TypingSpeedMeasurer tsm = new TypingSpeedMeasurer();

		System.out.println("Typing speed calculator.");
		tsm.performMeasure();
		
	}
	
	static boolean testSpeedPerCharacter(){
		return SpeedCalculator.caculateSpeedPerCharacter(100, "Ala ma kota.") == 100./12;
	}
	
	static boolean testSpeedPerWord(){
		return SpeedCalculator.caculateSpeedPerWord(100, "Ala ma kota.") == (100.)/3;
	}
	
	

}
