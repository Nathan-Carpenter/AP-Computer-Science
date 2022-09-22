import java.util.Scanner;

public class password{
    public static void main(String[] args){

        System.out.println("Please enter your name - ");
        Scanner keyboard1 = new Scanner(System.in);
        String name = keyboard1.nextLine();
        System.out.println("Hello " + name + "!" );
        String pass = "0";
        Scanner keyboard2 = new Scanner(System.in);

        while (!pass.equals("youre mother")){
            System.out.println("Please enter a password");
            keyboard2 = new Scanner(System.in);
            pass = keyboard2.nextLine();
            
            if (!pass.equals("youre mother")){
                System.out.println("INCORRECT");
                System.out.println("Please try again");
            }           
        }
        if (pass.equals("youre mother")){
            System.out.println("Correct");
            System.out.println("You entered the intended password");
        }
        keyboard1.close();
        keyboard2.close();
    }
}