import java.util.Scanner;


public class MadLib {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);  
        System.out.println("This is a MadLib program. your madlib needs to include at least 16 inputs");
        System.out.println("These could me propernouns, adjectives, places, people, etc");



        // MISC FIRST

        System.out.println("Please enter a Noun:");
        String noun1 = keyboard.nextLine();

        System.out.println("Please enter a past tense movement verb:");
        String pastMoveVerb = keyboard.nextLine();

        System.out.println("Please enter a place:");
        String place1 = keyboard.nextLine();

        System.out.println("Please enter another place:");
        String place2 = keyboard.nextLine();

        System.out.println("Please enter an animal or creature:");
        String animal1 = keyboard.nextLine();

        // ADJECTIVES

        System.out.println("Please enter an Adjective:");
        String adjective1 = keyboard.nextLine();

        System.out.println("Please enter another Adjective:");
        String adjective2 = keyboard.nextLine();

        System.out.println("Please enter another Adjective:");
        String adjective3 = keyboard.nextLine();

        System.out.println("Please enter another Adjective:");
        String adjective4 = keyboard.nextLine();

        System.out.println("Please enter another Adjective:");
        String adjective5 = keyboard.nextLine();

        System.out.println("Please enter another Adjective:");
        String adjective6 = keyboard.nextLine();

        // VERBS

        System.out.println("Please enter a Verb:");
        String verb2 = keyboard.nextLine();

        System.out.println("Please enter another Verb:");
        String verb3 = keyboard.nextLine();

        System.out.println("Please enter another Verb:");
        String verb5 = keyboard.nextLine();

        // OBJECTS

        System.out.println("Please enter an object:");
        String object1 = keyboard.nextLine();

        System.out.println("Please enter another object:");
        String object2 = keyboard.nextLine();

        System.out.println("Please enter another object:");
        String object3 = keyboard.nextLine();

        // END MISC

        System.out.println("Please enter a number:");
        String num1 = keyboard.nextLine();

        System.out.println("Please enter a phrase:");
        String phrase1 = keyboard.nextLine();

        System.out.println("Please enter a unit of time (hours, minutes, etc):");
        String timeUnit1 = keyboard.nextLine();







        // STORY TIME
        System.out.println(" ");
        System.out.println("============================");
        System.out.println(" ");
        System.out.println("Time for the final story!");
        System.out.println(" ");
        System.out.println("============================");
        System.out.println(" ");

        System.out.println("There once was a " + noun1 + " that " + pastMoveVerb + " to " + place1 + ".");
        System.out.println("The " + noun1 + " then saw a deadly " + animal1 + " named Henry! The " + adjective1 + " Henry sought combat, so");
        System.out.println("the " + noun1 + "picked up a " + object1 + " that it found in " + place2 + " to fight Henry.");
        System.out.println(" " + verb2 + "ing forward, " + noun1 + "'s " + adjective2 +" "+ object2 + " was pointed at Henry, who drew it's " + object3 + " ");
        System.out.println("and " + verb3 + "ed at " + noun1 + ". Locked in combat for " + num1 + " "+ timeUnit1 + ", " + noun1 + " finally slew the ginger");
        System.out.println("beast named Henry using all of it's " + adjective6 + " and letting out " + phrase1 + " as a cry of victory.");
        System.out.println("Seeing Henry's " + adjective3 + " corpse, " + noun1 + " decided to " + verb5 + " Henry's corpse. Seeing that " + adjective4 + " sight, " + noun1 + " ");
        System.out.println("felt " + adjective5 + ".");


        // There once was a _noun1_ that _past tense movement verb_ to _place_. The _noun1_ then saw a deadly _animal or creature_ named Henry! The _adjective_ Henry sought combat,
        // so the _noun1_ picked up a _object_ it found in _place2_ to fight Henry. _verb2 ing_ forward, _noun1_'s _adjective_ _object_ was pointed at Henry, who drew it's _object2_ 
        // and _verb3 -ed_ at _object1_. Locked in combat for _time_, _noun1_ finally slew the ginger beast Henry using all of it's _verb_ and letting out _phrase_ as a cry of victory.
        // seeing Henry's _adjective_ corpse, _noun1_ decided to _verb_ Henry's corpse. Seeing that _adjective_ sight, _noun1_ felt _Adjective_

        keyboard.close();

    }
    
}
