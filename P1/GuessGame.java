import java.util.Random;
import java.util.Scanner;
/**
 * The Guess Game program will choose a random number between 1-100 and gives
 * you a chance to guess the number. You will be given an unlimited number of
 * guesses and on each guess, you will be told whether your guess is too high,
 * too low, or correct. You will have the chance to repeat the game as many 
 * times as you wish.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class GuessGame
{
    public static void main(String[] args)
    {
        String playAgain = "y";     //to control the loop
        int numGen;                 //hold the randomly generated number.
        int userAnswer;             //hold the users answer.
        
        //Cretae a Scanner object to read keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Create a Random object to generate random numbers.
        Random randomNum = new Random();

        //Short introductory message describing how to play the game.
        System.out.println("The Guess Game program plays a guessing game."+
                        " The program will choose a random number between" +
                        " 1-100 and give you the chance to guess the number." +
                        " You will be given an unlimited number of guesses" +
                        " and on each guess, you will be told whether your" +
                        " guess was too high, too low or correct. You will" +
                        " have the chance to repeat the game as many times" +
                        " you wish.");
        System.out.println();

        System.out.println("Let's begin...");
       
        //While variable "playAgain" is equal to "y".
        while (playAgain.equalsIgnoreCase("y"))
        {
            System.out.println();
            System.out.println("Guess a number between 1-100: ");
            numGen = randomNum.nextInt(100) + 1;
            userAnswer = keyboard.nextInt();
            //While the users input is not equal to the randomly generated number.
            while (userAnswer != numGen)
            {
                //If the users input is less than the randomly generated number, do this.
                if (userAnswer > numGen)
                {
                    System.out.println("Your guess was too high. Try again.");
                    userAnswer = keyboard.nextInt();
                }
                //If the users input is greater than the randomly generated number, do this.
                if (userAnswer < numGen)
                {
                    System.out.println("You guess was too low. Try again.");
                    userAnswer = keyboard.nextInt();
                }
                //If the users input is equal to the randomly generated number, do this.
                if (userAnswer == numGen)
                {
                    System.out.println("Your guess is correct!");
                }
            }
            //Asks if the users wants to play again. Reads next user input to determine whether to repeat or not.
            System.out.println();
            System.out.print("Would you like to guess another number (y/n)? ");
            keyboard.nextLine();
            playAgain = keyboard.nextLine();
        }
        //Goodbye message and close keyboard Scanner.
        System.out.println();
        System.out.println("Thanks for playing the GuessGame!");
        System.out.println();
        keyboard.close();
    }
}