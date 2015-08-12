package bucky;

class Tutorial18{
	public static void main(String[] args) {
		int age = 60;
		
		if (age < 50){
			System.out.println("You are young");
		}else{
			System.out.println("You are old");
			if (age > 75)
				System.out.println("You are really old");
			else{
				System.out.println("don't worry you aren't really old");
			}
		}
	}
}
// nesting if else statments