package bucky;
import java.util.Scanner;

public class Tutorial7 {
	private static Scanner bucky;

	public static void main (String args[]){
		bucky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter second num: " );
		snum = bucky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
