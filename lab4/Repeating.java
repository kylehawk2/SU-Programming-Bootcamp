import java.util.Scanner;
/**
 * This is a short program that asks the user for two integers, then decides if the first integer is a multiple of the second 
 * integer. If the first integer is a multiple of the second integer, the program should indicate that with a message to the 
 * screen and it should supply the factor. If the first integer is not a multiple of the second integer, the program should
 * indicate that with a message to the screen. Once the two numbers have been entered the program will ask if the user wants
 * to repeat the program again.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class Repeating
{
    public static void main(String[] args)
    {
        int num1, num2;      //store first and second number.
        int result;         //store quotient.
        char repeat;        //store 'y' or 'n'.
        String input;       //store input.
        
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the Decision program!");

        //Determine if multiple or not and repeat as necessary.
        do
        {
            //Input two integers to store
            System.out.print("Enter two numbers, separated by a space: ");
            num1 = keyboard.nextInt();
            num2 = keyboard.nextInt();

            //If the second integer is eqaul to zero; please try again message occurs.
            if (num2 == 0)
            {
                System.out.println("The second number cannot be zero. Please try again.");
                System.out.println("Thanks for using the Decisions program!");
                System.out.println("Would you like to repeat? (y/n)");
                input = keyboard.nextLine();
            }

            //...else if quotient is greater than or equal to 1, show factor of message.
            else if (num1 / num2 >= 1)
            {
                result = num1 / num2;
                System.out.println(num1 + " is a multiple of " + num2 + " with a factor of " + result + ".");
                System.out.println("Thanks for using the Decisions program!");
                System.out.println("Would you like to repeat? (y/n)");
                input = keyboard.nextLine();
            }
            
            //..else if quotient is less than 1, show NOT a multiple of message.
            else if (num1 / num2 < 1)
            {
                result = num1 / num2;
                System.out.println(num1 + " is NOT a multiple of " + num2 +".");
                System.out.println("Thanks for using the Decisions program!");
                System.out.println("Would you like to repeat? (y/n)");   
                input = keyboard.nextLine();
            }
            
            input = keyboard.nextLine();
            repeat = input.charAt(0);
        } while (repeat == 'Y' || repeat =='y'); //Repeat program while repeat variable is equal to 'Y' or 'y'.
        keyboard.close();
    }
}