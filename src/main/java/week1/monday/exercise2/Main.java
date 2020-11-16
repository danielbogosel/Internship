package week1.monday.exercise2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerNumber;
        int guessNumber = random.nextInt(10);
        boolean debugStatus = false;
        boolean quit = false;
        boolean moveStatus = false;

        System.out.println("Guess a number between 0 and 10");
        playerNumber = scanner.nextInt();
        while (playerNumber != guessNumber) {
            showMenu();
            String options = scanner.next();
            switch (options) {
                case "r":
                    guessNumber = random.nextInt(10);
                    break;
                case "q":
                    quit = true;
                    break;
                case "d":
                    if (debugStatus == false) {
                        debugStatus = true;
                        System.out.println("The number is: " + guessNumber);
                    } else {
                        debugStatus = false;
                    }
                    break;
                case "m":
                    moveStatus = true;
                    if (guessNumber != 10 && moveStatus == true) {
                        guessNumber += 2;
                    } else {
                        guessNumber--;
                    }
                    break;


                default:
                    playerNumber = Integer.parseInt(options);
                    break;
            }
            if (playerNumber > guessNumber) {
                System.out.println("The number is too high");

            } else if (playerNumber < guessNumber) {
                System.out.println("The number is too low");

            } else {
                System.out.println("You guess the number");
                break;
            }
            if (quit == true) {
                break;
            }
        }
        System.out.println("The game ended!");
    }

    private static void showMenu() {
        System.out.println("Guess the number between 0 and 10 or choose an option");
        System.out.println("r-restart the game");
        System.out.println("q-quit");
        System.out.println("d-debug");
        System.out.println("m-move");

    }
}