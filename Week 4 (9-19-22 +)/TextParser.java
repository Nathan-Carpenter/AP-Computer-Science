import java.util.Scanner;

public class TextParser {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a long word or phrase");
        String phrase = keyboard.nextLine();
        System.out.println(phrase);

        System.out.println("Your word/plrase has: " + phrase.length() + " characters");
        // .length() will show how many chatacters are in your word or phrase

        //.charAt(index) will return the character at the desired index
        // the characters in a string start a position 0

        System.out.println("The third character of your word/phrase is: " + phrase.charAt(2));

        // .toUpperCase() will change your phrase to all upper case
        System.out.println("All Caps: " + phrase.toUpperCase());

        // .toLowerCase() will change your phrase to all lower case
        System.out.println("All Lower: " + phrase.toLowerCase());


        // boolean: a variable that will return 1 of 2 things, true or false
        boolean hasThe = phrase.contains("the");
        System.out.println(" Does your phrase contain the word 'the'? " + hasThe);

        // .substring(first,last) will return a new string that is piece of th eoriginal string starting at the first index and ending at the second index
        System.out.println("Your phrase includes the following letteres: " + phrase.substring(1,7));

        //int length = phrase.length();
        //int halfway = length / 2;
        //int third = length * 1/3;
        //int secondThird = length * 2/3;

        // .indexOf() returns the first index of desired character
        System.out.println("The first 'a' is at index: " + phrase.indexOf("a") );



        keyboard.close();

    }
}
