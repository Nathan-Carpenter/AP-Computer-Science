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


        // create a factorial function of a user input ex. input = 5 output = 5!
        System.out.println(" ");
        System.out.println("Please input a number");
        int userNum = keyboard.nextInt();
        int answer = 1;

        while (userNum > 0){
            answer = answer*userNum;
            userNum -= 1;
            
            
        }
        System.out.println("The factorial of your number is: " + answer);


        // DO WHILE LOOP 

        //do
        //{
            //statements, tell the computer what to do;
        //}while(test expression);
        int b = 0;
        do
        {
            b ++;
            System.out.print(b + " ");

        }while(b <= 9);

        do{
            b --;
            System.out.print(b + "");
        }while(b >= 2);


    }
}
