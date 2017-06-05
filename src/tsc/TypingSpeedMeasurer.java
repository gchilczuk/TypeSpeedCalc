package tsc;

import java.util.Scanner;

public class TypingSpeedMeasurer {
	public static long N2mS = 1000000;
	Scanner sc = new Scanner(System.in);
	
	public TypingSpeedMeasurer(){  }
	
	public void performMeasure(){
		long start = 0;
		long elapsedTime = 0;
		String sample = "";
			System.out.print("Hit enter and start typing:");
			sample = sc.nextLine();
			start = System.nanoTime();
			sample = sc.nextLine();
			elapsedTime = (System.nanoTime() - start)/N2mS;
		

			System.out.println("Yout typed "+sample.trim().split("\\s+").length 
					+ " words ("+sample.length()+" characters)"+" in "+elapsedTime+" miliseconds.");
			double perChar = SpeedCalculator.caculateSpeedPerCharacter(elapsedTime, sample);
			double perWord = SpeedCalculator.caculateSpeedPerWord(elapsedTime, sample);
			System.out.format("Your typing speed:\n %.2f miliseconds per char\n %.2f miliseconds per word\n", perChar, perWord);
		
		System.out.println("The end");
	}
}
