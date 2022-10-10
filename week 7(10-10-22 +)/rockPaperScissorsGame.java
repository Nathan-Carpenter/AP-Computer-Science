import java.util.Scanner;

public class rockPaperScissorsGame {
        public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        int run = 1;
        System.out.println("\033[H\033[2J");
        textDelay("This is a game of rock paper scissors against Dylan the All Knowing ");
        timeDelay(600);
        textDelay("Please enter rock, paper, or scissors ");
        System.out.println(" ");
        while(run == 1){
            
            
        
            

            String guess = keyboard.nextLine();

            // making sure user gave correct input

            while(!guess.equals("rock") && !guess.equals("paper") && !guess.equals("scissors")){
                textDelay("please enter rock, paper, or scissors");
                System.out.println(" ");
                guess = keyboard.nextLine();
            }

            // outcomes


            if(guess.equals("rock")){
                textDelay("Dylan puts out paper");
                textDelay("You put out rock");
                textDelay("You loose");
            }
            if(guess.equals("paper")){
                textDelay("Dylan puts out scissors");
                textDelay("You put out paper");
                textDelay("You loose");
                
            }
            if(guess.equals("scissors")){
                textDelay("Dylan puts out rock");
                textDelay("You put out scissors");
                textDelay("You loose");
            }

            System.out.println(" ");

            textDelay("Ah man you lost, try again? (1 for yes, 2 for no)");
            System.out.println(" ");
            run = keyboard.nextInt();
            while(run != 1 && run != 2){
                textDelay("Please enter 1 or 2");
                run = keyboard.nextInt();
            }
            System.out.println("\033[H\033[2J");

        }
    

        keyboard.close();
    }

    public static void timeDelay(int l){
        try{
            Thread.sleep(l);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static void textDelay(String phrase){
        int phraseLength = phrase.length();
        int position = 0;

        System.out.println(" ");

        for(position = 0; position < phraseLength; position++){
            System.out.print(phrase.charAt(position));
            timeDelay(30);
        }



    }
}
