import java.util.Scanner;

public class SecondConversion{
   public static void main(String[] args){
   
   Scanner input = new Scanner (System.in);

   
   int SECONDS = input.nextInt();
   int min = 0;
   int hours = 0;
   int sec = 0;
   
   min = SECONDS / 60;
   hours = min / 60;
   sec = SECONDS % 60;
   min = min - (hours * 60);
   
   System.out.print("Hours-" + hours + " Minutes-" + min + " Sec-" + sec);
   }
 }  
   

   