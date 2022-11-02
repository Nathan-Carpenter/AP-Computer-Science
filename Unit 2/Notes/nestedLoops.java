import java.util.*;

public class nestedLoops {
    public static void main(String[] args){

        int x = 0;
        int y = 0;
        for(y=0; y<5; y++){
            for(x=5; x>y; x--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
