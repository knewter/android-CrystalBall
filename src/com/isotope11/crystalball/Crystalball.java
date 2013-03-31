package com.isotope11.crystalball;

import java.util.Random;

public class Crystalball {
	public String mAnswers[] = {
	    "It is certain",
  	    "It is decidedly so",
	    "All signs say YES",
	    "The stars are not aligned",
	    "My reply is no",
	    "It is doubtful",
	    "Better not tell you now",
	    "Concentrate and ask again",
	    "Unable to answer now"
	};
	
    public String getAnAnswer(){
		// Choose string to show
		String answer = "";
		
		// Randomly select one of three answers: Yes, No, or Maybe.
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		return answer;
    }
}
