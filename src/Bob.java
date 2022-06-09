import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        String bobSure = "Sure.";
        String bobWhoa = "Whoa, chill out!";
        String bobFine = "Fine. Be that way!";
        String bobEvah = "Whatever.";
        String bobStop = "stop";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey there, I've been a castaway and so I'm dying to talk to someone, can we talk?");
        String response = scanner.nextLine();
        while (!response.equals(bobStop)) {
            System.out.println(response);
            Scanner reply = new Scanner(System.in);

    }
}
