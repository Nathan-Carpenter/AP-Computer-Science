package ArrayListProject;
import java.util.*;

public class ArrayListProject {
    public static void main(String[] args){
        System.out.println("\033[H\033[2J");

        Scanner k = new Scanner(System.in);
        
        textDelay("This is a store where you can buy and sell items", true);
        TimeDelay(200);
        textDelay("When asked to purchase, enter 'none' to end the program", true);
        TimeDelay(200);
        System.out.println(" ");

        int wallet = 20;
        int finalWallet = 0;

        ArrayList<Items> list = new ArrayList<Items>();
        ArrayList<Items> store = new ArrayList<Items>();
        store.add(new Items(3, "milk"));
        store.add(new Items(4, "Cookies"));
        store.add(new Items(2, "apples"));
        store.add(new Items(5, "Cucumber growth pill"));
        store.add(new Items(3, "Bread balls"));
        store.add(new Items(10, "Atomic bomb"));
        store.add(new Items(20, "Frying pan"));
        store.add(new Items(8, "crate of peaches"));
        store.add(new Items(20, "A lock of ginger hair"));

        

        while(wallet > 0){
            StorePrint(store);
            TimeDelay(200);
            ListPrint(list, wallet);
            TimeDelay(200);
            textDelay("Would you like to buy or sell?", true);
            String bs = k.nextLine();
            if(bs.equalsIgnoreCase("buy")){
                System.out.println(" ");
                textDelay("What item do you want to purchase?", true);
                System.out.println(" ");
                String selection = k.nextLine();
                System.out.println(" ");
    
                int find = 0;
                for(int i = 0; i < store.size(); i++){
                    if(store.size() == 0){
                        break;
                    }
                    if(selection.equalsIgnoreCase("none")){
                        finalWallet = wallet;
                        wallet = 0;
                        System.out.println("\033[H\033[2J");
                        break;
                    }
                    else if(selection.equalsIgnoreCase(store.get(i).Name()) || selection.equalsIgnoreCase(Integer.toString(i+1))){
                        find = 1;
                        if(wallet >= store.get(i).Price()){
                            list.add(store.get(i));
                            wallet -= store.get(i).Price();
                            System.out.println("\033[H\033[2J");
                            textDelay("You purchased " + store.get(i).Name() + " for $" + store.get(i).Price(), true);
                            store.remove(i);
                            break;
                        }
                        else{
                            System.out.println("\033[H\033[2J");
                            textDelay("You don't have enough money to buy this", true);
                            break;
                        }
    
                    }
                    else{
                        System.out.println("\033[H\033[2J");
                    }
                }
                if(find == 0){
                    textDelay("That item isn't in the store", true);
                }
            }
            else if(bs.equalsIgnoreCase("sell")){
                System.out.println(" ");
                textDelay("What item do you want to sell?", true);
                System.out.println(" ");
                String selection = k.nextLine();
                System.out.println(" ");
                int find = 0;
                
                for(int i = 0; i < list.size(); i++){
                    if(list.size() == 0){
                        break;
                    }
                    if(selection.equalsIgnoreCase("none")){
                        finalWallet = wallet;
                        wallet = 0;
                        System.out.println("\033[H\033[2J");
                        break;
                    }
                    else if(selection.equalsIgnoreCase(list.get(i).Name()) || selection.equalsIgnoreCase(Integer.toString(i+1))){
                        find = 1;
                        store.add(list.get(i));
                        wallet += list.get(i).Price();
                        System.out.println("\033[H\033[2J");
                        textDelay("You sold " + list.get(i).Name() + " for $" + list.get(i).Price(), true);
                        list.remove(i);
                        break;
                    }
                }
                if(find == 0){
                    System.out.println("\033[H\033[2J");
                    textDelay("You don't have that item", true);
                }
            }
            else if(bs.equalsIgnoreCase("none")){
                finalWallet = wallet;
                wallet = 0;
                System.out.println("\033[H\033[2J");
                break;
            }
            else{
                System.out.println("\033[H\033[2J");
                textDelay("Please enter either 'buy' or 'sell'", true);
            }
            
        }
  
        ListPrint(list, finalWallet);
        k.close();
    }
    public static void ListPrint(ArrayList<Items> list, int wallet){
        textDelay("The items you have are:", true);
        TimeDelay(30);
        System.out.println("===================");
        TimeDelay(30);
        for(int i = 0; i < list.size(); i++){
            System.out.println((i+1) + ". " + list.get(i).Name() + " - $" + list.get(i).Price());
            TimeDelay(30);
        }
        System.out.println(" ");
        System.out.println("===================");
        textDelay("You have $" + wallet + " in your wallet", true);
        System.out.println(" ");
    }
    public static void StorePrint(ArrayList<Items> store){
        textDelay("Items in store:", true);
        TimeDelay(30);
        System.out.println("===================");
        TimeDelay(30);
        for(int i = 0; i < store.size(); i++){
            System.out.println((i+1) + ". " + store.get(i).Name() + " - $" + store.get(i).Price());
            TimeDelay(30);
        }
        System.out.println("===================");
        System.out.println(" ");
    }
    public static void TimeDelay(int x){
        try{
            Thread.sleep(x);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static void textDelay(String phrase, boolean line){
        int phraseLength = phrase.length();
        int position = 0;

        System.out.println(" ");

        for(position = 0; position < phraseLength; position++){
            System.out.print(phrase.charAt(position));
            TimeDelay(30);
        }

        if(line == true){
            System.out.println(" ");
            System.out.println(" ");
        }


    }
}

// MULTIPLE CHOICE QUESTIONS:

// #1 - What is the correct way to initalize an ArrayList
// a: ArrayList(String) list = new ArrayList(String)();
// b: ArrayList[String] list = new ArrayList[String]();
// c: ArrayList<String> list = new ArrayList<String>();
// d: ArrayList{String} list = new ArrayList{String}();

// #2 - What makes an ArrayList different from an Array
// a: An ArrayList can't change size while an Array can
// b: An ArrayList can change size while an Array can't
// c: An ArrayList can't store Objects while an Array can
// d: An ArrayList can store Objects while an Array can't