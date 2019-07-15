import java.util.Scanner;
import java.io.*;
/**
 * This program displays and sorts words from a String array read from a specific
 * filename, lab8input.txt.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class SelectionSort
{
    /**
     * The main function opens the file, reads each word of the string
     * then displays the each word from the string array as they were 
     * initially entered. Then sorts each word alphabetically and displays
     * the newly sorted string array.
     * 
     * @param args A string array containing the command line arguments.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        final int MAXVAL = 55;                  //Store maximum number of cells within the array.
        String[] arr = new String[MAXVAL];      //String array to hold Ch1 of The Hobbit.
        int arrCount = 0;                       //Index counter for the array.
        int count = 0;                          //Store count amount for reading file.

        //Opens a file named lab9input.txt.
        File file = new File("lab9input.txt");
        Scanner inputFile = new Scanner(file);

        //Reads each word from the String array.
        while (inputFile.hasNext() && count < arr.length)
        {
            String input = inputFile.nextLine();
            
            arr[arrCount] = input;
            arrCount ++;
        }
        System.out.println();

        //Displays each word from the String array from file.
        System.out.println("Array before sorting: ");
        for (int index = 0; index < arrCount; index++)
        {
            System.out.println("arr[" + index + "]: " + arr[index]);
        }
        System.out.println();

        //Invoke selectionSort function to sort each word alphabetically.
        selectionSort(arr);

        //Displays each sorted word after the sorting function has occured.
        System.out.println("Array after sorting: ");
        for (int index = 0; index < arrCount; index++)
        {
            System.out.println("arr[" + index + "]: " + arr[index]);
        }

        System.out.println();
        inputFile.close();
    }
    /**
     * This method sorts each word from the string array alphabetically.
     * 
     * @param array String array from .txt file.
     */
    public static void selectionSort(String[] array)
    {
        int minIndex;       //Store cell from string array.

        //Loop through each cell and swap words alphabetically.
        for (int startScan = 0; startScan < array.length - 1; startScan++)
        {
            minIndex = startScan;
            for (int index = startScan + 1; index < array.length; index++)
            {
                if (array[index].compareTo(array[minIndex]) < 0)
                {   
                    minIndex = index;
                }
            }
            String temp = array[startScan];
            array[startScan] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}