import java.io.*;
import java.util.Date;

public class FileLogger {
    public static void main(String[] args) {
        File logFile = new File("app_log.txt");
        // CHECKING PROPERTIES (File class) ---
        System.out.println("Checking file metadata...");
        if (logFile.exists()) {
            System.out.println("Absolute Path: " + logFile.getAbsolutePath());
            System.out.println("Current Size: " + logFile.length() + " bytes");
        }
        //WRITING/APPENDING (FileWriter & BufferedWriter) ---
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            String timestamp = new Date().toString();
            writer.write("[" + timestamp + "] - System started successfully.");
            writer.newLine();
            System.out.println("Log entry added.");
        } catch (IOException e) {
            System.err.println("Error writing log: " + e.getMessage());
        }
        System.out.println("-----------------------------------");
        //READING (FileReader & BufferedReader) ---
        System.out.println("Retrieving last logs:");
        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(++lineCount + ": " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No log file found yet.");
        } catch (IOException e) {
            System.err.println("Error reading log: " + e.getMessage());
        }
    }
}
