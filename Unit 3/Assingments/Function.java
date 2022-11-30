import java.util.*;

// This program is meant to be called by File2.java

public class Function {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number ");
        int var = Integer.parseInt(keyboard.nextLine());

        MathFunctionOne M1 = new MathFunctionOne(var);
        System.out.println(M1.toString());

        System.out.println("Please enter your first name ");
        String name1 = keyboard.nextLine();

        System.out.println("Please enter your last name ");
        String name2 = keyboard.nextLine();

        getInitials init = new getInitials(name1, name2);
        System.out.println(init);

        nameLength len = new nameLength(name1);
        System.out.println(len);
        
    }
}

class MathFunctionOne{
    private int variable;
    
    public MathFunctionOne(int x){
        variable = x;
    }

    public String toString(){
        return "x = " + variable + "; 3x + 5 = " + ((3 * variable) + 5);
    }
}

class getInitials{
    private String N1;
    private String N2;

    public getInitials(String firstName, String lastName){
        N1 = firstName;
        N2 = lastName;
    }

    public String toString(){
        return "Your initials are: " + Character.toUpperCase(N1.charAt(0)) + Character.toUpperCase(N2.charAt(0));
    }
}

class nameLength{
    private  String N;

    public nameLength(String name){
        N = name;
    }

    public String toString(){
        return "The length of your first name is: " + N.length();
    }
}