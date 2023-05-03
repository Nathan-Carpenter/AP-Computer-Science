import java.util.*;

public class FtoC {
    public static void main(String[] args) {

        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("Please enter the temperature in Farenheit that you want in Celcius");
        double temp = Double.parseDouble(k.nextLine());

        double newtemp = (temp - 32) * 5 / 9;

        System.out.println(" ");
        System.out.println(temp + " degrees F in Celcius is " + newtemp + " degrees C");
        System.out.println(" ");

        k.close();
    }
}
