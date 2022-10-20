import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        
        
        System.out.print("Enter a word (q to quit): ");
        input = keyboard.nextLine();
        while(!input.equals("q")){

	        
	        System.out.println("Parrot says: " + input);
            System.out.print("Enter a word (q to quit): ");
            input = keyboard.nextLine();
        }

        System.out.println("Parrot says: good bye");
        keyboard.close();

    }
}
