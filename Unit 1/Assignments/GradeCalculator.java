import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // Key Concepts
        System.out.println("What percent grade do you have in Key Concepts? ");
        double conGrade = keyboard.nextInt();

        // Projects
        System.out.println("What percent grade do you have in Projects? ");
        double projGrade = keyboard.nextInt();

        // Quiz
        System.out.println("What percent grade do you have in Quizzes? ");
        double quizGrade = keyboard.nextInt();

        // Test
        System.out.println("What percent grade do you have in Tests? ");
        double testGrade = keyboard.nextInt();

        double finalGrade = (conGrade * 0.4) + (projGrade * 0.2) + (quizGrade * 0.2) + (testGrade * 0.2);
        System.out.println("Your overall grade is " + finalGrade + "%");

        if (finalGrade >= 90 ){
            System.out.println("You have an A, nice job!");
        }

        else if (finalGrade >= 80){
            System.out.println("You got a B, its still a good grade but you can do better");
        }

        else if (finalGrade >= 70){
            System.out.println("You got a C, you should probably study more next time");
        }
        else if (finalGrade >= 60){
            System.out.println("You have a D, you need to do a lot more work to prepare");
        }

        else if (finalGrade >= 0){
            System.out.println("You have an F, you should seek help from your teacher");
        }
        else{
            System.out.println("I don't know what grade you have but its... not normal");
        }

        keyboard.close();

    }
}
