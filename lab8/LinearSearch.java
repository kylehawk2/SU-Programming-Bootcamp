import java.util.Scanner;
import java.io.*;
/**
 * The LinearSeach program reads the values from an input file into a single array
 * 
 * @author Kyle Hawkins
 * @version 1.0 
 */
public class LinearSearch
{
    /**
     * Reads numbers from an input .txt file and puts them into a single 
     * array. Then asks the user to enter a number to search for within the
     * array and returns whether the number was found or not.
     * 
     * @param args A string array containing the command line arguments.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        final int MAXNUM = 50;              //Store maximum number of values.
        int[] arr = new int[MAXNUM];        //Array of numbers.
        int arrCount = 0;                   //Index counter for each array.
        String filename;                    //Store user input for a filename.
        int count = 0;                      //Store count amount for reading file.
        int key;                            //Store key number to be searched for.
        String userInput;                   //Store user input for repeat.
        char repeat;                        //Store character for repeat.

        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Ask user for filename.
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        //Open file.
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        System.out.println();

        //Read contents of .txt file.
        System.out.println("Array elements:");
        while (inputFile.hasNext() && count <= arr.length)
        {
            int input = inputFile.nextInt();
            arr[arrCount] = input;
            arrCount ++;
        }

        //Loop through each index of the array and print contents.
        for (int index = 0; index < arr.length; index++)
        {
            System.out.println("arr[" + index  + "]: " + arr[index]);
        }
        
        //Repeatitive section; Search for user inputted number within array. 
        do
        {
            System.out.println();
            System.out.print("Enter a number to search in the array: ");
            key = keyboard.nextInt();
            keyboard.nextLine();
            int index = linearSearch(arr, key);
            if (index == -1)
                System.out.println(key + " not found.");
            else
                System.out.println(key + " found at index " + index);
            System.out.print("Would you like to repeat (y/n)? ");
            userInput = keyboard.nextLine();
            repeat = userInput.charAt(0);
        }while (repeat == 'y' || repeat == 'Y');
        inputFile.close();
        keyboard.close();
    }
    /**
     * The linearSearch function acts as a filter for the user to find a 
     * specific number that they entered when prompted.
     * 
     * @param arr The array to be searched from.
     * @param key User inputted number for validation.
     * @return Returns either a correct input index or -1 for a incorrect 
     *         input.
     */
    public static int linearSearch(int[] arr, int key)
    {
        for (int index = 0; index < arr.length; index++)
        {
            if (key == arr[index])
                return index;
        }
        return -1;
    }
}
