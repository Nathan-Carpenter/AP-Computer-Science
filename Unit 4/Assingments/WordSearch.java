public class WordSearch {
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");
        char[][] grid = new char [10] [10];

        String HorWord = "grades";
        int HorWordStartX = 4;
        int HorWordStartY = 6;
        String VerWord = "henry";
        int VerWordStartX = 2;
        int VerWordStartY = 0;
        String wordFinder = "";

        // Creating Word Search Grid
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                grid[y][x] = random();
            }
        }

        // Setting the Horizontal word in place 
        for(int i = 0; i < HorWord.length(); i++){
            grid[HorWordStartY][i + HorWordStartX] = HorWord.charAt(i);
        }

        // Setting the Vertical word in place
        for(int i = 0; i < VerWord.length(); i++){
            grid[i + VerWordStartY][VerWordStartX] = VerWord.charAt(i);
        }

        // Printing out the final grid
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                System.out.print(grid[x][y] + " ");
            }
            System.out.println((" "));
        }

        System.out.println(" ");

        // traverses with columns in the inner loop
        for(int y = 0; y < 10; y ++){
            wordFinder = "";
            for(int x = 0; x < 10; x++){
                wordFinder += Character.toString(grid[y][x]);
            }

            String newWord = new String(wordFinder);

            if(newWord.contains(HorWord)){
                System.out.println(HorWord + " starts at position (" + (newWord.indexOf(HorWord) + 1) + "," + y + ") and ends at position (" + (newWord.indexOf(HorWord) + HorWord.length()) + "," + y + ")");
            }
        }

        // traverses with rows in the inner loop

        for(int x = 0; x < 10; x ++){
            wordFinder = "";
            for(int y = 0; y < 10; y++){
                wordFinder += Character.toString(grid[y][x]);
            }

            String newWord = new String(wordFinder);

            if(newWord.contains(VerWord)){
                System.out.println(VerWord + " starts at position (" + x + "," + (newWord.indexOf(VerWord) + 1) + ") and ends at position (" + x + "," + (newWord.indexOf(VerWord) + VerWord.length()) + ")");
            }
        }

        System.out.println(" ");
    }
    public static char random(){
        // Creating a random letter 
        double num = Math.random()*25;
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};

        return alphabet[(int)num];

    }
}
