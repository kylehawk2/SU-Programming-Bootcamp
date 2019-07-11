import java.util.Scanner; //Needed for the Scanner class
import java.io.*;
import java.util.Random;
/**
 * This is a sample program copied from the Java Textbook. (Generating Random Numbers)
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class BookEx
{
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 1, 6, 3, 9, 4};
        int key = 3;
        int index = linearSearch(arr, key);
        if (index == -1)
            System.out.println(key + " not found.");
        else
            System.out.println(key + " found at index " + index + ".");
    }  
    
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
            return i;
        }
        return -1;
    }
}