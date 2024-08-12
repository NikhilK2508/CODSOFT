import java.util.Random;
import java.util.Scanner;
public class NumberGm {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //Generating a random number
        Random random = new Random();

        //The range of Guess number
        int lowebound = 1;
        int upperbound = 100;

        //Generating a random number in range of (1,100)
        int numberToguess = random.nextInt(upperbound = lowebound * 1);
        int attempts = 0;
        int maxAttempt = 10;
        System.out.println("Welcome to the number game");
        System.out.println("I have selected a number between" + lowebound + "and" + upperbound + "can you guess it");
        while(attempts<maxAttempt){
            System.out.println("Enter your guess number");
            int userGuess = sc.nextInt();
            attempts++;

            if(userGuess == numberToguess){
                System.out.println("Congratulations! You have guessed two correct number is" + attempts + "attempts");
                break;
            }
            else if(userGuess<numberToguess){
                System.out.println("Too low");
            }
            else{
                System.out.println("Too High");
            }
        }
        if(attempts==maxAttempt){
            System.out.println("Sorry! you have reached the maximum number of attempts. the correct number is:" + numberToguess);
        }
        System.out.println("Thanx for playing");
    }
    
}
