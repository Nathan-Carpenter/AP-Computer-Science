import java.util.*;

// This program is build to call the function from Function.java

public class File2{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number");
        int var = Integer.parseInt(keyboard.nextLine());

        MathFunctionOne math = new MathFunctionOne(var);
        System.out.println(math.toString());

        System.out.println("Please enter your first name ");
        String name1 = keyboard.nextLine();

        System.out.println("Please enter your last name ");
        String name2 = keyboard.nextLine();

        getInitials init = new getInitials(name1, name2);
        System.out.println(init);

        nameLength len = new nameLength(name1);
        System.out.println(len);

        keyboard.close();
        
    }
}