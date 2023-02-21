//import java.util.*;



public class Tester {
    public static void main(String[] args){
        String str = "CCCCCCCCAATTT!";
        int currentLen = 0;
        int maxLen = 0;
        char preChar = ' ';
        char streakChar = ' ';
        int x = 0;

        for(x = 0; x < str.length(); x++){
            if(str.charAt(x) == preChar){
                currentLen ++;
            }
            else{
                currentLen = 1;
                preChar = str.charAt(x);
            }

            if(currentLen > maxLen){
                maxLen = currentLen;
                streakChar = str.charAt(x);
            }
        }

        System.out.println(streakChar + " " + maxLen);
        



    }
}
