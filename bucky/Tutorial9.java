package bucky;
import java.util.Scanner;

public class Tutorial9 {
	private static Scanner bucky;

	public static void main(String args[]){
		bucky = new Scanner(System.in);
		
		int tuna = 5;
		int bass = 18;
		
		tuna *= 8;
		bass += 2;
		System.out.println(tuna);
		System.out.println(bass);
	}
}
