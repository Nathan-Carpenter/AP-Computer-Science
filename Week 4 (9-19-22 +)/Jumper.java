import java.util.Scanner;

public class Jumper {
    public static void main(String[] args){
        int starter = 1;
        int upValue = 3;
        int crossValue = 3;
        String moveDir = "f";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("You are currently in the exact middle (2,2)");
        

        while(starter == 1){

            // Defining Board

            String p1l1 = "|__";
            String p1l2 = "|__";
            String p1l3 = "|__";
            String p1l4 = "|__";
            String p1l5 = "|__";

            String p2l1 = "|__";
            String p2l2 = "|__";
            String p2l3 = "|__";
            String p2l4 = "|__";
            String p2l5 = "|__";

            String p3l1 = "|__";
            String p3l2 = "|__";
            String p3l3 = "|__";
            String p3l4 = "|__";
            String p3l5 = "|__";

            String p4l1 = "|__";
            String p4l2 = "|__";
            String p4l3 = "|__";
            String p4l4 = "|__";
            String p4l5 = "|__";

            String p5l1 = "|__";
            String p5l2 = "|__";
            String p5l3 = "|__";
            String p5l4 = "|__";
            String p5l5 = "|__";

     
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
                    p1l3 = "|X_"; 
                }
                else if (crossValue == 4){
                    p1l4 = "|X_"; 
                }
                else if (crossValue == 5){
                    p1l5 = "|X_"; 
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
                    p2l3 = "|X_";
                }
                else if (crossValue == 4){
                    p2l4 = "|X_"; 
                }
                else if (crossValue == 5){
                    p2l5 = "|X_"; 
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
                    p3l3 = "|X_";
                }
                else if (crossValue == 4){
                    p3l4 = "|X_"; 
                }
                else if (crossValue == 5){
                    p3l5 = "|X_"; 
                }
                else{
                    System.out.println("crossValue error");
                }
            }

            else if (upValue == 4){
                if(crossValue == 1){
                    p4l1 = "|X_";
                }
                else if(crossValue == 2){
                    p4l2 = "|X_";
                }
                else if (crossValue == 3){
                    p4l3 = "|X_";
                }
                else if (crossValue == 4){
                    p4l4 = "|X_"; 
                }
                else if (crossValue == 5){
                    p4l5 = "|X_"; 
                }
                else{
                    System.out.println("crossValue error");
                }
            }

            else if (upValue == 5){
                if(crossValue == 1){
                    p5l1 = "|X_";
                }
                else if(crossValue == 2){
                    p5l2 = "|X_";
                }
                else if (crossValue == 3){
                    p5l3 = "|X_";
                }
                else if (crossValue == 4){
                    p5l4 = "|X_"; 
                }
                else if (crossValue == 5){
                    p5l5 = "|X_"; 
                }
                else{
                    System.out.println("crossValue error");
                }
            }


            
            else{
                System.out.println("upValue Error");
            }


            System.out.println("________________");
            System.out.println(p5l1 + p5l2 + p5l3 + p5l4 + p5l5 +"|");
            System.out.println(p4l1 + p4l2 + p4l3 + p4l4 + p4l5 +"|");
            System.out.println(p3l1 + p3l2 + p3l3 + p3l4 + p3l5 +"|");
            System.out.println(p2l1 + p2l2 + p2l3 + p2l4 + p2l5 + "|");
            System.out.println(p1l1 + p1l2 + p1l3 + p1l4 + p1l5 + "|");
        
            System.out.println("How would you like to move? (w,a,s,d)");
            moveDir = keyboard.nextLine();

            if (moveDir.equals("w")){
                if (upValue != 5){
                   upValue += 1; 
                }
                else{
                    System.out.println("You cannot move up further");
                }

            }

            if (moveDir.equals("s")){
                if (upValue != 1){
                    upValue -= 1; 
                 }
                else{
                    System.out.println("You cannot move down further");
                 }

            }

            if (moveDir.equals("a")){
                if (crossValue != 1){
                    crossValue -= 1; 
                 }
                else{
                    System.out.println("You cannot move left further");
                 }

            }
            
            if(moveDir.equals("d")){
                if (crossValue != 5){
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