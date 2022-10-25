
import java.util.Scanner;


public class UdemyComparison_26 {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);

        double num1; // 1st number
        double num2; // 2nd number

        System.out.println("Enter the first number: ");
        num1 = input.nextDouble(); // get 1st num

        System.out.println("Enter the second number");
        num2 = input.nextDouble(); // get 2nd num

        System.out.println("Is number 1 equal to number 2: " + (num1 == num2));

        System.out.println("Is number 1 greater than or equal to number 2: " + (num1 >= num2));

        System.out.println("Is number 1 less than number 2: " + (num1 < num2));

        input.close();

    }
}

// Assorted Notes:

// x += 7 is the same as x = x + 7, can be done for +, -, *, /, %(remainder)
// && means AND, || means OR
// ! means NOT, will give the opposite (if a value will be true, it will give false)