import java.util.Scanner;
// import java.util.concurrent.ScheduledThreadPoolExecutor;

public class user_input{
	
	public static void main(String[] args){
		System.out.print("Lets Test if this works! ");



		System.out.print("Please enter a word or phrase, ");

		try(Scanner keyboard = new Scanner(System.in)){
			
			
			String input = keyboard.nextLine();
			// System.out.println(input);

			

			// System.out.println("You said, " + input);
			
			System.out.println("There are " + input.length() + " characters in your word or phrase");
			System.out.println("The second to last letter in your word or phrase is: " + input.charAt(input.length() - 2 ));
		}
	

	}


}

