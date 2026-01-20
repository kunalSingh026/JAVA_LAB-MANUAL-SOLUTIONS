import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStats {
    public static void main(String[] args) {
        String filename ="sample_text.txt";
        createSampleFile(filename);

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            System.out.println("Reading file: " + filename + "...\n");

            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;
                charCount += line.length();
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
            fileScanner.close();
            System.out.println("--- File Statistics ---");
            System.out.println("Total Lines:      " + lineCount);
            System.out.println("Total Words:      " + wordCount);
            System.out.println("Total Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("An error occured while reading the file.");
            e.printStackTrace();
        }
    }
    public static void createSampleFile(String name) {
        try {
            File f = new File(name);
            if (f.createNewFile()) {
                FileWriter writer = new FileWriter(name);
                writer.write("Java is fun.\nLearning file handling is useful.\nGood luck!");
                writer.close();
                System.out.println("Created sample file: " + name);
            }
        } catch (IOException e) {
            System.out.println("Could not create sample file.");
        }
    }
}
