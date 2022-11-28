//import java.util.Scanner;
//import java.util.*;


class Computer{
    //Private means that it can only be called in the computer class
    private String processor;
    private int memory;
    private int storage;

    public Computer(String proc, int mem, int stor){
        processor = proc;
        memory = mem;
        storage = stor;

    }

    public String toString(){
        return processor + ", " + memory + " GB Memory, " + storage + "GB Storage";
    }

}

class pets{
    int number;
    private String type;
    private String size;
    private String color;

    public pets(int num, String typ, String siz, String col){
        number = num;
        type = typ;
        size = siz;
        color = col;

    }

    public String toString(){
        return "You have " + number + " " + size + ", " + color + " " + type + " in your home";
    }

}

class schedule{
    private String period1;
    private String period2;
    String period3;
    private String period4;

    public schedule(String p1, String p2, String p3, String p4){
        period1 = p1;
        period2 = p2;
        period3 = p3;
        period4 = p4;
    }

    public String toString(){
        return "Your schedule is " + period1 + ", " + period2 + ", " + period3 + ", " + period4;
    }
}

public class introToOOP{
     public static void main(String[] args){
        System.out.println("\033[H\033[2J");
        System.out.println("This will give you an intro to Object Oriented Programing");
        Computer comp1 = new Computer("Intel I9", 32, 1000);
        System.out.println(comp1.toString());

        pets margaret = new pets(10, "Huskies", "big", "grey");
        System.out.println(margaret.toString());
        System.out.println("Margaret has " + margaret.number + " pets");

        schedule classes = new schedule("Algebra", "U.S. History", "Comp Sci", "Chemistry");
        System.out.println(classes);
        System.out.println("Your 3rd period class is " + classes.period3);

    }    
}