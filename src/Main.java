import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0, guessCount = 1;//guess is initialized to 0

        secretNumber = 123;
            System.out.println("I'm thinking of a number between 1 and 1000");
            System.out.print("Enter the number:");
            guess = keyboard.nextInt();


            while (guess != secretNumber) {
                if (guess < secretNumber) {
                    System.out.println("\nYou are wrong. Try again.");
                    System.out.println("Enter the number: ");
                    guess = keyboard.nextInt();
                    guessCount++;
                } else if (guess > secretNumber) {
                    System.out.println("\nYou are wrong. Try again.");
                    System.out.println("Enter the number: ");
                    guess = keyboard.nextInt();
                    guessCount++;
                } else if (guess == secretNumber) {
                    System.out.println("Thats right!");
                    break;
                }

                if (guessCount >= 6) {
                    System.out.println("Sorry you have used up your guesses.");
                    break;
                }
            }
        }

    }

