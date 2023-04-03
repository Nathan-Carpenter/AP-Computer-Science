import java.util.*;

public class MoonToEarthWeight {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("Weight on the Moon is approximately ⅙ of weight on Earth");
        System.out.println("Please enter a weight to find the equivalent weight on the Moon");

        double w = Double.parseDouble(k.nextLine());

        System.out.println(" ");
        System.out.println("A weight of " + w + " on the earth is " + w / 6 + "on the moon");
        System.out.println(" ");

        k.close();
    }
}
