import java.util.*;



public class Tester {
    public static void main(String[] args){
        String word = "henry";

        ArrayList<Character> shuffled = new ArrayList<Character>();
        for(int x = 0; x < word.length(); x++){
            shuffled.add(word.charAt(x));
        }

        Iterator itr = shuffled.iterator();
  
        Collections.shuffle(shuffled);
  
        System.out.println("After shuffling Arraylist:");
  
        itr = shuffled.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }


    }
}
