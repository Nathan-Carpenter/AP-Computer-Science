import java.util.*;

public class B10ToBinary {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("Please enter a number in base 10");

        int w = Integer.parseInt(k.nextLine());

        System.out.println(" ");
        System.out.println(w + " in binary is: " + Integer.toBinaryString(w));  
        System.out.println(" ");

        k.close();
    }
    
}
