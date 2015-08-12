package bucky;

import java.util.Scanner; 

class Tutorial15{
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner (System.in);
		tuna tunaObject = new tuna ();
		
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		tunaObject.simpleMessage(name);
	}
}
	