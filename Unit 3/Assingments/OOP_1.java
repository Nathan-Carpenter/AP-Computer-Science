import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class mathOne{
    private int variable;

    public mathOne(int x){
        variable = x;
    }

    public String toString(){
        
        return "x = " + variable + "; 3x + 5 = " + ((3 * variable) + 5);
    }

}

class mathTwo{
    private int variable;

    public mathTwo(int x){
        variable = x;
    }

    public String toString(){
        return "x = " + variable + "; 4x - 8 = " + ((4 * variable) - 8);
    }
}

class removeLastCharacter{
    private String word;
    private int A;
    //private char B;

    public removeLastCharacter(String w){
        word = w;
        if( w.length() > 0){
            A = w.length()-1;
        }
        //B = ' ';
    }

    public String toString(){
        return word.substring(0, A);
    }
}

class isLengthEven{
    private String word;

    public isLengthEven(String w){
        word = w;
    }

    public String toString(){
        if (word.length() % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
        
    }
}

class shuffleCharacters{
    private String word;
    //private int numShuffles;

    public shuffleCharacters(String w){
        word = w;
        //numShuffles = num;
    }
    
    public String toString(){
        ArrayList<Character> shuffled = new ArrayList<Character>();
        for(int x = 0; x < word.length(); x++){
            shuffled.add(word.charAt(x));
        }

        Iterator itr = shuffled.iterator();
  
        Collections.shuffle(shuffled);
  
        itr = shuffled.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        return " ";
    }


}

class repeatWord{
    private String word;
    private int timesRepeated;


    public repeatWord(String w, int rep){
        word = w;
        timesRepeated = rep;
    }

    public String toString(){
        return word.repeat(timesRepeated);
    }

}

public class OOP_1 {  
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        String wordUsed = keyboard.nextLine();

        System.out.println(" ");
        
        System.out.println("Please enter a number");
        int var = keyboard.nextInt();
        
        System.out.println(" ");

        // OBJECT #1
        mathOne M1 = new mathOne(var);
        System.out.println(M1.toString());
        
        //OBJECT #2
        mathTwo M2 = new mathTwo(var);
        System.out.println(M2.toString());

        System.out.println(" ");

        // OBJECT #3
        removeLastCharacter rem = new removeLastCharacter(wordUsed);
        System.out.println("Your word without the last character is: " + rem.toString());

        // OBJECT #4
        isLengthEven lenEven = new isLengthEven(wordUsed);
        System.out.println(" ");
        System.out.println("Your word's length is " + lenEven);

        // OBJECT #5
        shuffleCharacters shuf = new shuffleCharacters(wordUsed);
        System.out.println(" ");
        System.out.println("Your word with shuffled characters is: ");
        System.out.println(shuf);

        // OBJECT #6
        repeatWord rep = new repeatWord(wordUsed, var);
        System.out.println(" ");
        System.out.println("Your word repeated " + var + " times is:");
        System.out.println(rep);

        System.out.println(" ");


        keyboard.close();
    }
}
