import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // In a loop there are 4 elements
        // 1 initialization expression
        // 2 test expression
        // 3 update expression
        // 4 body

        // Notes
        // ++ incremement 1 up
        // -- increment 1 down


        // FOR LOOP
        // for(initialization expression ; test expression ; update expression ;){
            // Body of loop, tells computer what to do with the variable if the test expression is not met
        // }

        // The goal for today is for the computer to type: 1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1

        int x = 0;
        for(x = 1; x <= 10; x ++){
            System.out.print(x + " ");
        }

        for(x = 9; x >= 1; x --){
            System.out.print(x + " ");
        }


        // WHILE LOOP
        // while(test expression){
            // loop body, tells the computer what to do if the test expression is met
        //}

    }
}
