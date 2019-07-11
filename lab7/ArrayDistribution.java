import java.util.Scanner;
import java.io.*;
/**
 * This program asks the user for a filename, reads in a list of integers from
 * a file. Each integer is then placed into one of three arrays - the positive
 * numbers go into an array called evenNum, the odd numbers go into an array  
 * called oddNum and the negative numbers go into the array called negNum.  
 * Then prints to console the values of each array and index value.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class ArrayDistribution
{
    public static void main(String[] args) throws IOException
    {
        final int MAXNUM = 30;                              //Store maximum number of values.
        int[] evenNum = new int[MAXNUM];                    //Array of even numbers.
        int[] oddNum = new int[MAXNUM];                     //Array of odd numbers.
        int[] negNum = new int[MAXNUM];                     //Array of negative numbers.
        int evenCount = 0, oddCount = 0, negCount = 0;      //Index counter for each array.
        String filename;                                    //Store filename.
        int count = 0;                                      //Store count amount for reading file.


        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Ask user for filename.
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        //Opens file 
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //Reads numbers from the file and sorts them into the proper array.
        while (inputFile.hasNext() && count < evenNum.length)
        {
            int input = inputFile.nextInt();

            //If input is greater than zero and divisible by 2, add to evenNum array.
            if (input > 0 && input % 2 == 0)
            {
                evenNum[evenCount] = input;
                evenCount ++;
            }

            //If input is greater than zero and divisible by 3, add to oddNum array.
            else if (input > 0 && input % 3 == 0)
            {
                oddNum[oddCount] = input;
                oddCount ++;

            }

            //If input is less than zero, add too negNum array.
            else if (input < 0)
            {
                negNum[negCount] = input;
                negCount ++;
            }
        }

        System.out.println();

        //Loop through evenNum array and print each index value to console.
        for (int index = 0; index < evenNum.length; index++)
        {
            if (evenNum[index] > 0)
                System.out.println("evenNum[" + index + "]: " + evenNum[index]);
        }

        System.out.println();

        //Loop through oddNum array and print each index value to console.
        for (int index = 0; index < oddNum.length; index++)
        {
            if (oddNum[index] > 0)
                System.out.println("oddNum[" + index + "]: " + oddNum[index]);
        }

        System.out.println();

        //Loop through negNum array and print each index value to console.
        for (int index = 0; index < negNum.length; index++)
        {
            if (negNum[index] < 0 && negNum[index] != 0)
                System.out.println("negNum[" + index + "]: " + negNum[index]);
        }
            
        inputFile.close();
        keyboard.close();
    }
}