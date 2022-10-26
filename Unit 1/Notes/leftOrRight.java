import java.util.Scanner;

public class leftOrRight{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // 0 is left
        // 1 is right

        int hand = (int)(Math.random()*2);
        // set our guess to something that is not left or right
        int guess = -2;

        // add in our while checker
        while(guess != hand){
            System.out.println("Which hand am I holding the candy in? left or right");
            String input = keyboard.nextLine();

            if(input.equals("left")){
                guess = 0;
            }
            else if(input.equals("right")){
                guess = 1;
            }
            else{
                System.out.println("Please pick left or right");
            }



        }

    
        System.out.println("Congrats! you guessed the correct hand, have a candy");
        keyboard.close();
        
        
        


    }
}
