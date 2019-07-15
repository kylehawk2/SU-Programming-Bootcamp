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
    public static void main(String[] args)
    {
        final int MAXPLAYERNUM = 6;
        int playerNum;
        String[] playerName = new String[MAXPLAYERNUM];

        Scanner keyboard = new Scanner(System.in);

        System.out.println();

        welcome();

        System.out.print("How many players will play (between 2-6)? ");
        playerNum = keyboard.nextInt();
        for (int player = 0; player <= playerNum; player++)
        {
            
            System.out.print("Enter player " + player + "'s name: ");
            playerName[player] = keyboard.nextLine();
            
            
        }
        System.out.println(Arrays.toString(playerName));
    }

    public static void welcome()
    {
        System.out.println("Welcome to Chutes and Ladders! You must land on "
                        + "100 (without going past) to win! You will play" 
                        + " against the computer.");
    }
}