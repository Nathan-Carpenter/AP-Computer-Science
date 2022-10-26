import java.util.Scanner;



public class rockPaperScissors {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);

        // 0 = rock
        // 1 = paper
        // 2 = scissors 

        int hand = (int)(Math.random()*3); 

        System.out.println("This is a game of rock paper scissors against Dylan");
        System.out.println("Please put out rock, paper, or scissors");

        String guess = keyboard.nextLine();

        // making sure user gave correct input

        while(!guess.equals("rock") && !guess.equals("paper") && !guess.equals("scissors")){
            System.out.println("That is not one of the options, please enter rock, paper, or scissors");
            guess = keyboard.nextLine();
        }

        // outcomes

        System.out.println(" ");
        if(guess.equals("rock")){
            if(hand == 0){
                System.out.println("Dylan puts out Rock");
                System.out.println("you put out rock");
                System.out.println("you tie");
            }
            if(hand == 1){
                System.out.println("Dylan puts out paper");
                System.out.println("you put out rock");
                System.out.println("you loose");
            }
            if(hand == 2){
                System.out.println("Dylan puts out scissors");
                System.out.println("you put out rock");
                System.out.println("you win");
            }
        }
        else if(guess.equals("paper")){
            if(hand == 0){
                System.out.println("Dylan puts out Rock");
                System.out.println("you put out paper");
                System.out.println("You win");
            }
            if(hand == 1){
                System.out.println("Dylan puts out paper");
                System.out.println("you put out paper");
                System.out.println("you tie");
            }
            if(hand == 2){
                System.out.println("Dylan puts out scissors");
                System.out.println("you put out paper");
                System.out.println("you loose");
            }
        }
        else if(guess.equals("scissors")){
            if(hand == 0){
                System.out.println("Dylan puts out Rock");
                System.out.println("you put out scissors");
                System.out.println("You loose");
            }
            if(hand == 1){
                System.out.println("Dylan puts out paper");
                System.out.println("you put out scissors");
                System.out.println("you win");
            }
            if(hand == 2){
                System.out.println("Dylan puts out scissors");
                System.out.println("you put out scissors");
                System.out.println("you tie");
            }
        }


        keyboard.close();


    }
}
