/**
 * 
 */
package fancyFriday;

import java.util.Scanner;

/**
 * @author Student
 *
 */
public class mainApp {

	
	
	public static void main(String[] args) {
		
		String inputFancyFriday, inputSunny, inputRainy;
		boolean fancyFriday = false;
		boolean sunny = false;
		boolean rainy = false;
		
		String inputContinue;
		boolean userContinue= true;
		
		
		Scanner input = new Scanner(System.in);
		
		while (userContinue = true){
		System.out.println("Is it fancy friday?");
		 inputFancyFriday = input.nextLine();
		 
		 System.out.println("Is it sunny?");
		 inputSunny = input.nextLine();
		 
		 System.out.println("is it rainy?");
		 inputRainy = input.nextLine();
		 
		 // System.out.println(inputFancyFriday + " " + inputSunny + " " + inputRainy);
		 
		 if (inputFancyFriday.equals("yes")) {
			 fancyFriday = true;
		 }
		 if (inputSunny.equals("yes")) {
			 sunny = true;
		 }
		 if (inputRainy.equals("yes")) {
			 rainy = true;
		 }
		 
		 // System.out.println(fancyFriday + " " + sunny + " " + rainy);
		 
		 if (fancyFriday){
			  if (sunny){ 
				  System.out.println("teagown");
			 } else if(rainy){
				 System.out.println("power suit");
			 } else { 
				 System.out.println("long gown");
			 }
		 } else {
			 System.out.println("tea shirt and jeans");
		 }
			 
		 System.out.println("Continue?");
		 inputContinue = input.nextLine();
		 if(inputContinue.equals("yes")){
			 userContinue = true;
		 } else {
			 userContinue = false;
		 }
	
	}

}
}