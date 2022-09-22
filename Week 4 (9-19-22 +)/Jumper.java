import java.util.Scanner;

public class Jumper {
    public static void main(String[] args){
        int starter = 1;
        int upValue = 2;
        int crossValue = 2;
        String moveDir = "f";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("You are currently in the exact middle (2,2)");

        while(starter == 1){

            String p1l1 = "|__";
            String p1l2 = "|__";
            String p1l3 = "|__|";

            String p2l1 = "|__";
            String p2l2 = "|__";
            String p2l3 = "|__|";

            String p3l1 = "|__";
            String p3l2 = "|__";
            String p3l3 = "|__|";

     
            String picker = ("p"+crossValue+"l"+upValue);

            System.out.println(picker);

            if (upValue == 1){
                if(crossValue == 1){
                    p1l1 = "|X_";
                }
                else if(crossValue == 2){
                    p1l2 = "|X_";
                }
                else if (crossValue == 3){
                    p1l3 = "|X_|";
                }
                else{
                    System.out.println("crossValue error");
                }
            }
            
            else if (upValue == 2){
                if(crossValue == 1){
                    p2l1 = "|X_";
                }
                else if(crossValue == 2){
                    p2l2 = "|X_";
                }
                else if (crossValue == 3){
                    p2l3 = "|X_|";
                }
                else{
                    System.out.println("crossValue error");
                }
            }

            else if (upValue == 3){
                if(crossValue == 1){
                    p3l1 = "|X_";
                }
                else if(crossValue == 2){
                    p3l2 = "|X_";
                }
                else if (crossValue == 3){
                    p3l3 = "|X_|";
                }
                else{
                    System.out.println("crossValue error");
                }
            }
            else{
                System.out.println("upValue Error");
            }


            System.out.println("__________");
            System.out.println(p3l1 + p3l2 + p3l3);
            System.out.println(p2l1 + p2l2 + p2l3);
            System.out.println(p1l1 + p1l2 + p1l3);
        
            System.out.println("How would you like to move? (u,d,l,r)");
            moveDir = keyboard.nextLine();

            if (moveDir.equals("u")){
                if (upValue != 3){
                   upValue += 1; 
                }
                else{
                    System.out.println("You cannot move up further");
                }

            }

            if (moveDir.equals("d")){
                if (upValue != 1){
                    upValue -= 1; 
                 }
                else{
                    System.out.println("You cannot move down further");
                 }

            }

            if (moveDir.equals("l")){
                if (crossValue != 1){
                    crossValue -= 1; 
                 }
                else{
                    System.out.println("You cannot move left further");
                 }

            }
            
            if(moveDir.equals("r")){
                if (crossValue != 3){
                    crossValue += 1; 
                }                  
                else{
                    System.out.println("You cannot move right further");
                }

            }

        
            System.out.println("you move " + moveDir);
            System.out.println("Your current Coordinates are (" + crossValue + "," + upValue + ")");

            


        }
        
        

        keyboard.close();


    }
}