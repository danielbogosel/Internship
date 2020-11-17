package ro.nexttech.intership.week1.monday.exercise1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessNumber = random.nextInt(10);
        int playerNumber;
        int numberOfTries = 0;
        System.out.println("Guess the number between 0 and 10");

        while (numberOfTries < 3) {
            playerNumber = scanner.nextInt();
            if (playerNumber > guessNumber) {
                System.out.println("The number is too high");
                numberOfTries++;

            } else if (playerNumber < guessNumber) {
                System.out.println("The number is too low");
                numberOfTries++;

            } else {
                System.out.println("You guess the number");
                break;
            }
        }

        if (numberOfTries == 3) {
            System.out.println("You lost");
        }

    }
}
