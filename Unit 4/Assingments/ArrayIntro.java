import javax.swing.colorchooser.ColorSelectionModel;

import java.util.*;

public class ArrayIntro {
    public static void main(String[] args){
        // Making array
        String[] colors = {"Red", "Green", "Blue"};
        colors[1] = "Yellow";
        System.out.println(colors);

        for(int i = 0; i < 3; i++){
            System.out.print(colors[i] + " ");
        }
        System.out.println("");

        // Making arrayList
        ArrayList<String> colors2 = new ArrayList<String>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Blue");
        colors2.set(1, "Yellow");
        colors2.remove("Red");

        System.out.println(colors2);
    }
}
