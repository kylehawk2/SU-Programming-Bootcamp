import java.util.Scanner;
/**
 * This is a program for the game "Mad Libs" to be played by the user.
 * 
 * @author Kyle Hawkins
 * @version 1.0
 */
public class MadLibs
{
    public static void main(String[] args)
    {
        String name;
        int age;
        String place;
        String college;
        String proffesion;
        String animal;
        String petName;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Mad Libs game! You will be asked to enter specific input.");
        System.out.println("Lets begin.");
        System.out.print("What is your name?");
        name = keyboard.nextLine();

        System.out.print("What city do you live in currently?");
        place = keyboard.nextLine();

        System.out.print("What college did you graduate from?");
        college = keyboard.nextLine();

        System.out.print("What is your proffesion?");
        proffesion = keyboard.nextLine();

        System.out.print("What kind of animal have you adopted as a pet?");
        animal = keyboard.nextLine();

        System.out.print("What was that pet's name?");
        petName = keyboard.nextLine();

        System.out.print("How old are you?");
        age = keyboard.nextInt();

        System.out.println("There once was a person named "  + name +  " who lived in " + place + ". At the age of " + age +",");
        System.out.println(name + " went to college at " + college +". " + name + " graduated and went to work as a");
        System.out.println(proffesion + ". Then " + name + " adopted a(n) " + animal + " named " + petName +". They both");
        System.out.println("lived happily ever after!");
        System.out.println("");
        System.out.println("Thanks for playing the Mad Lib game!");
    }
}