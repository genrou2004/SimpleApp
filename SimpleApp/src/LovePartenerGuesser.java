

public class LovePartenerGuesser {

	int count = 0;

	String[] theLoveDocYouSays = { "You are dying to start your lifewith the other", "You want child with the other",
			"You want to bang her so bad", "You are so blind, you didn't notice she is ugly as fuck",
			"You are crazy in love with here, you could die", "Hello LOVE, Stupid in love",
			"You want annal with here, becuase the other has the booty you dream",
			"You are not eating and showring because of the other", "You have bought the house you both could live",
			"Please, the other who", "Oh shit, no you didn't",
			"oh lalalal, here I come...I am gonna find you...you can't hidde",
			"You want to do bad things to the other" };
	String[] theLoveDocOtherSays = { "The Other Loves you very Much", "The Other Have no Idea Who you are",
			"The Other Thinks You are cutie,but not a in a way you thinkabout them",
			"The other is dying to start a realtionship with you", "The other is not ready for relation ship",
			"The other thinks your ugly", "The other thinks you are stupid", "The other thinks, oh NOOOOOOOOO",
			"Hell NO", "Who The Fuck are You", "Go head pls kill yourself" };

	public int doCompetetion(char[] nameYou, char[] nameOther) { // Compute similar characters and return its occurance count.

		for (int i = 0; i < nameYou.length; i++) {
			for (int j = 0; j < nameOther.length; j++) {				
				if (nameYou[i] == nameOther[j]) {
					System.out.println("What the hell");
					nameOther[j] = 0;
					count++;
					break;
				} 
			}
		} 
		return count;

	}
}

