package week1.monday.exercise4;


import java.util.Scanner;

public class MainMentalist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result;
        String playerNumber;
        StringGenerator stringGenerator = new StringGenerator();
        String generatedNumber = stringGenerator.generateString();
        System.out.println("Guess the number");
        System.out.println(generatedNumber);
        do {
            playerNumber = scanner.next();
            result = "";
            for (int i = 0; i < generatedNumber.length(); i++) {
                if (generatedNumber.charAt(i) == playerNumber.charAt(i)) {
                    result = result + "*";
                } else if (generatedNumber.contains(String.valueOf(playerNumber.charAt(i)))) {
                    result = result + "+";
                } else {
                    result = result + " ";
                }
            }
            System.out.println(result);
        } while (!result.equals("*****"));
        System.out.println("You guessed the number, it was" + generatedNumber);
    }
}