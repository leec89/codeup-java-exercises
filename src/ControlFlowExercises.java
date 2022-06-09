import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        // 1a - Loop Basics - While
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf(i + " ");
//            i++;
//        }
//        System.out.println();

        // 1b - Loop Basics - Do While
//        i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        i = 2;
//        int hold;
//        do {
//            hold = i;
//            System.out.println(i);
//            i = i*i;
//        } while (i <= 10000);

        // 2. FizzBuzz problem

//        for(int i = 0; i <= 100; i += 1) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // 3. Display a table of powers

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        String limit = scanner.nextLine();                              // user input is the limit - string
        int limitNum = Integer.parseInt(limit);                         // turn limit into a number
        System.out.println();                                           // line return for spacing
        System.out.println("Here is your table");                       // begin table header info
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= limitNum; i++) {                           // for loop to print out table body
            int number = i;
            int squared = i * i;
            int cubed = i * i * i;
        System.out.format("%-6d | %-7d | %-5d%n", number, squared, cubed);  // This took the longest to develop
        }

        // 4. Convert given number grades into letter grades.

//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("What is the grade to be evaluated? %n");
//        String grade = scanner.nextLine();
//        int gradeNum = Integer.parseInt(grade);
//        System.out.printf("Do you want to continue y/n? %n");
//        String answer = scanner.next();
//        boolean confirmation = answer.equals("y");
//        do {
//            if (confirmation) {
//                System.out.println("Great");
//            }
//            if(gradeNum < 0 || gradeNum > 100) {
//                System.out.println("Invalid score");
//            }
//            switch(gradeNum > 0 && gradeNum < 100) {
//
//                case (gradeNum <= 100 || gradeNum >= 88):
//                    System.out.println("A");
//
//                case (gradeNum <= 87 || gradeNum >= 80):
//                    System.out.println("B");
//
//                case (gradeNum <= 79 || gradeNum >= 67):
//                    System.out.println("C");
//
//                case (gradeNum <= 66 || gradeNum >= 60):
//                    System.out.println("D");
//
//                case (gradeNum <= 59 || gradeNum >= 0):
//                    System.out.println("F");
//            }
//            System.out.printf("Do you want to continue y/n? %n");
//            String answer = scanner.next();
//            boolean confirmation = answer.equals("y");
//
//        } while (confirmation);

    }
}
