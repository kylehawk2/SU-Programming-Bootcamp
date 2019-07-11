import java.util.Scanner;
/**
 * The Pretty Fors program will take a positive integer (x) from the user 
 * (check to make sure it is a positive integer) and uses the integer to display
 * several patterns on the screen.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class PrettyFors
{
    public static void main(String[] args)
    {
        int num, num1;      //Loop control variable. 
        int userNum;        //User input value.

        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Welcome message and prompt to input a positive number.        
        System.out.println("Welcome to the Pretty Fors program!");
        System.out.print("Please input one positive number: ");
        userNum = keyboard.nextInt();

        
        //Prints X copies of X on one line.
        System.out.print("1. " + userNum + " copies of " + userNum + " on one line.");
        System.out.println();
        for (num = 1; num <= userNum; num++)
        {
            System.out.print(num);
        }
        System.out.println();
        System.out.println();
        
        //Prints X lines with a single 1 on each line. 
        System.out.println("2. " + userNum + " lines with a single 1 on each line.");
        
        for (num = 1; num <= userNum; num++)
        {
            System.out.print(1);
            System.out.println();
        }
        System.out.println();
        
        //Prints a multiplication table of X.
        System.out.println("3. Multiplication table to " + userNum);
        for (num = 1; num <= userNum; num++)
        {
           for (num1 = 1; num1 <= userNum; num1++){
               System.out.print("\t" + num*num1);
           }
           System.out.println();
        }
        System.out.println();

        //Prints out X lines with 1 ones on the first line, 2 twos on the second, etc. to X Xes on the last line.
        System.out.println("4. " + userNum + " lines with 1 ones on the first line," +
            " 2 twos on the second, etc. to " + userNum + " " + userNum + "'s on the last line.");
        for (num = 1; num <= userNum; num++)
        {
            for (num1 = 1; num1 < (num+1); num1++)
            {
                System.out.print(num1 + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Prints the outline of a half-diamond, with X at the widest point.
        System.out.println("5. The outline of a half-diamond, with " + userNum +" at the widest point.");
        
        for (num = 1; num <= userNum; num++)
        {
            for (num1 = 0; num1 < num; num1++)
            {
                System.out.print(" ");
            }
            System.out.println(num1);
        }
        for (num = (userNum - 1); num >= 1; num--)
        {
            for (num1 = 1; num1 < num; num1++)
            {
                System.out.print(" ");
            }
            System.out.println(num1);
        }
        keyboard.close();
    }
}