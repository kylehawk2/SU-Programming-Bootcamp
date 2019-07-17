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
        String[] playerName;
        int index, offset;
        String input;
        char repeat;
        int count = 0;
        int[] playArea = new int[101];
        int[] playerPos; 

        System.out.println();

        welcome();

        File file = new File("p3input.txt");
        Scanner inputFile = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);

        while (inputFile.hasNext())
        {
            index = inputFile.nextInt();
            offset = inputFile.nextInt();
            playArea[index] = offset;
            inputFile.close();
        }
        

        do 
        {
            playerNum = getPlayerNum(keyboard);
            playerName = new String[playerNum];
            playerPos = new int[playerNum];
            getPlayerNameSetPos(playerNum, playerName, playerPos);

            for(int i = 0; i <= playerNum; i++)
            {
                playerPos[i] = takeTurn(playerPos, playerName, playArea);
            }
            System.out.print("Would you like to repeat? (y/n): ");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
            
        } while(repeat == 'y' || repeat == 'Y');
    

        goodbye();
    }
    /**
     * A short welcome message to the user.
     */
    public static void welcome()
    {
        System.out.println("Welcome to Chutes and Ladders! You must land on "
                        + "100 (without going past) to win! You will play" 
                        + " against the computer.");
    }
    /**
     * This function controls how the die is rolled.
     * @return the value the die rolls on. 
     */
    public static int dieRoll()
    {
        Random randomNum = new Random();
        int spinnerNum = randomNum.nextInt(6) + 1;
        return spinnerNum;

    }
    /**
     * This function preforms the main game logic for Chutes and Ladders. 
     * 
     * @param playerPos
     * @param playerName
     * @param playArea
     * @return
     */
    public static int takeTurn(int playerPos, int playerName, int[] playArea)
    {
        int results = dieRoll();
        int chutesLadder = 0;
        
        System.out.println(playerName +", Its your turn. You are currently at space " + playerPos);
        System.out.println("The spin was: " + results);
        
        if(playerPos <= 100){
            playerPos += results;    
            chutesLadder = playArea[playerPos];
            if(chutesLadder > 0)
            {
                playerPos += chutesLadder;
                System.out.println("Congrats, that is a ladder! You get to climb" + chutesLadder + " spaces");
                
            }
            if(chutesLadder < 0)
            {
                playerPos -= chutesLadder;
                System.out.println("Sorry, that is a chute! You are sent back" + (chutesLadder * -1));
            }
            System.out.println("You are at space: " + playerPos);
         }
         return playerPos;
    }
    /**
     * 
     * @param playerNum
     * @param playerName
     * @param playerPos
     */
    public static void getPlayerNameSetPos(int playerNum, String[] playerName, int[] playerPos)
    {
        Scanner keyboard = new Scanner(System.in);
        
            for (int i = 0; i <= playerNum - 1; i++)
            {
                System.out.print("Enter player " + (i + 1) + "'s name: ");
                playerName[i] = keyboard.nextLine();
            }
            for (int i = 0; i <= playerNum - 1; i++)
            {
                playerPos[i] = 0;
            }
    
    }
    /**
     * 
     * @return
     */
    public static int getPlayerNum()
    {
        int playerNum;
        Scanner keyboard = new Scanner(System.in);
        do
            {
                System.out.print("How many players will play (between 2-6)? ");
                playerNum = keyboard.nextInt();
                keyboard.nextLine();
                if (playerNum < 2 || playerNum > 6)
                {
                    System.out.println("There must be at least two to six players to play" 
                                    + " the game!");
                    System.out.println();
                }
                
            } while (playerNum < 2 || playerNum > 6);
            return playerNum;
    }
    /**
     * A short goodbye message after the game is complete.
     */
    public static void goodbye()
    {
        System.out.println();
        System.out.println("Goodbye, and thanks for playing Chutes & Ladders!");
    }
}