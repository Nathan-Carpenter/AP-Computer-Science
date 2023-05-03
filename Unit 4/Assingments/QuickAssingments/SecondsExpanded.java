import java.util.*;

public class SecondsExpanded {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("Please enter an amount of seconds");

        int seconds = Integer.parseInt(k.nextLine());

        int minutes = 0;
        int hours = 0;

        while(seconds > 3600){
            seconds -= 3600;
            hours ++;
        }
        while(seconds > 60){
            seconds -= 60;
            minutes++;
        }

        System.out.println(" ");
        System.out.println("Your original time in standard format is: " + hours + "h, " + minutes + "m, " + seconds + "s");  
        System.out.println(" ");

        k.close();
    }
    
}
