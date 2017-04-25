import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by LheaJLove on 4/24/2017.
 */
public class CivilizationsApp {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice;
        String fileString = "civilizations.txt";
        CreateFile(fileString);

        System.out.println("Welcome to Lhea's Ancient Civilizations Application!");
        System.out.println(" ");

        System.out.println("Would you like to: ");
        System.out.println("1. See the complete list of civilizations.");
        System.out.println("2. Add an ancient civilization to this list.");

        choice = scan.nextInt();
        scan.nextLine();
do{
        switch (choice){
            case 1:
                CivilizationsTextFile.ReadCivFile();
                break;
            case 2:
                CivilizationsTextFile.WriteCivToFile(scan);
                break;
        }

    System.out.println(" ");
        System.out.println("Would you like to: ");
        System.out.println("1. See the complete list of civilizations.");
        System.out.println("2. Add an ancient civilization to this list.");
        System.out.println("3. Exit");
        choice = scan.nextInt();
        scan.nextLine();
    }while (!(choice == 3));
            System.out.println("Buh-bye!");

    }

    public static void CreateFile(String fileString) {
        Path filePath = Paths.get(fileString);
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}