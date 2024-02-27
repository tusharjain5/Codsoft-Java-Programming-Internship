package com.number.game;

import java.util.Random;
import java.util.Scanner;

public class Numbergame {

    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\t\t\t\t\t Number Game \t\t\t\t\t");
        System.out.println("\t\t\t\t Welcome to the Number Game\t\t\t\t");

        System.out.println("Enter your Name:");
        @SuppressWarnings("unused")
		String name = sc.nextLine();
        System.out.println("Enter your Age:");
        @SuppressWarnings("unused")
		int age = sc.nextInt();
        sc.nextLine();

        System.out.println("\t\t\t\t\t GAME START \t\t\t\t\t");
        System.out.println("I have selected a number between 1 to 100. Can you Guess it ?");
        System.out.print("Enter 'yes' to start the game: ");
        String startGame = sc.nextLine();

        if (!startGame.equalsIgnoreCase("yes")) {
            System.out.println("Game Over");
            System.exit(0);
        }

        playGame(sc, random);

        sc.close();
    }

    private static void playGame(Scanner sc, Random random) {
        double points = 0;

        boolean playAgain = true;
        while (playAgain) {
            int target = random.nextInt(100) + 1;

            for (int attempts = 1; attempts <= MAX_ATTEMPTS; attempts++) {
                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                int guess = sc.nextInt();
                sc.nextLine();

                if (guess == target) {
                    System.out.println("Congratulations! You Guessed the Correct Number " + target + " in " + attempts + " attempts.");
                    points++;
                    break;
                } else if (guess < target) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempts == MAX_ATTEMPTS) {
                    System.out.println("Sorry, Your Max Limit of Attempt is Out. The Correct Number is " + target + ".");
                }
            }

            System.out.print("Do you want to play again? (Yes/No): ");
            String playAgainInput = sc.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + points);
        System.out.println("Try Again Next Time");
    }
}