package tsc;

public class Main {

	public static void main(String[] args) {
		boolean speed_per_char = false, speed_per_word = false;
		try{
			speed_per_char = testSpeedPerCharacter();
			speed_per_word = testSpeedPerWord();
		} catch (Exception e){
			System.out.println("Fatal error");
		}
		
		System.out.println("Speed per char " + (speed_per_char ? "succed":"failed"));
		System.out.println("Speed per word " + (speed_per_word ? "succed":"failed"));
		
	}
	
	static boolean testSpeedPerCharacter(){
		return SpeedCalculator.caculateSpeedPerCharacter(100, "Ala ma kota.") == 100./12;
	}
	
	static boolean testSpeedPerWord(){
		return SpeedCalculator.caculateSpeedPerWord(100, "Ala ma kota.") == 100./3;
	}
	
	

}
