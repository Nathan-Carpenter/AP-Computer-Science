import java.util.*;

public class NameBackwards {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("What is your name? ");
        String n = k.nextLine();

        char[] word = new char[n.length()];
        for(int x = 0; x < n.length(); x ++){
            word[x] = n.charAt(n.length() - x - 1); 
        }

        String newWord = new String(word);

        System.out.println(" ");
        System.out.println("Your name backwards is: " + newWord);

        k.close();
    }
}
