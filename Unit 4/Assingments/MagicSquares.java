import java.util.*;
public class MagicSquares {

    // Code to check and generate magic squares
    public static void main(String[] args){
        System.out.println("\033[H\033[2J"); // This command clears the console of all text
        Scanner k = new Scanner(System.in); // creating the scanner to take in user input

        System.out.println("3 x 3 Magic Square to test:");
        int[][] SquareTest = {{7,0,5},{2,4,6},{3,8,1}}; // Creating a 3x3 square to test 
        // Calling the SquareChecker method, which checks and prints out if an inputted 2D array (int[][]) is a magic square
        SquareChecker(SquareTest); 
     
        System.out.println("4 x 4 Magic Square to test:");
        int[][] SquareTest2 = {{8,11,14,1},{13,2,7,13},{3,16,9,6},{10,5,4,15}}; // creating a 4x4 magic square to test
        SquareChecker(SquareTest2); // the SquareChecker method adapts to 2D arrays of any size (very large arrays may cause errors in code or print formatting)

        System.out.println("Please enter the size of the square: ");
        int SquareSize = Integer.parseInt(k.nextLine()); // Asking user for an array size for random generation
        

        System.out.println("Now randomly generating digits that make a magic square");
        System.out.println(" . . .  (This may take a while)");
        SquareRandom(SquareSize); // Square random creates a random magic square of an int size that's inputted (SquareSize in this case)

        k.close();
    }

// SquareChecker checks an int[][] array and determines if it is a magic square, with text output to the console to indicate that
    public static boolean SquareChecker(int[][] Square){
        System.out.println(" ");
        System.out.println("=========="); // This is just to organize the console and make it look better
        System.out.println(" ");

        // finder is a variable that finds the sum of the first row of the array, and saves it
        // It's used to check agaisnt when determining if a square is a magic square
        // a square is a magic square if all of the sums are equal to finder

        int finder = 0; 
        for(int i = 0; i < Square[0].length; i++){
            finder += Square[0][i];
        }

        // MagicTrue is used to keep track of wether or not a square is a magic square
        // It stays true as long as it still is a magic square, but once it's false it stays false for the rest of the square

        boolean MagicTrue = true;

        int sum = 0;

        int diagonalOne = 0; // These are variables that the diagonals will be added to and then the sum will be checked against finder
        int diagonalTwo = 0;
   
        for(int y = 0; y < Square[0].length; y++){ // Nested for loop that iterates through every row in the given square 
            sum = 0;
            for(int x = 0; x < Square[0].length; x++){
                sum += Square[y][x]; // adds up the values at every position within a row

                if (String.valueOf(Square[y][x]).length() == 1){ // this IF statement is just for formatting, it checks if a number is 1 digit or 2 digits long
                    System.out.print(Square[y][x] + "  ");      // It simply adds 1 or two spaces to the end depending on that to make the output look evenly spaced
                }
                else{
                    System.out.print(Square[y][x] + " ");
                }

            }
            System.out.println("= " + sum); // prints out the sum of each row

            if (sum == finder && MagicTrue == true){ // checks if the sum is equal to the expected value of a magic circle by checking agaisnt finder
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }
            diagonalTwo += Square[y][Square[0].length - y - 1]; // this goes down the right to left diagonal and gets the sum of it, storing as diagonalTwo
        }

        for(int i = 0; i < Square[0].length; i++){ // formatting to display the column sums
            System.out.print("|  ");
        }
        System.out.println("");

        for(int x = 0; x < Square[0].length; x++){ // Nested for loop that iterates through every column in the given square
            sum = 0;
            for(int y = 0; y < Square[0].length; y++){
                sum += Square[y][x];
            }
            System.out.print(sum + "  ");

            if (sum == finder && MagicTrue == true){
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }

            diagonalOne += Square[x][x];
        }

        if(diagonalOne == finder && MagicTrue == true){
            MagicTrue = true;
        }
        else{
            MagicTrue = false;
        }
        if(diagonalTwo == finder && MagicTrue == true){
            MagicTrue = true;
        }
        else{
            MagicTrue = false;
        }

        System.out.println(" "); // console text outputting
        System.out.println(" ");
        System.out.println("Diagonal left to right: " + diagonalOne);
        System.out.println("Diagonal right to left: " + diagonalTwo);
        System.out.println(" ");
        System.out.println("Magic Square: " + MagicTrue);
        System.out.println(" ");
        System.out.println("==========");
        System.out.println(" ");

        return MagicTrue;

    }

// SquareRandom generates many random squares of a given int size, not stopping until the generated square is a magic square
// it then calls SquareChecker to use it's console text output
    public static void SquareRandom(int Size){
        int[][] Square = new int[Size][Size];
        
        boolean MagicTrue = true;
        boolean MagicFinal = false;

        while(MagicFinal == false){
            
            for(int y = 0; y < Size; y ++){
                for(int x = 0; x < Size; x++){
                    
                    Square[y][x] = (int)(Math.random() * 10);
                }
            }

            int finder = 0;
            for(int i = 0; i < Square[0].length; i++){
                finder += Square[0][i];
            }
            MagicTrue = true;
            int sum = 0;
            int diagonalTwo = 0;
            int diagonalOne = 0;
    
            for(int y = 0; y < Square[0].length; y++){
                sum = 0;
                for(int x = 0; x < Square[0].length; x++){
                    sum += Square[y][x];
                }
                if (sum == finder && MagicTrue == true){
                    MagicTrue = true;
                }
                else{
                    MagicTrue = false;
                }
                diagonalTwo += Square[y][Square[0].length - y - 1];
            }
            for(int x = 0; x < Square[0].length; x++){
                sum = 0;
                for(int y = 0; y < Square[0].length; y++){
                    sum += Square[y][x];
                }
                if (sum == finder && MagicTrue == true){
                    MagicTrue = true;
                }
                else{
                    MagicTrue = false;
                }
                diagonalOne += Square[x][x];
            }
            if(diagonalOne == finder && MagicTrue == true){
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }
            if(diagonalTwo == finder && MagicTrue == true){
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }
            
            MagicFinal = MagicTrue;
        }
        SquareChecker(Square); // Calling SquareChecker with the completed magic square
    }
}
