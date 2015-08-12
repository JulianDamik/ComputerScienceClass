package bucky;

import java.util.Scanner;

class Tutorial16{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna(null);
		System.out.println("Enter name of first GF here: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
	}
}
	