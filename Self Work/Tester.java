//import java.util.*;



public class Tester {
    public static void main(String[] args){
<<<<<<< HEAD
        String oldSeq = "00000111";
        String segment = "11";

        String newSeq = oldSeq.replaceFirst(segment, "");
        System.out.println(newSeq);

        System.out.print(Math.pow(5.0, 2));
=======
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
        

>>>>>>> a3b0baa3c984c5a8457adc5d3e5c11cb56c1529a


    }
}
