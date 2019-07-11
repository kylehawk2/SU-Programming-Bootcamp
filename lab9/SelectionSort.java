import java.util.Scanner;
import java.io.*;
/**
 * 
 */
public class SelectionSort
{
    public static void main(String[] args) throws IOException
    {
        final int MAXVAL = 55;
        int[] arr = new int[MAXVAL];
        int arrCount = 0;
        int count = 0;

        File file = new File("lab9input.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext() && count < arr.length)
        {
            String input = inputFile.nextLine();
            System.out.println(input);
            // arr[arrCount] = input;
            // arrCount ++;
        }

        // for (int index = 0; index < arr.length;)
        // {
        //     System.out.println("arr[" + index + "]: " + arr[index]);
        // }

        
    }
}