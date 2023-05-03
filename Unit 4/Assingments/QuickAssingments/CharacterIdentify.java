import java.util.*;

public class CharacterIdentify {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        System.out.println("Please enter a single character");

        String c = k.nextLine();
        int ASCII = (int)c.charAt(0);
        String type = "";

        if(ASCII > 127){
            type = "extended ASCII character";
        }
        else if(ASCII > 122){
            type = "special character";
        }
        else if(ASCII > 96){
            type = "lowercase letter";
        }
        else if(ASCII > 91){
            type = "special character";
        }
        else if(ASCII > 64){
            type = "uppercase letter";
        }
        else if(ASCII > 57){
            type = "special character";
        }
        else if(ASCII > 47){
            type = "number";
        }
        else if(ASCII > 31){
            type = "special character";
        }
        else if(ASCII == 31){
            type = "space";
        }
        else if(ASCII < 32){
            type = "obscure character";
        }
        

        System.out.println(" ");
        System.out.println("Your character's type is a " + type);  
        System.out.println(" ");

        k.close();
    }
    
}
