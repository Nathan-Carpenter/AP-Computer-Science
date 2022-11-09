import java.util.Scanner;

public class shapeMaker{
    public static void main(String[] args){

        System.out.println("\033[H\033[2J");
        
        Scanner keyboard = new Scanner(System.in);
        int x = 0;
        int y = 0;


        // Ask for what shape they want, variable will be called later to tell which shape to initalize
        System.out.println("Would you like to create a square, rectangle, right triangle, or isosceles triangle? ");
        System.out.println("You can also say 'exit' to close the program");
        String input = keyboard.nextLine();

        // while loop to make sure input is one of the acceptable values
        while(!input.equals("square") && !input.equals("rectangle") && !input.equals("right triangle") && !input.equals("isosceles triangle") && !input.equals("exit")){
            System.out.println("Please enter either square, rectangle, right triangle or isosceles triangle (or exit)");
            input = keyboard.nextLine();
        }

        // initalize square creation
        if(input.equals("square")){

            // ask for width (and therefore height) of the square and saving the value as integer variable W
            System.out.println("How wide do you want the Square to be?");
            int W = keyboard.nextInt();
            
            // nested for loop
            // prints each asterisk individually
            for(x = 0; x < W; x++){
                // each time the first for loop occurs, the second will do a full line
                for(y = 0; y < W; y++){

                    // This for loop occurs as many times as the W variable's value, printing an *
                    System.out.print("*  ");
                }

                // this loop occurs as many times as the W variable's value, starting a new line
                System.out.println(" ");
            }
            
        }

        // initalize rectangle creation
        else if(input.equals("rectangle")){
            System.out.println("How tall do you want the rectangle to be?");
            int H = keyboard.nextInt();
            System.out.println("How wide do you want the rectangle to be?");
            int W = keyboard.nextInt();

            // nested for loop
            // prints each asterisk individually
            for(x = 0; x < H; x++){
                // each time the first for loop occurs, the second will do a full line
                for(y = 0; y < W; y++){

                    // This for loop occurs as many times as the W variable's value, printing an *
                    System.out.print("*  ");
                }

                // this loop occurs as many times as the H variable's value, starting a new line
                System.out.println(" ");
            }
            
        }

        // initalize right triangle creation
        else if(input.equals("right triangle")){
            System.out.println("How long/tall do you want the triangle to be?");
            int W = keyboard.nextInt();
            int go = 1;

            // nested for loop
            // prints each asterisk individually
            for(x = 0; x < W; x++){
                // each time the first for loop occurs, the second will do a full line
                for(y = 0; y < go; y++){

                    // This for loop occurs as many times as the go variable's value, printing an *
                    // the go variable increases by 1 every line, making the amount of * printed increasing by 1 each line
                    System.out.print("*  ");
                }

                // this loop occurs as many times as the W variable's value, starting a new line
                // go++ causes the slope of the triangle, increasing in value by 1 each new line
                // causes the length of each asterisk chain in a line to be 1 more
                go++;
                System.out.println("");
            }
            
        }

        // initalize isosceles triangle creation
        else if(input.equals("isosceles triangle")){
            System.out.println("How tall do you want the triangle to be?");
            int H = keyboard.nextInt();
            int go = 1;
            int stop = H / 2;

            // nested for loop
            // prints each asterisk individually
            for(x = 0; x < H; x++){
                // each time the first for loop occurs, the second will do a full line
                for(y = 0; y < go; y++){

                    // This for loop occurs as many times as the go variable's value, printing an *
                    // the go variable will be changing each line, causing the ideal slope for this triangle
                    System.out.print("*  ");
                }

                // if statements checking if the current line is halfway through
                // if it is, the slant of the lines will start going back down
                if(x < stop - 1){
                    go++;
                }
                else if(x >= stop ){
                    go--;
                }


                System.out.println(" ");
            }
        }

        else if(input.equals("exit")){
            System.exit(0);
        }

        // only here in case some error in initalizing shapes occurs
        else{
            System.out.println("shapePickError");
        }

        keyboard.close();




    }
}