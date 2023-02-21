import java.util.*;


public class KnuckleBonesRun { // SEE Rules.txt for the KnuckleBones ruleset

    

    public static void main(String[] args){
        System.out.println("\033[H\033[2J");
        boolean mainLoopStatus = false;
        int rollNum = 0;
        int columnSelected = 0;
        Scanner keyboard = new Scanner(System.in);
        Boolean keepRoll = true;
        String input = "";

        int[] P1C1 = {0,0,0};
        int[] P1C2 = {0,0,0};
        int[] P1C3 = {0,0,0};

        textDelay(" == KnuckleBones == ", true);

        textDelay("Player 1's Grid: ", false);
        line();
        timeDelay(150);
        
        gridPrint(P1C1, P1C2, P1C3);

        while(true){
            mainLoopStatus = true;

            rollNum = diceRoll();
            presentRoll(rollNum);

            textDelay("Which column to put the roll of " + rollNum + "? (1,2,3) ", false);
            columnSelected = Integer.parseInt(keyboard.nextLine());
            line();

            
            while(columnCheckReturn(P1C1, P1C2, P1C3, columnSelected) == true){
                mainLoopStatus = false;

                
                textDelay("Which column to put the roll of " + rollNum + "? (1,2,3) ", false);
                int columnSelected2 = Integer.parseInt(keyboard.nextLine());
                columnSelected = columnSelected2;
                line();

               
                playerOneAllocate(columnSelected2, rollNum, P1C1, P1C2, P1C3);
                System.out.println("\033[H\033[2J");

                gridPrint(P1C1, P1C2, P1C3);                
            }
            
            if(mainLoopStatus == true){
                playerOneAllocate(columnSelected, rollNum, P1C1, P1C2, P1C3);
                System.out.println("\033[H\033[2J");

                gridPrint(P1C1, P1C2, P1C3);                 
            }

            
            
        }

    }

    public static int diceRoll(){ // USED TO: generate a random number between 1 and 6, like rolling a d6

        return (int) (Math.random()*(7 - 1)) + 1;  
    }

    public static void gridPrint(int[] one, int[] two, int[] three){ // USED TO: quickly print out the grid to the console
        System.out.println(one[0] + "|" + two[0] + "|" + three[0]);
        System.out.println(one[1] + "|" + two[1] + "|" + three[1]);
        System.out.println(one[2] + "|" + two[2] + "|" + three[2]);

    }

    public static void presentRoll(int num){ // USED TO: present the die roll to user
        textDelay("rolling", false);
        timeDelay(150);
        textDelay(".", false);
        timeDelay(150);
        textDelay(".", false);
        timeDelay(150);
        textDelay(".", true);
        timeDelay(150);

        textDelay("You rolled a ", false);
        textDelay(Integer.toString(num), true);

    }

    public static void playerOneAllocate(int input, int num, int[] P1C1, int[] P1C2, int[] P1C3){ // USED TO: slot the number given into player One's grid
        Scanner keyboard = new Scanner(System.in);


        while(input != 1 && input != 2 && input != 3){
            textDelay("enter 1, 2, or 3", true);
            input = Integer.parseInt(keyboard.nextLine());
        }

        if(input == 1 && checkColumnFull(P1C1) == false){
            if(P1C1[0] == 0){
                P1C1[0] = num;
            }
            else if(P1C1[1] == 0){
                P1C1[1] = num;

            }
            else if(P1C1[2] == 0){
                P1C1[2] = num;

            }
        }

        else if(input == 2 && checkColumnFull(P1C2) == false){
            if(P1C2[0] == 0){
                P1C2[0] = num;
            }
            else if(P1C2[1] == 0){
                P1C2[1] = num;

            }
            else if(P1C2[2] == 0){
                P1C2[2] = num;

            }
        }

        else if(input == 3 && checkColumnFull(P1C3) == false){
            if(P1C3[0] == 0){
                P1C3[0] = num;
            }
            else if(P1C3[1] == 0){
                P1C3[1] = num;

            }
            else if(P1C3[2] == 0){
                P1C3[2] = num;

            }
        }

        else{
            
        }
    }

    public static boolean checkColumnFull(int[] column){ // USED TO: check if a column is full
        if(column[0] == 0 || column[1] == 0 || column[2] == 0){
            return false;
        }
        else{
            return true;
        }
            
    }

    public static boolean columnCheckReturn(int[] one, int[] two, int[] three, int column){ // USED TO: check the column selected for being full
        boolean returnValue = false;
        if(column == 1){
            returnValue = checkColumnFull(one);
        }
        else if(column == 2){
            returnValue = checkColumnFull(two);

        }
        else if(column == 3){
            returnValue = checkColumnFull(three);

        }

        if(returnValue == true){
            textDelay("That column is full, please enter it into another", true);
        }

        return returnValue;

    }

    public static boolean checkGridFull(boolean one, boolean two, boolean three){ // USED TO: check if a grid is full
        if(one == true && two == true && three == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static int scoreColumn(int[] one, int[] two, int[] three){

    }

    public static void scoreColumnDuplicate(int[] array, int num){
     // STOPPING HERE FOR TODAY - need to create a new method that scans for how many times num is in array[]
     /*  if it's in there 1 time, return it's value
     if it's in there 2 times, return the sum of both num multiplied by 2
     if its in there 3 times, return the sum of all 3 num multiplied by 3
     */



    }

    public static void timeDelay(int time){ // USED TO: provide timing space for textDelay()
        try{
            Thread.sleep(time);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static void textDelay(String phrase, boolean line){ // USED TO: print out a string individually, with a timing space between
        int phraseLength = phrase.length();
        int position = 0;

        for(position = 0; position < phraseLength; position++){
            System.out.print(phrase.charAt(position));
            timeDelay(30);
        }


        if(line == true){
            line();
            line();
        }
    }

    public static void line(){ // USED TO: ease of coding, gives an empty line
        System.out.println(" ");
    }
}
