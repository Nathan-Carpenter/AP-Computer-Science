import java.util.*;

// This program is meant to be called by File2.java

public class Function {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number");
        int var = Integer.parseInt(keyboard.nextLine());

        mathOne M1 = new mathOne(var);
        System.out.println(M1.toString());
        
    }
    
    private int variable;
    
    public Function(int x){
        variable = x;
    }

    public String toString(){
        return "x = " + variable + "; 3x + 5 = " + ((3 * variable) + 5);
    }
}