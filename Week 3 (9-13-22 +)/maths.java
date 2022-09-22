import java.util.Scanner;
//import java.util.*;

public class maths {
    public static void main(String[] args){
       int guess = 0;
       System.out.println("Please enter a number between 1 and 100");
       Scanner keyboard = new Scanner(System.in);
       guess = keyboard.nextInt();

       // + add
       // - subtract
       // * times
       // / divide
       // % mod - returns the remainder of deviding the numbers

       // Conditional Opperators 
       // compare two variables to see if they meet the given criteria
       // ==  does __ condition __
       // == equals
       // != does not equal
       // > greater than
       // < less than
       // >= greater than or equal to
       // <= less than or equal to

       guess = guess^3 *3 + 17;

       System.out.println("The math wizard has changed your number, guess what it is!");
       int newGuess = 0;
       while (newGuess != guess){
        Scanner keyboard2 = new Scanner(System.in);

            newGuess = keyboard2.nextInt();
        
            if (newGuess > guess){
                System.out.println("Too bad, your guess was too high!");
            }

            else if (newGuess < guess){
                System.out.println("Aww, your guess was too low");
            }

       }  
        System.out.println("Congrats! you guessed the new number, " + guess + ", correctly!");
        



       


       keyboard.close();
       
       
    }
    
}
