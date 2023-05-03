import java.util.*;


public class MonteCarlo {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);
        System.out.println("Please enter a height/width for a square");
        double w = Double.parseDouble(k.nextLine());
        double r = w/2;

        System.out.println(" ");
        System.out.println("Square has a side length of " + w);
        System.out.println(" ");

        System.out.println("The center of the square is at " + r + "," + r);
        System.out.println(" ");

        System.out.println("There is a circle inside the square with a radius of " + r);
        System.out.println(" ");

        System.out.println("Please enter how many random points to generate");
        int i = Integer.parseInt(k.nextLine());

        double[][] coords = new double[i][2];
        double temp1;
        double temp2;

        int x = 0;
        

        while(x < i){
            temp1 = Math.random() * w;
            temp2 = Math.random() * w;

            temp1 = round(temp1, 1);
            temp2 = round(temp2, 1);

            coords[x][0] = temp1;
            coords[x][1] = temp2;
            x++;

        }

        System.out.println(" ");
        int count1 = 0;
        int count2 = 0;
        
        for(int a = 0; a < i; a++){
            if(Math.pow(r - coords[a][0], 2) + Math.pow(r - coords[a][1], 2) <= Math.pow(r, 2)){
                System.out.println("Coordinate " + (a + 1) + ", ( " + coords[a][0] + " , " + coords[a][1] + " ), IS in the circle");
                count1++;
            }
            else{
                System.out.println("Coordinate " + (a + 1) + ", ( " + coords[a][0] + " , " + coords[a][1] + " ), IS NOT in the circle");
                count2++;
            }
            
        }
        System.out.println(" ");
        System.out.println("There are " + count2 + " points outside the circle");
        System.out.println("There are " + count1 + " points in the circle");
        System.out.println(" ");
        System.out.println("The ratio between points outside the circle and points inside the circle is " + count2 + ":" + count1);
        System.out.println(" ");
        k.close();



    }
    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
