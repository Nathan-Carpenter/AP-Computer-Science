import java.util.Scanner;


public class hello_world {
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        String l = keyboard.nextLine();
     
        if (l == "1"){
            System.out.println("ouch");
        }
        keyboard.close();
    }
    
}
