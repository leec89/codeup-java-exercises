import org.w3c.dom.ls.LSOutput;

public class ServerNameGenerator {

    public static int random10 () {
        int randomInt = (int) Math.floor(Math.random() * 10);
        return randomInt;
    }

    public static String serverNameGenerator() {

        String[] bugNouns = {"gnat", "ant", "beetle", "cockroach", "fly", "cicada", "centipede", "moth", "mosquito", "dragonfly"};
        String[] bugDescriptions = {"creepy", "scary", "smelly", "frightening", "gross", "dreadful", "deadly", "revolting", "eerie", "wicked"};

        return (bugDescriptions[random10()] + "-" + bugNouns[random10()]);
    }

    public static void main(String[] args) {
        System.out.println("Here is your new server name: \n" + serverNameGenerator());
    }
}
