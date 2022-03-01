import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class Hangman {

	// reset
	// getUsedLetters
	// convertWordToCharArray
	// isLetterUsed
	// fillLetter
	// getFiller
	// run
	// isDead
	// isLetterInWord


// Get input in java
// https://www.w3schools.com/java/java_user_input.asp

	// Pick a word from the list

	// Draw the gallows

	// Show Hyphens
	
	// While NOT DEAD
		// Get input
		// Is Letter in PHrase 
			// YES
				// Fill in the hyphenated word
				// If solved then get out
			// NO
				// Store the wrong letter
				// Pick a body part

	public static void main(String [] args) {

		System.out.println("Hello World");

			// This is the list of words that we randomly select
			// This can be a class
			// String [] words = {
			// 	"United States",
			// 	"Mexico","Canada","Nepal","Canada",
			// 	"China", "Zimbabwe","Sudan","Japan",
			// 	"Ireland", "Ethiopia","North Korea",
			// 	"South Korea","Chad","South Africa",
			// 	"Cuba","Russia","Morroco","Indonesia","Portugal",
			// };

			String [] body_part_names = {
				"Head", "Body", "Left Arm", "Right Arm", "Left Leg", "Right Leg"
			};

			// Random rand = new Random(); //instance of random class
			int body_parts = 0;

			// //generate random values from 0-24
			// int int_random = rand.nextInt(words.length);

			// // Random Word 
			// // System.out.println(words[int_random]); 
			// String the_random_word = words[int_random].toUpperCase();

		WordList wl = new WordList("word.txt");
    String the_random_word = wl.getRandomWord();


			char [] filler = null;
			// create a character array with the length of the_random_word
			filler = new char[the_random_word.length()];

			// Using a for loop to initialize filler to blanks
			for(int i=0; i<filler.length; i++) { 
				if(Character.isLetter(the_random_word.charAt(i))) {
					filler[i] = '-';
				}
				else {
					filler[i] = ' ';
				}
			}

			System.out.println(filler);
      
			boolean found = false;
			Scanner keyboard = new Scanner(System.in);

			ArrayList alUsedLetters = new ArrayList();

			do {
				// Get some input
				System.out.println("Used Letters: " + alUsedLetters);
				System.out.println("Enter your word");
				String the_users_word = keyboard.nextLine().toUpperCase();
				System.out.println("The word is: " + the_users_word);

				// if(the_users_word.length() == 0 || the_users_word.length() > 1) {
				if(the_users_word.length() != 1) {
					System.out.println("Invalid entry");
					continue;
				}

				char the_character = the_users_word.charAt(0);
				if (the_character == ' ') {
					System.out.println("Don't enter spaces");
					continue;
				}

				boolean letter_found = false;

        // checks character entered then 
				for(int i=0; i<the_random_word.length(); i++) {
					if (the_character == the_random_word.charAt(i)) {
						filler[i] = the_character;
						letter_found = true;
					}
				}

				// System.out.println(the_random_word);
				System.out.println(filler);
				// found = the_random_word.compareTo(filler.toString()) == 0;
				String fillerString = new String(filler);
				found = the_random_word.compareToIgnoreCase(fillerString) == 0;
				
				System.out.println(filler);

				// If we found a letter then we skip the rest
				if(!letter_found) {
					// Add the letter to the list of used letters
					alUsedLetters.add(the_users_word);
					System.out.println("Nope. That letter isn't there.");
					System.out.println(body_part_names[body_parts]);

					// Add the letter to the used letter pile
					body_parts = body_parts + 1;
				}

			} while(!found && body_parts < body_part_names.length); // until found

			if(found) {
				System.out.println("Good Job!");
			}
			else {
				System.out.println("This is the word: " + the_random_word);
			}


	}
}