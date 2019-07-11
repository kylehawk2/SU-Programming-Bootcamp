import java.util.Scanner;
/**
 * This is a short program that asks the user for two integers, then decides if the first integer is a multiple of the second 
 * integer. If the first integer is a multiple of the second integer, the program should indicate that with a message to the 
 * screen and it should supply the factor. If the first integer is not a multiple of the second integer, the program should
 * indicate that with a message to the screen.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class Decisions
{
    public static void main(String[] args)
    {
        int num1;       //hold first number.
        int num2;       //hold second number.
        int result;     //store quotient.
        
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Input two integers to store
        System.out.println("Welcome to the Decision program!");
        System.out.print("Enter two numbers, separated by a space: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        //If the second integer is eqaul to zero; please try again message occurs.
        if (num2 == 0)
        {
            System.out.println("The second number cannot be zero. Please try again.");
            System.out.println("Thanks for using the Decisions program!");
        }

        //...else if quotient is greater than or equal to 1, show factor of message.
        else if (num1 / num2 >= 1)
        {
            result = num1 / num2;
            System.out.println(num1 + " is a multiple of " + num2 + " with a factor of " + result + ".");
            System.out.println("Thanks for using the Decisions program!");
        }
        
        //..else if quotient is less than 1, show NOT a multiple of message.
        else if (num1 / num2 < 1)
        {
            result = num1 / num2;
            System.out.println(num1 + " is NOT a multiple of " + num2 +".");
            System.out.println("Thanks for using the Decisions program!");
        }
    }
}