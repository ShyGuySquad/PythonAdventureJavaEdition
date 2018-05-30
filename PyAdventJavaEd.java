import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PyAdventJavaEd {
	public static void main(String[] args) throws java.io.IOException {
		// vars
		String[] strings1 = {"You wake up in a dark and mysterious cave.", "What do you want to do?", "You get up.", "You can't see anything.", "You run into a wall. It feels hard and cold...", "You start to head back when suddenly, you see a fire start.", "You can now see everything in the room."};
		String[] strings2 = {"You see a switch on the wall. Next to it is the outline of a door.", "You arrive at the switch", "The door opens.", "You are temporarily blinded by the sun as the door opens.", "You are standing outside a grassy field, and the door closes behind you.", "There is a statue of a bird nearby."};
		String[] replies1 = {"Get up", "Look around", "Walk forward"};
		String[] replies2 = {"Walk to switch", "Activate switch", "Head outside", "Look around", "Go to bird statue"};
		String[] query = {"What do you want to do? ", "What do you want to do now? "};
		String[] invalid = {"Please enter a valid response."};
		boolean control = true; // change to false after each loop
		System.out.println("PYTHON ADVENTURE");
		System.out.println("Java Edition");
		System.out.println(strings1[0]);
		System.out.println(strings1[1]);
		System.out.println(replies1[0]);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// to use keyboard input, simply type:
		try{
			String reply = reader.readLine();
			while(control){
				System.out.println(replies1[1] + "\t" + replies1[2]);
				System.out.println(query[0]);
				reply = reader.readLine();
				if(reply.equalsIgnoreCase(replies1[1])){
					System.out.println(strings1[3]);
					control = true;
				} else if(reply.equalsIgnoreCase(replies1[2])){
					System.out.println(strings1[4]);
					control = false;
				} else{
					System.out.println(invalid[0]);
					control = true;
				}
			}
		} catch(Exception e) {
			System.out.println("An error occured. Please report the error on the Issues page on GitHub (https://github.com/Tetraforce/PyAdventJavaEd/issues).");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		// now reply will be whatever the user typed in before pressing enter.
	}
}
