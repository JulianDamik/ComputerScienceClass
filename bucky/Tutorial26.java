package bucky;

import java.util.Random;

class Tutorial26{
	public static void main(String[] args) {
			Random dice = new Random();
			int number;
			
			for(int counter=1; counter<=2;counter++){
				number = 1+dice.nextInt(6);
				System.out.println(number + " ");
			}
		}
	}
// random number generator