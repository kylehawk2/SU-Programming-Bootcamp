import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
/**
 * This program simulates the classic Chutes and Ladders board game.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class Chutes
{
    /**
     * 
     * @param args
     */
    public static void main(String[] args) throws IOException
    {
        final int MAXPLAYERNUM = 6;
        int playerNum;
        int spinnerNum;
        String[] playerName = new String[MAXPLAYERNUM];
        int arrRow = 19;
        int arrCol = 2;
        int[][] chuteLadder = new int[arrRow][arrCol];
        int count = 0;
        int[][] playArea = {{100,99,98,97,96,95,94,93,92,91},
                            {90,89,88,87,86,85,84,83,82,81},
                            {80,79,78,77,76,75,74,73,72,71},
                            {70,69,68,67,66,65,64,63,62,61},
                            {60,59,58,57,56,55,54,53,52,51},
                            {50,49,48,47,46,45,44,43,42,41},
                            {40,39,38,37,36,35,34,33,32,31},
                            {30,29,28,27,26,25,24,23,22,21},
                            {20,19,18,17,16,15,14,13,12,11},
                            {10,9,8,7,6,5,4,3,2,1}};

        System.out.println();

        welcome();
        
        Scanner keyboard = new Scanner(System.in);
        do
        {
            System.out.print("How many players will play (between 2-6)? ");
            playerNum = keyboard.nextInt();
            if (playerNum < 2)
            {
                System.out.println("There must be at least two players to play" 
                                + " the game!");
                System.out.println();
            }
            else if (playerNum > 6)
            {
                System.out.println("Player number cannot exceed six players!");
                System.out.println();
            }
        } while (playerNum < 2 || playerNum > 6);
        
        for (int index = 0; index <= playerNum; index++)
        {
            
            System.out.print("Enter player " + index + "'s name: ");
            playerName[index] = keyboard.nextLine();
            
            
        }
        System.out.println(Arrays.toString(playerName));

        File file = new File("p3input.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            for (int arrayRow = 0; arrayRow < chuteLadder.length; arrayRow++)
            {
                String[] line = inputFile.nextLine().trim().split("");
                for (int arrayCol = 0; arrayCol < line.length; arrayCol++)
                {
                    chuteLadder[arrRow][arrCol] = Integer.parseInt(line[arrayCol]);
                }
            }
            System.out.println(Arrays.deepToString(chuteLadder));
        }

        // for (int row = 0; row < 19; row++)
        // {
        //     for (int col = 0; col < 2; col++)
        //     {
        //         System.out.println(chuteLadder[row][col]);
        //     }
        // }

        // Random randomNum = new Random();
        // for(index = 0; index <= playerNum; index++)
        // {

        //     spinnerNum = randomNum.nextInt(10) + 1;
        // }

        goodbye();
    }
    /**
     * 
     */
    public static void welcome()
    {
        System.out.println("Welcome to Chutes and Ladders! You must land on "
                        + "100 (without going past) to win! You will play" 
                        + " against the computer.");
    }
    /**
     * 
     */
    public static void playGame() throws IOException
    {
        
    }
    /**
     * 
     */
    public static void goodbye()
    {
        System.out.println();
        System.out.println("Goodbye, and thanks for playing Chutes & Ladders!");
    }
}