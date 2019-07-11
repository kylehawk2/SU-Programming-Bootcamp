import java.util.Scanner;
/**
 * This java program consists of several small functions in which the user
 * will be asked to enter a number between 5 and 25. Then the program will
 * return the calculated result.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class Functions
{
    /**
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args)
    {
        int x;          //Input integer.
        int y;          //Calculate integer.

        //Display welcome message.
        welcome();

        //Initialize input function.
        x = input();
        
        //Initialize calculate function.
        y = calculate(x);

        System.out.println("The result is: " + y);

        //Display goodbye message.
        goodbye();
    }
    /**
     * Function for displaying a welcome message.
     */
    public static void welcome()
    {
        System.out.println("Welcome to the Functions program! The program will"
                        + " request a number between 5 and 25 and return the"
                        + " calculated result.");
        System.out.println();
    }
    /**
     * 
     * @param num Stores the user's integer input.
     * @return Returns the integer entered by the user.
     */
    public static int input()
    {
        int num;    //Store user's integer input.

        //Create a Scanner object for keyboard input.        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number between 5 and 25: ");
        num = keyboard.nextInt();

        //While user input is less than 5 or greater than 25.
        while (num < 5 || num > 25)
        {
            System.out.print("Enter a number between 5 and 25: ");
            num = keyboard.nextInt();
        }
        
        keyboard.close();

        //Return the value in the num variable.
        return num;
    }
    /**
     * Calculates the mathematical result of the user determined integer.
     * 
     * @param value The integer carried over from input(); function. 
     * @return
     */
    public static int calculate(int value)
    {
        
        int result;
        
        result = (value * 2) - (value + 25);
       
        return result;
    }
    /**
     * Function for displaying a goodbye message. 
     */
    public static void goodbye()
    {
        System.out.println();
        System.out.println("Thanks for using the Functions program!");
    }
}