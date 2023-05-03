public class Quidditch {
 
    public static void main(String args[]) {
    int count = 0;
     
    QuidditchPlayer[] allPlayers = new QuidditchPlayer[28];
    String[] teams = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
    String[] positions = {"Chaser", "Chaser", "Chaser", "Beater", "Beater", "Keeper", "Seeker"};
     
    for(int i = 0; i < teams.length; i++){
        for(int u = 0; u < positions.length; u++){
            allPlayers[count] = new QuidditchPlayer(teams[i], positions[u]);
            count ++;
        }
    } 

    for(int i = 0; i < allPlayers.length; i++){
        System.out.println("Player " + i + " is a " + allPlayers[i]);
    }
     
    /* Replace the code in lines 10 - 15 with a nested for loop that sets all the players */
     
    }
}