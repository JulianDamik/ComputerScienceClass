package bucky;
import java.util.Scanner;

public class Tutorial8 {
	private static Scanner bucky;

	public static void main (String args[]){
		bucky = new Scanner(System.in);
		
		int girls, boys, people;
		girls = 25;
		boys = 25; 
		people = girls / boys;
		System.out.println(people);
	}
}
// "int" is any number without decimal points. 