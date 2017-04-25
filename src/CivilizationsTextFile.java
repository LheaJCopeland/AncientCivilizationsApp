import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by LheaJLove on 4/24/2017.
 */
public class CivilizationsTextFile {

    public static void ReadCivFile() {
        Path civPath2 = Paths.get("civilizations.txt");
        File civFile2 = civPath2.toFile();
        try {
            FileReader reader = new FileReader(civFile2);
            BufferedReader buff = new BufferedReader(reader);
            try {
                String line = buff.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = buff.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void WriteCivToFile(Scanner s) {
        System.out.println("Please enter a civilization: ");
        String civilization = s.nextLine();
        System.out.println("Please enter a year for this civilization: ");
        String year = s.nextLine();
        System.out.println("Please enter a Wonder of the World that this civilization was known for: ");
        String wonder = s.nextLine();

        Civilization civ = new Civilization (civilization, year, wonder);

        Path civPath = Paths.get("civilizations.txt");
        File civFile = civPath.toFile();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(civFile, true));
            out.println(civ);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}