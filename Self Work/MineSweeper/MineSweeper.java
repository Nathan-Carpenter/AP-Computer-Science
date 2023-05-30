package MineSweeper;
import java.util.*;

public class MineSweeper {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);

        int[][] grid = Initalizer();

       

        for(int[] x : grid){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
        


        System.out.println(" ");
        System.out.println("input coordinates");
        String e = k.nextLine();
        if(e.length() != 2){
            System.out.println("Please enter coordinates as 'xy'");
            e = k.nextLine();
        }
        int xSelection = (int)e.charAt(0);
        int ySelection = (int)e.charAt(1);

        if(grid[ySelection][xSelection] == 1){
            
        }



    }

    public static int[][] Initalizer(){
        int[][] grid = new int[10][10];
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                int percent = (int)(Math.random() * 4);
                if (percent > 0){
                    grid[x][y] = 0;
                }
                else{
                    grid[x][y] = 1;
                }
            }
        }
        return grid;
    }

}
