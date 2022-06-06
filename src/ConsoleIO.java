import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.printf("You entered: --> \"" + userInput + "\" <--");
    }
}
