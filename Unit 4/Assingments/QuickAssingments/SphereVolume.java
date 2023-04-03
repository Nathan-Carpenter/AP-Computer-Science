import java.util.*;

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("Please give the radius of the sphere ");
        double r = Double.parseDouble(k.nextLine());
        double pi = 3.141592653589793238;

    
        System.out.println(" ");
        System.out.println("The volume of that sphere is: " + (r*r*r) * pi * 4 / 3);
        System.out.println("");

        k.close();
    }
}
