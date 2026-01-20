import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class FileCopyManual {

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        // Step 0: Create a dummy source file for testing (Optional)
        createDummyFile(sourceFile);

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            // 1. Open Streams
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destFile);

            System.out.println("Copying from " + sourceFile + " to " + destFile + "...");

            // 2. Read and Write Loop
            int byteData;
            // read() returns -1 when the end of the file is reached
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            System.out.println("Success: File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred.");
            e.printStackTrace();
        } finally {
            // 3. Always close streams in a finally block to prevent memory leaks
            try {
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
            } catch (IOException e) {
                System.out.println("Error closing streams.");
            }
        }
    }

    // Helper method to ensure source file exists
    public static void createDummyFile(String filename) {
        File f = new File(filename);
        if (!f.exists()) {
            try {
                FileWriter writer = new FileWriter(f);
                writer.write("This is a test file for the manual copy program.\nJava IO is powerful!");
                writer.close();
                System.out.println("Created dummy file: " + filename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}