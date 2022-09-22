//import java.util.*;
import java.util.Scanner;

public class fruitPicker{
    public static void main(String[] args){


        System.out.print("Please enter your name (not capitalized) ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        keyboard.close();




        if (input.equals("nathan")){
            System.out.println("you know what this does... you coded this yourself idiot");

        }
        else if (input.equals("henry")){
            System.out.println("Sorry, redhead not permitted");

        }

        else if (input.equals("asher")){
            System.out.println("Error, hotwheel kid detected");
            System.out.println("Now downloading hot skeleton pics");
            System.out.println("Please wait...");
        }

        
        else{
            System.out.println("Ehh... I dont really agree");
            
        }




    }
}


// If statements: Checks to see IF an input matches the criteria, ELSE it does not