import java.util.Scanner;

/**
 * Lab 2.2 - Decision Making
 * 
 * Objectives:
 * Prompts the user to enter an integer from 1 to 100
 * 	If odd, print number and "Odd"
 * 	If even and between 2 and 25, print "Even and less than 25"
 * 	If even and between 26 and 60, print "Even"
 * 	If even and greater than 60 print number and "Even"
 * 	If odd and greater than 60, print number and "Odd and over 60"
 * 
 * Extras:
 * 	Ask for name and reference throughout application
 * 	Check if positive and between 1 and 100
 * @author Brendan
 */
public class DecisionMaking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String continueResponse = "";
		
		System.out.println("Please enter your name:");
		String name = scanner.nextLine();
		
		do {
			System.out.printf("Hello %s! Please enter a number between 1 and 100\n", name);
			System.out.println(getResponse(scanner.nextInt()));
			System.out.println("Continue? (y/n)");
			continueResponse = scanner.next();
		} while (continueResponse.equalsIgnoreCase("y"));
		
		System.out.printf("Bye %s!\n", name);
		scanner.close();
	}
	
	/**
	 * The main brain of the program, determines the console response for the given number
	 * based on the lab requirements.
	 * 
	 * @param number The input number
	 * @return The proper output message.
	 */
	private static String getResponse(int number) {
		String out = "";
		if (number < 1 || number > 100) {
			return "Invalid number!";
		}
		if (number % 2 != 0) {
			return number > 60 ? number + " Odd and over 60" : number + " and Odd";
		} else if (number % 2 == 0) {
			if (number < 25 && number >= 2) {
				return "Even and less than 25";
			}
			if (number > 26 && number < 60) {
				return "Even";
			}
			if (number > 60) {
				return number + " Even";
			}
		}
		return out;
	}
}
