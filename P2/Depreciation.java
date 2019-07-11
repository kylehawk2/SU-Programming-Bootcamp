import java.util.Scanner;
/**
 * The Depreciation program asks the user to input a type of equipment, its 
 * original value and its annual depreciation. Then the program outputs a 
 * table going up until the end of year value is zero. The table will include
 * year, depreciation, end of year value, and accumulated depreciation. The
 * user will then have the option to repeat the program as many times they 
 * wish.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */

public class Depreciation
{
    /**
     * Main method executes the welcome, calculate depreciation, and goodbye
     * functions.
     * 
     * @param args A string array containing the command line arguments.
     */
    public static void main(String[] args)
    {
        welcome();      //Display welcome message.
        calcDepr();     //Calculate the depreciation & display within a table.
        goodbye();      //Display goodbye message.
    }
    /**
     * Function for displaying a welcome message.
     */
    public static void welcome()
    {
        System.out.println();
        System.out.println("Welcome to the asset deprection reporting system"
                           + ", brought to you ");
        System.out.println("by Slime, Weasel, and Swindle.");
        System.out.println();
    }
    /**
     * Function for calculating depreciation and output to a table.
     */
    public static void calcDepr()
    {
        double depr, begVal, accuDepr, currentVal;              //Store depreciation and beginnnng value.
        String equipment, input;                                //Store equipment name and input.
        String heading1 = "Year", heading2 = "Depreciation";    //Store table heading names.
        String heading3 = "End-of-Year Value";
        String heading4 = "Accumlated Depreciation";
        char repeat;                                            //Store character for validation.


        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            //Asks user to input equipment, original value and annual depreciation.
            System.out.print("Enter a description of the equipment: ");
            equipment = keyboard.nextLine();

            System.out.print("What is the original value of the equipment?: $");
            begVal = keyboard.nextDouble();

            System.out.print("What is the annual depreciation?: $");
            depr = keyboard.nextDouble();

            System.out.println();

            //Displays previously user entered info.
            System.out.printf("Equipment description: " + equipment);
            System.out.println();
            System.out.printf("Beginning value: $%,.2f", begVal);
            System.out.println();
            System.out.printf("Depreciation: $%,.2f", depr);
            System.out.println();

            System.out.println();

            // Prints the name of each table heading.
            System.out.printf("%s\t%s\t%s\t%s\t\n", heading1, heading2, heading3, heading4);
            

            //Initialize variables Year, Accumulated Depreciation, and Current Value.
            int year = 0;
            accuDepr = 0;
            currentVal = begVal;

            while (currentVal > 0.0)
            {
                accuDepr += depr;
                year ++;
                currentVal -= depr;
                if (currentVal < 0)
                    currentVal = 0;
                System.out.printf("%d\t$%,.2f\t\t$%,.2f\t\t$%,.2f\t\n", year, depr, currentVal, accuDepr);

            }
            keyboard.nextLine();
            System.out.println("Do you want to depreciate another item? (y/n)");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
        } while (repeat == 'y' || repeat == 'Y');
        
        
        keyboard.close();
    }
    /**
     * Function for displaying goodbye message.
     */
    public static void goodbye()
    {
        System.out.println("Goodbye, and thanks for using the asset"
         + "depreciation reporting system!");
    }
}