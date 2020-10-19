
import acm.program.*;
import acm.util.*;
import java.io.*;

public class Histogram extends ConsoleProgram {
	
	public void run() {
		
		initArray();
		
		BufferedReader rd = openFile("File Name: ");
		
		/* This will read each line until the end of the file
		 * Take each score as a string and change it to an int
		 * and increment the array depending on the score.
		 */
		
		try {
			while(true) {
				String line = rd.readLine();
				if(line == null) break;
				int score = Integer.parseInt(line);
				if (score >=0 && score <=9) {
					scores[0]++;
				} else if (score >=10 && score <=19) {
					scores[1]++;
				} else if (score >=20 && score <=29) {
					scores[2]++;
				} else if (score >=30 && score <=39) {
					scores[3]++;
				} else if (score >=40 && score <=49) {
					scores[4]++;
				} else if (score >=50 && score <=59) {
					scores[5]++;
				} else if (score >=60 && score <=69) {
					scores[6]++;
				} else if (score >=70 && score <=79) {
					scores[7]++;
				} else if (score >=80 && score <=89) {
					scores[8]++;
				} else if (score >=90 && score <=99) {
					scores[9]++;
				} else if (score == 100) {
					scores[10]++;
				} else {
					throw new ErrorException("Score is outside 0-100 range.");
				}
			}
			
			printScores(scores);
			rd.close();
			
		} catch (IOException e) {
			throw new ErrorException(e);
		}
		
	}
	
	private BufferedReader openFile(String prompt) {
		BufferedReader rd = null;
		
		while (rd == null) {
			try {String fileName = readLine(prompt);
					rd = new BufferedReader(new FileReader(fileName));
			} catch (IOException e) {
				println("File not found.");
			}
		}
		return rd;
}

	
	private int[] scores;
	
	// Initializing an array for the scores.
	
	private void initArray() {
		scores = new int[11];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = 0;
		}
	}
	
	/* Prints the score range along with the number of scores
	 * for that range as asterisks next to the range. 
	 */
	
	private void printScores(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int stars = arr[i];
			if(i == 0) {
				print("00-09: ");
			} else if (i == 10) {
				print(" 100: ");
			} else {
				print((i*10) + "-" + ((i*10)+9) + ": ");
			}
			for(int j = 0; j < stars; j++) {
				print("*");
			}
			println('\n');
		}
	}
}
