
public class ArrayAlgorithms {
    public static void main(String[] args){
        int evens = 0;
        int prevNum = 0;
        int max = 0;

        int[] numList = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i = 0; i < numList.length; i++){
            if(numList[i] % 2 == 0){
                evens += 1;
            }
        }
        // Counts how many even numbers are in the array
        // This algorithm goes through each position of numList and checks if the remainder of the value in the position divided by two is equal to 0
        // if one is, it increases the 'evens' int by 1, keeping count of how many even numbers there are

        for(int i = 0; i < numList.length; i++){
            if(numList[i] > prevNum){
                max = numList[i];
            }
            prevNum = numList[i];
        }
        System.out.println(max);
        System.out.println(evens);
        // Finds the max value in the array
        // This algorithm goes through each position of numList and checks if the value in the position is greater than the previous value
        // if it is, it changes the 'max' int to that value, and then updates the variable storing the previous value for the next run of the loop

        for(int i = 0; i < numList.length; i++){
            if(numList[i] % 2 != 0){
                numList[i] = 17;
            }
        }
        // Changes all odd numbers to 17
        // This algorithm goes through each position of numList and checks if the remainder of the value in the position divided by two isnt equal to 0
        // if one isnt, it sets the value of that position to 17


    }
}
