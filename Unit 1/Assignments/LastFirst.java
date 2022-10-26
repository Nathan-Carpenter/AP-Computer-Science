import java.util.Scanner;

public class LastFirst {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First Name: ");

        String firstname = keyboard.nextLine();

        System.out.print("Last Name: ");

        String lastname = keyboard.nextLine();

        System.out.print(lastname + ", " + firstname);

        keyboard.close();
    }




}