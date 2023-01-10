
import java.lang.Math.*;

public class KnuckleBonesFunc {
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");

        for(int x = 0; x < 20; x++){
            int roll = diceRoll(1,7);
            System.out.println(roll);
        }

    }

    
    public static int diceRoll(int minimum, int maximum){ 
        return ((int) (Math.random()*(maximum - minimum))) + minimum; 
    }
    


}
