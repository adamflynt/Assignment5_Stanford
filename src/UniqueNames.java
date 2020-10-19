import acm.program.*;
import java.util.*;

public class UniqueNames extends ConsoleProgram {

	public void run() {

		ArrayList<String> list = new ArrayList<String>();

		while (true) {
			String nameEntered = readLine("Enter name: ");
			if (nameEntered.equals(""))
				break;
			if (!list.contains(nameEntered)) { // If a name entered is not in the ArrayList, it will be added to the ArrayList.
				list.add(nameEntered);
			}
		}
		println("Unique name list contains: ");
		printArrayList(list);
	}

	// Prints out the ArrayList
	private void printArrayList(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}

}
