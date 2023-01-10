public class twelveDaysOfChristmas {
    public static void main(String[] args){


        String [] dayOfChristmas = new String[13];

        dayOfChristmas[1] = "A Partridge in a Pear Tree";
        
        dayOfChristmas[2] = "Two Turtle Doves";
        
        dayOfChristmas[3] = "Three French Hens";
        
        dayOfChristmas[4] = "Four Calling Birds";
        
        dayOfChristmas[5] = "Five Gold Rings";
        
        dayOfChristmas[6] = "Six Geese A-laying";
        
        dayOfChristmas[7] = "Seven Swans A-swimming";
        
        dayOfChristmas[8] = "Eight Maids A-milking";
        
        dayOfChristmas[9] = "Nine Ladies Dancing";
        
        dayOfChristmas[10] = "Ten Lords A-leaping";
        
        dayOfChristmas[11] = "Eleven Pipers Piping";
        
        dayOfChristmas[12] = "Twelve Drummers Drumming"; 

        
        for(int x = 1; x <= 12; x++){
            System.out.println("On the " + x + " day of Christmas my true love gave to me...");
            for(int y = 1; y <= x; y++){
                System.out.println(" ");
                System.out.println(dayOfChristmas[y]);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
        }
 

    }
}
