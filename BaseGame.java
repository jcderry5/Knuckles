import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseGame {
	public static void main(String[] args){
		gameIntro();
	}

	public static int getUserInput(int minInt, int maxInt){
		System.out.println("Input a number between " + minInt + " and " + maxInt);
		Scanner keyboard = new Scanner(System.in);

		if (keyboard == null) {
            throw new IllegalArgumentException("The parameter keyboard cannot be null");
        }
		int choice = getInt(keyboard, "Enter choice: ");
		keyboard.nextLine();

		// Check to see if choice is between range
		while (choice < minInt || choice > maxInt) {
			System.out.println();
            System.out.println(choice + " is not a valid choice");
            choice = getInt(keyboard, "Enter choice: ");
            keyboard.nextLine();
		}

		return choice;
	}

	public static void gameIntro(){
		System.out.println("Welcome to Knuckles!\n~A dice game of risk and reward~\nSelect an option\n");
		System.out.println("1: Play Game\n2: How To Play\n3: Quit Game");
		int menuSelection = getUserInput(1, 3);
		if (menuSelection == 1) {
			startGame();
		} else {
			System.out.println("I don't have that ready yet sowwee");
		}
	}



}