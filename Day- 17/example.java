import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleByteEncryptor {
    public static void main(String[] args) {
        String inputPath = "secret.txt";
        String outputPath = "encrypted.dat";       
        try (FileInputStream fis = new FileInputStream(inputPath);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            int data;
            System.out.println("Encrypting data byte-by-byte...");
            while ((data = fis.read()) != -1) {
                fos.write(data + 1); 
            }
            System.out.println("Encryption complete. Data stored in " + outputPath);
        } catch (IOException e) {
            System.out.println("Error: Make sure 'secret.txt' exists in your folder.");
        }
    }
}
