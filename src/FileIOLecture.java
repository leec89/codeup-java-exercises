import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileIOLecture {
    // File - a discrete container for data on a storage device.
    // Path - the location of a file in a filesystem.

    // Relative Paths - relative to the current working directory.
    // We are most familiar with relative paths.
    // EX: Linking stylesheets or javascript files in HTML

    // <script src='/js/weather.js'></script>

    // Absolute Paths - specified from the filesystem root.
    // /Users/codeup/IdeaProjects/java-exercises/data/data.txt

    public static void main(String[] args) {
        // Path Interface - defines an object that represents a Path.
        // Paths class - contains static to obtain file path.
        // .get(String filename)
        // .get(String directory, String filename)
        // .get(String parentDirectory, String childDirectory, String filename)
        // all get methods return a Path object.

        String directory = "data";
        String filename = "info.txt";

        /* ------CREATING FILES------ */
        try {
            Path dataDirectory = Paths.get(directory); // Using static method to get filepath for directory.
            Path dataFile = Paths.get(directory, filename); // Using static method to get filepath within directory stated above.

            // Files class - contains static methods to manipulate files.
            // Files.exists() - returns boolean
            // Files.notExists() - returns boolean

            // Create a directory if it does not exist.
            if(Files.notExists(dataDirectory)) {
                System.out.println("Creating new directory named: " + dataDirectory);
                // Files.createDirectories(Path path) - returns a Path
                Files.createDirectories(dataDirectory); // accepts a Path object
            }
            // Create a file based on the path of the file.
            if(!Files.exists(dataFile)) {
                System.out.println("Your new file has been created!");
                // Files.createFile(Path path) - returns a Path
                Files.createFile(dataFile);
            }

            System.out.print("Please enter First Name: ");              // Ask first name
            Scanner scannerFirstName = new Scanner(System.in);
            String firstName = scannerFirstName.next();
            System.out.print("Please enter Last Name: ");               // Ask last name
            Scanner scannerLastName = new Scanner(System.in);
            String lastName = scannerLastName.next();
            System.out.print("Please enter Phone Number: ");            // Ask phone number
            Scanner scannerPhoneNumber = new Scanner(System.in);
            String phoneNumber = scannerPhoneNumber.next();
            String contactLine = firstName + " " + lastName + " " + phoneNumber;
            System.out.println(contactLine);


            List<String> dataText = new ArrayList<>();
//            dataText.add("Athena");
//            dataText.add("Medusa");
//            dataText.add("Hades");
//            dataText.add("Aphrodite");
//            dataText.add("Artemis");
//            dataText.add("Ares");
//            dataText.add("Zeus");
//            dataText.add(contactLine);
            // Write to the file with the list of Greek names.
            if(Files.exists(dataFile)) {
                // Files.write(Path path, List<> data)
                System.out.println("Writing to info.txt file!");
                Files.write(dataFile, dataText);
                // Add a new name to the file.
                Files.write(dataFile, Arrays.asList(contactLine), StandardOpenOption.APPEND);

                System.out.println(dataText);
            }
        } catch(IOException iox) {
            iox.printStackTrace();
        }


        /* OUTPUTTING FILE DATA TO CONSOLE */
        try {
            // Create a list of strings that represent the file data.
            List<String> fileData = Files.readAllLines(Paths.get("data", "info.txt"));
            System.out.println(fileData);

            // New list to dump appropriate data.
            List<String> newList = new ArrayList<>();

            for (String god : fileData) {
                if(god.equals("Deimos")) {
                    continue;
                }
                newList.add(god);
            }
            // Overwrite file with updated contents
            Files.write(Paths.get("data", "info.txt"), newList);
            // Re-assign list to updated file contents.
            fileData = Files.readAllLines(Paths.get("data", "info.txt"));
            // Print out each line in the info.txt file
            for (String line: fileData) {
                System.out.println(line);
            }

        } catch( IOException iox) {
            iox.printStackTrace();
        }


    }
}