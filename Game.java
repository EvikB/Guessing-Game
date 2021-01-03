package cz.czechitas.java;

import cz.czechitas.java.util.Utils;

public class Game {

	public static void main(String[] args) {
		
		// define the maximum of attempts
		int maxAttempt = 8;
				
		
		
		// Step 1: Show game instructions.
		Utils.popUpShowMessage("Hello! Welcome to the NUMBER GUESS GAME.");
		Utils.popUpShowMessage("Guess randomly picked number\n"
				+ "between 1 and 100 in " + maxAttempt + " attempts.\n Good luck!");
		
		
		// Step 2: Pick and store a number. 
		// BTW: tady predstiram, ze si ho pocitac vybral random, ale urcila jsem ho ja - zvolila jsem cislo 15.
		int computerNumber;
		computerNumber = generateRandomNumber() ;
			
		// Step 6 - Setting the loop - max. 8 times - has to be already before the User Guess.
		int index;
		for (index=0 ; index<8 ; index++)		
		{
		
		// Step 3: Ask user for his guess and store the guess.
		int userGuess;
		userGuess = Utils.popUpReadNumber("Please insert your guess\n"
				+ "You still have "+ ( maxAttempt - index ) + " attempts.");
		

		
	
		
		// Step 4: start with the conditions
		
		if(userGuess == computerNumber ) {
		Utils.popUpShowMessage("Congratulations!\nYou won in " + (index + 1) + " rounds." ); 
		Utils.exitProgram();
		
		} else if (userGuess < computerNumber)  {
		Utils.popUpShowMessage("This one is too low.");
		
		} else if (userGuess > computerNumber) {
			Utils.popUpShowMessage("This one is too high.");
		} 
		
		// Step 4a: enhance with (in)valid numbers. 
		// BTW - it works, but at the same if we put e.g. 105 it gives us this note BUT AS WELL the one "it is too high".
				if(userGuess <= 0) 
			Utils.popUpShowMessage("This is invalid number.");
		
		if(userGuess >= 101) 
			Utils.popUpShowMessage("This is invalid number.");
		
		} 
		
		
		Utils.popUpShowMessage("Sorry, you´re a loser. Come back and try again.");
		}
	
	
	public static int generateRandomNumber () {
		
		// Step 1: Get the random number from Math (library)
		double randomNumber;
		randomNumber = Math.random();
		
		// Step 2: mutiply by 100
		randomNumber = randomNumber * 100;
		
		// Step 3: Remove decimal part
		int result;
		result = (int)randomNumber; //<- basically this takes only the integral part from the double kind of number OR in another words it cuts off the decimal part of the double
		
		
		// Step 4: Add 1
		result = result + 1;	
		
		return result;
	}
	
	
}
