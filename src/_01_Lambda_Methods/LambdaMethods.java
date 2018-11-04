package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			System.out.println("backwards");

		}, "backward");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length();i++) {
				char c = s.charAt(i);
				if(i %2==0) {
					System.out.print(Character.toUpperCase(c));
				}else {
					System.out.print(Character.toLowerCase(c));
				}
			
			}
			System.out.println("");
		}, "letters");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length();i++) {
				char c = s.charAt(i);
				
				System.out.print(c+".");
				
			}
		}, "letters");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length();i++) {
				
				
			}
		}, "vowel");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
