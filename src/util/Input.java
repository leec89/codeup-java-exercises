package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // my code commmented out, walkthru code down below uncommented

//    public String getString() {
//        System.out.println("Enter a String: ");
//        String userInputStr = scanner.nextLine();
//        return userInputStr;
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        String userInput = scanner.nextLine();
//        return userInput;
//    }
//
//    public boolean yesNo() {
//
//        boolean answeredYes = false;
//        while (!answeredYes) {
//            System.out.println("Do you want to continue?: ");
//            String userInputBool = scanner.nextLine().toLowerCase();
//            System.out.println(userInputBool);
//            if ((userInputBool.equals("yes")) || (userInputBool.equals("y"))) {
//                System.out.println("Thanks for going again, please answer yes/no again!\n");
//            } else if ((userInputBool.equals("no")) || (userInputBool.equals("n"))) {
//                answeredYes = true;
//            } else {
//                System.out.println("Please answer yes/no.\n");
//            }
//        }
//        return answeredYes;
//    }
//
//    public int getInt(int min, int max) {
//        boolean inMinMaxRange = false;
//        int answerInt = 0;
//        while (!inMinMaxRange) {
//            System.out.println("Please enter a value to check if in the Min Max Range: ");
//            int userInputNum = scanner.nextInt();
//            if ((userInputNum >= min) && (userInputNum <= max)) {
//                System.out.println("Congratulations! Your value of " + userInputNum + " is between min: " + min + " and max: " + max + "!");
//                inMinMaxRange = true;
//                answerInt = userInputNum;
//            } else {
//                System.out.println("Sorry, your value is not within the Min Max Range. Try again!\n");
//            }
//        }
//        String message = "Hiya";
//        System.out.println(message);
//        return answerInt;
//    }
//
//    public int getInt(){
//        System.out.println("Please enter an Integer value: ");
//        int userInputNum = scanner.nextInt();
//        System.out.println("You entered " + userInputNum + " - thank you!");
//        return userInputNum;
//    }
//
//    public double getDouble(double min, double max) {
//        boolean inMinMaxRange = false;
//        double answerInt = 0;
//        while (!inMinMaxRange) {
//            System.out.println("Please enter a value to check if in the Min Max Range: ");
//            double userInputNum = scanner.nextDouble();
//            if ((userInputNum >= min) && (userInputNum <= max)) {
//                System.out.println("Congratulations! Your value of " + userInputNum + " is between min: " + min + " and max: " + max + "!");
//                inMinMaxRange = true;
//                answerInt = userInputNum;
//            } else {
//                System.out.println("Sorry, your value is not within the Min Max Range. Try again!\n");
//            }
//        }
//        String message = "Hiya double";
//        System.out.println(message);
//        return answerInt;
//    }

    public String getString(){
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo(){
        System.out.println("Yes or no? (y/n)");
        String input = scanner.next();
        return input.equalsIgnoreCase("y");
    }

    public int getInt(){
        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public void getGhost(){
        System.out.println("");
        String ghostString = scanner.nextLine();
    }

    public int getInt(int min, int max) {
        String prompt = "Enter an integer between "
                + min + " and " + max;
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        while (userInput < min || userInput > max) {
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter a number");
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        String prompt = "Enter an integer between "
                + min + " and " + max;
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        while (userInput < min || userInput > max) {
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }

}
