
import acm.program.*;
import java.io.*;

public class WordCount extends ConsoleProgram {
	
	public void run() {
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		BufferedReader rd = openFile("File Name: ");
		
		
		// This will return a line from the file, and add the line, character, and word counts.
		try {
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				lineCount++;
				charCount += line.length();
				String[] words = line.split("( )|(')");
				wordCount = wordCount + words.length;
			}
		rd.close();
	} catch(IOException ex) {
		println("IO Exception");
	}
		println("Lines = " + lineCount);
		println("Words = " + wordCount);
		println("Chars = " + charCount);

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
}
