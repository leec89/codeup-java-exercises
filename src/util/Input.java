package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a String: ");
        String userInputStr = scanner.nextLine();
        return userInputStr;
    }

    public boolean yesNo() {

        boolean answeredYes = false;
        while (!answeredYes) {
            System.out.println("Do you want to continue yes/no? (y/n): ");
            String userInputBool = scanner.nextLine().toLowerCase();
            System.out.println(userInputBool);
            if ((userInputBool.equals("yes")) || (userInputBool.equals("y"))) {
                System.out.println("Thanks for going again, please answer yes/no again!\n");
            } else {
                System.out.println("Thanks for answering!\n");
                answeredYes = true;
            }
        }
        return answeredYes;
    }

    public int getInt(int min, int max) {
        boolean inMinMaxRange = false;
        int answerInt = 0;
        while (!inMinMaxRange) {
            System.out.println("Please enter a value to check if in the Min Max Range: ");
            int userInputNum = scanner.nextInt();
            if ((userInputNum >= min) && (userInputNum <= max)) {
                System.out.println("Congratulations! Your value of " + userInputNum + " is between min: " + min + " and max: " + max + "!");
                inMinMaxRange = true;
                answerInt = userInputNum;
            } else {
                System.out.println("Sorry, your value is not within the Min Max Range. Try again!\n");
            }
        }
        String message = "Hiya";
        System.out.println(message);
        return answerInt;
    }

    public int getInt(){
        System.out.println("Please enter an Integer value: ");
        int userInputNum = scanner.nextInt();
        System.out.println("You entered " + userInputNum + " - thank you!");
        return userInputNum;
    }

    public double getDouble(double min, double max) {
        boolean inMinMaxRange = false;
        double answerInt = 0;
        while (!inMinMaxRange) {
            System.out.println("Please enter a value to check if in the Min Max Range: ");
            double userInputNum = scanner.nextDouble();
            if ((userInputNum >= min) && (userInputNum <= max)) {
                System.out.println("Congratulations! Your value of " + userInputNum + " is between min: " + min + " and max: " + max + "!");
                inMinMaxRange = true;
                answerInt = userInputNum;
            } else {
                System.out.println("Sorry, your value is not within the Min Max Range. Try again!\n");
            }
        }
        String message = "Hiya double";
        System.out.println(message);
        return answerInt;
    }

}
