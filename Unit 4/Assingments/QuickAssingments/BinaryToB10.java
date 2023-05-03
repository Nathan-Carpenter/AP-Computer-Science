import java.util.*;

public class BinaryToB10 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("Please enter a number in binary");

        String w = k.nextLine();

        System.out.println(" ");
        System.out.println(w + " in base 10 is: " + Integer.parseInt(w,2));  
        System.out.println(" ");

        k.close();
    }
    
}
