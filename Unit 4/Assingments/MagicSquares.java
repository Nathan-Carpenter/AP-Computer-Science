public class MagicSquares {
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");

        System.out.println("3 x 3 Magic Square to test:");
        int[][] SquareTest = {{7,0,5},{2,4,6},{3,8,1}};
        SquareChecker(SquareTest);
     
        System.out.println("4 x 4 Magic Square to test:");
        int[][] SquareTest2 = {{8,11,14,1},{13,2,7,13},{3,16,9,6},{10,5,4,15}};
        SquareChecker(SquareTest2);
        
    }

    public static boolean SquareChecker(int[][] Square){
        System.out.println(" ");
        System.out.println("==========");
        System.out.println(" ");
        int finder = Square[0][0] + Square[0][1] + Square[0][2];
        boolean MagicTrue = true;
        int sum = 0;
   
        for(int y = 0; y < Square[0].length; y++){
            sum = 0;
            for(int x = 0; x < Square[0].length; x++){
                sum += Square[y][x];

                if (String.valueOf(Square[y][x]).length() == 1){
                    System.out.print(Square[y][x] + "  ");
                }
                else{
                    System.out.print(Square[y][x] + " ");
                }

            }
            System.out.println(" = " + sum);

            if (sum == finder && MagicTrue == true){
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }
        }

        for(int i = 0; i < Square[0].length; i++){
            System.out.print("|  ");
        }
        System.out.println("");

        for(int x = 0; x < Square[0].length; x++){
            sum = 0;
            for(int y = 0; y < Square[0].length; y++){
                sum += Square[y][x];
            }
            System.out.print(sum + " ");

            if (sum == finder && MagicTrue == true){
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }
 
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Magic Square: " + MagicTrue);
        System.out.println(" ");
        System.out.println("==========");
        System.out.println(" ");

        return MagicTrue;

    }
}
