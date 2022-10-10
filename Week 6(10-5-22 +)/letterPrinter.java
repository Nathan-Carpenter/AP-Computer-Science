import java.util.Scanner;

public class letterPrinter {
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your phrase:");

        String phrase = keyboard.nextLine();

        textDelay(phrase, true);


        keyboard.close();

    }

    public static void TimeDelay(){
        try{
            Thread.sleep(30);
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
            TimeDelay();
        }

        if(line == true){
            System.out.println(" ");
            System.out.println(" ");
        }


    }
}
