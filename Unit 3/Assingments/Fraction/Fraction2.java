package Fraction;
import java.util.*;

public class Fraction2 {
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");
        Scanner keyboard = new Scanner(System.in);
        int numerator1 = 0;
        int denominator1 = 0;
        int numerator2 = 0;
        int denominator2 = 0;

        System.out.println("enter the numerator of fraction one: ");
        numerator1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("enter the denominator of fraction one: ");
        denominator1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("enter the numerator of fraction two: ");
        numerator2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("enter the denominator of fraction two: ");
        denominator2 = Integer.parseInt(keyboard.nextLine());

        System.out.println(" ");
        System.out.println("Fraction one: " + numerator1 + "/" + denominator1);
        System.out.println("Fraction two: " + numerator2 + "/" + denominator2);

        Fraction one = new Fraction(numerator1, denominator1);
        Fraction two = new Fraction (numerator2,denominator2);

        System.out.println("The sum of your two fractions: ");
        one.add(two);

        System.out.println("The difference of your two fractions: ");
        one.subtract(two);

        System.out.println("The product of your two fractions: ");
        one.multiply(two);

        System.out.println("The quotient of your two fractions: ");
        one.divide(two);

        keyboard.close();
    }
    
}
