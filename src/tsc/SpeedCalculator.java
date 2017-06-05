package tsc;

final class SpeedCalculator {
	private SpeedCalculator(){}
	static double caculateSpeedPerCharacter(long timeMillis, String sample){
		double len = sample.length();
		return timeMillis/len;
	}
	
	static double caculateSpeedPerWord(long timeMillis, String sample){
		double len = countWords(sample);
		double d = timeMillis/len;
		return d;
	}
	
	private static int countWords(String sample){
		String[] wordArray = sample.trim().split("\\s+");
	    return wordArray.length;
	}
}
