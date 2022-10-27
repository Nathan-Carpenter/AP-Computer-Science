import java.util.Scanner;

public class PrinterTesting {
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to hear a song?");

        String phrase = keyboard.nextLine();
        while(!phrase.equals("yes") && !phrase.equals("no")){
            textDelay("Please say either 'yes' or 'no' ", true);
            phrase = keyboard.nextLine();
        }

        System.out.println(" ");

        if(phrase.equals("no")){
            textDelay("Oh well... okay", true);
            System.out.println(" ");
            System.exit(0);
        }

        else if(phrase.equals("yes")){
            textDelay("Oh, thats wonderful!", true);
            textDelay("Lets play it!", true);
            
            TimeDelay(500);
            System.out.println("\033[H\033[2J");

            textDelay("We're no strangers to love", true);
            TimeDelay(300);
            textDelay("You know the rules and so do I", false);
            TimeDelay(200);
            textDelay("(do I)", true);
            TimeDelay(300);
            textDelay("A full commitment's what I'm thinking of", true);
            TimeDelay(300);
            textDelay("You wouldn't get this from any other guy", true);
            TimeDelay(300);
            textDelay("I just wanna tell you how I'm feeling", true);
            TimeDelay(300);
            textDelay("Gotta make you understand", true);
            TimeDelay(300);
            textDelay("Never gonna give you up", true);
            TimeDelay(300);
            textDelay("Never gonna let you down", true);
            TimeDelay(300);
            textDelay("Never gonna run around and desert you", true);
            TimeDelay(300);
            textDelay("Never gonna make you cry", true);
            TimeDelay(300);
            textDelay("Never gonna say goodbye", true);
            TimeDelay(300);
            textDelay("Never gonna tell a lie and hurt you", true);
            TimeDelay(300);
            textDelay("We've known each other for so long", true);
            TimeDelay(300);
            textDelay("Your heart's been aching, but you're too shy to say it ", false);
            TimeDelay(200);
            textDelay("(say it)", true);
            TimeDelay(300);
            textDelay("Inside, we both know what's been going on ", false);
            TimeDelay(200);
            textDelay("(going on)", true);
            TimeDelay(300);
            textDelay("We know the game and we're gonna play it", true);
            TimeDelay(300);
            textDelay("And if you ask me how I'm feeling", true);
            TimeDelay(300);
            textDelay("Don't tell me you're too blind to see", true);
            TimeDelay(300);
            textDelay("Never gonna give you up", true);
            TimeDelay(300);
            textDelay("Never gonna let you down", true);
            TimeDelay(300);
            textDelay("Never gonna run around and desert you", true);
            TimeDelay(300);
            textDelay("Never gonna make you cry", true);
            TimeDelay(300);
            textDelay("Never gonna say goodbye", true);
            TimeDelay(300);
            textDelay("Never gonna tell a lie and hurt you", true);
            TimeDelay(300);
            textDelay("Never gonna give you up", true);
            TimeDelay(300);
            textDelay("Never gonna let you down", true);
            TimeDelay(300);
            textDelay("Never gonna run around and desert you", true);
            TimeDelay(300);
            textDelay("Never gonna make you cry", true);
            TimeDelay(300);
            textDelay("Never gonna say goodbye", true);
            TimeDelay(300);
            textDelay("Never gonna tell a lie and hurt you", true);
            TimeDelay(300);
            textDelay("We've known each other for so long", true);
            TimeDelay(300);
            textDelay("Your heart's been aching, but you're too shy to say it ", false);
            TimeDelay(200);
            textDelay("(to say it)", true);
            TimeDelay(300);
            textDelay("Inside, we both know what's been going on ", false);
            TimeDelay(200);
            textDelay("(going on)", true);
            TimeDelay(300);
            textDelay("We know the game and we're gonna play it", true);
            TimeDelay(300);
            textDelay("I just wanna tell you how I'm feeling", true);
            TimeDelay(300);
            textDelay("Gotta make you understand", true);
            TimeDelay(300);
            textDelay("Never gonna give you up", true);
            TimeDelay(300);
            textDelay("Never gonna let you down", true);
            TimeDelay(300);
            textDelay("Never gonna run around and desert you", true);
            TimeDelay(300);
            textDelay("Never gonna make you cry", true);
            TimeDelay(300);
            textDelay("Never gonna say goodbye", true);
            TimeDelay(300);
            textDelay("Never gonna tell a lie and hurt you", true);
            TimeDelay(300);
            textDelay("Never gonna give you up", true);
            TimeDelay(300);
            textDelay("Never gonna let you down", true);
            TimeDelay(300);
            textDelay("Never gonna run around and desert you", true);
            TimeDelay(300);
            textDelay("Never gonna make you cry", true);
            TimeDelay(300);
            textDelay("Never gonna say goodbye", true);
            TimeDelay(300);
            textDelay("Never gonna tell a lie and hurt you", true);
            TimeDelay(300);
            textDelay("Never gonna give you up", true);
            TimeDelay(300);
            textDelay("Never gonna let you down", true);
            TimeDelay(300);
            textDelay("Never gonna run around and desert you", true);
            TimeDelay(300);
            textDelay("Never gonna make you cry", true);
            TimeDelay(300);
            textDelay("Never gonna say goodbye", true);
            TimeDelay(300);
            textDelay("Never gonna tell a lie and hurt you", true);
            TimeDelay(300);

            

        }




        keyboard.close();

    }

    public static void TimeDelay(int x){
        try{
            Thread.sleep(x);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static void textDelay(String phrase, boolean line){
        int phraseLength = phrase.length();
        int position = 0;

        System.out.println(" ");

        for(position = 0; position < phraseLength; position++){
            System.out.print(phrase.charAt(position));
            TimeDelay(30);
        }

        if(line == true){
            System.out.println(" ");
            System.out.println(" ");
        }


    }
}
