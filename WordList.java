import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class WordList {

	// Member Variables

	// IN python we used a list to store the Word
	// ARrayList is a generic or a template class
	private ArrayList<String> alWords =  new ArrayList<String>();

	// Member Functions (methods)
	// Constructor
	public WordList() {
		alWords.add("USA");
		alWords.add("Mexico");
		alWords.add("Canada");
	}

	public WordList(String filename) {
		// https://www.w3schools.com/java/java_files_read.asp
		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
			String data = myReader.nextLine().toUpperCase();
			alWords.add(data);
			// System.out.println(data);
			}
			myReader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    } 
    
    		// open the file
		// while(open)
		//    read a line
		//    add the line to the alWords 
 
        
    	

	public String getRandomWord() {
		Random rand = new Random(); //instance of random class

		//generate random values from 0-24
		int int_random = rand.nextInt(alWords.size());

		// Random Word 
		// System.out.println(words[int_random]); 
		String the_random_word = alWords.get(int_random);

		return the_random_word;
	}


	// readFile
	// getRandomWord

	// This is the entry point
	public static void main(String [] args) {
		WordList wl = new WordList("word.txt");
		System.out.println(wl.getRandomWord());
	}

}