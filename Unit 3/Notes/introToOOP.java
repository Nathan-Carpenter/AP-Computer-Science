import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
import java.util.*;


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
        return processor + ", " + memory + " GB Memory, " + storage + "GB Storage,";
    }

}

class pets{
    private int number;
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
        return "You have " + number + " " + type + ", " + size + " " + color + " in your home";
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


    }    
}