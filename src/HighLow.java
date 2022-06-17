import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        highLow();
    }

    public static String highLow() {

        String again = "y";                                                 // set "again" to "y" for while loop
        while (again.toLowerCase().equals("y")) {                           // outer while loop to operate highLow loop

            double computerRandom = Math.floor(Math.random() * (100 - 1 + 1) + 1);    // random number between 1-100
//            System.out.println("Random number is " + (int) computerRandom);

            System.out.println("You have to guess a number between 1-100. You have 7 guesses.");
            System.out.println();

            String incorrect = "y";
            int guessedNum;                                                 // create "guessedNum" variable outside of while loop
            int guessCount = 1;                                             // create "guessCount" variable to track number of guesses
            while (incorrect.equals("y")) {                                 // inner while loop to run number guessing

                Scanner scanner = new Scanner(System.in);                       // get user input on guessed number
                System.out.print("Guess # " + guessCount + " - What is the number you guess?: ");
                String userInput = scanner.nextLine();
                guessedNum = Integer.parseInt(userInput);                       // user input is "guessedNum"

                if (guessedNum < computerRandom) {                              // if too low
                    System.out.println("Sorry, too LOW!");
                    guessCount += 1;                                            // increment guess count
                    incorrect = "y";
                    continue;
                } else if (guessedNum > computerRandom) {                       // if too high
                    System.out.println("Sorry, too HIGH!");
                    guessCount += 1;                                            // increment guess count
                    incorrect = "y";
                    continue;
                } else if (guessedNum == computerRandom){                       // match made, break out of inner while loop
                    System.out.println("GREAT guess! You got it! It took " + guessCount + " guesses.");
                    break;
                } else if (guessCount >= 7) {                                   // too many chances
                    System.out.println("Sorry! You've taken " + guessCount + " guesses. End of game.");
                    break;
                }
            }
            System.out.print("Would you like to play again?(y/n): ");           // ask to play again
            Scanner scanner = new Scanner(System.in);
            String askAgain = scanner.nextLine();
            again = askAgain;                                                   // if "y", start outer while loop again
            if (!again.toLowerCase().equals("y")) {
                System.out.println("Thanks for playing, please play again soon!");
                System.out.println();
            }
            guessCount = 0;
        }
        return "Hi";
    }
}
