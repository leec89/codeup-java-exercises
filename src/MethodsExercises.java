import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    // TODO: overload the addition method from the curriculum exercise to both add integers and add doubles

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static float division(float num1, float num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int multBonus(int num1, int num2) {
        int answer = num1;
        for (int i = 1; i < num2; i++) {
            answer = addition(answer, num1);
        }
        return answer;
    }

    public static int multRecursive(int num1, int num2) {
        if (num2 < 1) {
            return 0;
        }
        return num1 + multRecursive(num1, num2 - 1);
    }

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    public static String sayName(String name1) {
        return "Hi " + name1;
    }

    // example: sayName("Justin", "Reich") - "Hi Justin Reich"
    public static String sayName(String name1, String name2) {
        return "Hi " + name1 + " " + name2;
    }

    public static void main(String[] args) {

//        System.out.println(addition(1,2));
//        System.out.println(addition((double)3.2E12,(double)3.2E12));
//        System.out.println(subtraction(2,1));
//        System.out.println(multiplication(2,2));
//        System.out.println(division(2,0));
//        System.out.println(modulus(9,10));
//        System.out.println(multBonus(9,11));
//        System.out.println(multRecursive(9,11));
//        System.out.println(sayName("Chris"));
//        System.out.println(sayName("Chris", "Lee"));
//        System.out.println(getInteger(1, 10));

        // 2 & 3 - getting user input and factorial - starting in main

//        int userNum = getInteger(1,16);
//        System.out.println(userNum);
//        System.out.format(userNum + "!" + " (factorial) is " + factorial(userNum));

        // 4 - Dice Roll simulation

//        diceRoll(2);

        // 5 - Game Development 101 - highLow

        highLow();

    }

    // 2. Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range.

//    public static int getInteger(int min, int max) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 16: ");
//        String userInput = scanner.nextLine();
//        int userNum = Integer.parseInt(userInput);
//        if (userNum <= max && userNum > min) {
////            System.out.println("hi");
//            return userNum;
//        } else {
//            return getInteger(min, max);
//        }
//    }

    // 3. Calculate the factorial of a number.

//    public static int factorial(int inputNum) {
//
//        int answer = 1;
//        for (int i = 1; i <= inputNum; i++) {
//            answer *= i;
//        }
//        return answer;
//    }

    // 4. Create an application that simulates dice rolling.

//    public static int diceRoll(int diceSides) {
//
//        String again = "y";                                                 // set again to "y" for while loop
//        while (again.toLowerCase().equals("y")) {
//
//
//            Scanner scanner = new Scanner(System.in);                       // get user input on num sides of each die
//            System.out.print("For your pair of dice, how many sides do you want per die?: ");
//            String userInput = scanner.nextLine();
//            int dieSides = Integer.parseInt(userInput);
//
//
//            double diceRollOne = Math.floor(Math.random()*(dieSides-1+1)+1);    // calc die 1 roll
//            System.out.println("First die rolled was " + (int)diceRollOne);
//            double diceRollTwo = Math.floor(Math.random()*(dieSides-1+1)+1);    // calc die 2 roll
//            System.out.println("First die rolled was " + (int)diceRollTwo);
//            int answer = (int)diceRollOne + (int)diceRollTwo;                   // add the 2 rolls up
//            System.out.println("You rolled a " + answer);
//
//            System.out.print("Would you like to go again?(y/n): ");             // ask again to roll
//            String goAgain = scanner.nextLine();
//            again = goAgain;
//        }
//        return 0;
//
//    }

    public static String highLow() {

        String again = "y";                                                 // set "again" to "y" for while loop
        while (again.toLowerCase().equals("y")) {                           // outer while loop to operate highLow loop

            double computerRandom = Math.floor(Math.random() * (100 - 1 + 1) + 1);    // random number between 1-100
            System.out.println("Random number is " + (int) computerRandom);

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



