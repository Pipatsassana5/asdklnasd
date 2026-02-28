import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileWordReplacer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        try {
            // 1. Get replacement words from user
            System.out.print("replacement word in file = ");
            String newWord = console.next();
            System.out.print("word to be replaced in file = ");
            String targetWord = console.next();

            // 2. Setup File Input and Output
            File inputFile = new File("dat_pdd.txt");
            Scanner fileScanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter("dat_new.txt");

            // 3. Read word by word and replace
            while (fileScanner.hasNext()) {
                String currentWord = fileScanner.next();

                // Check if current word matches target (ignoring case)
                if (currentWord.equalsIgnoreCase(targetWord)) {
                    writer.print(newWord + " ");
                } else {
                    writer.print(currentWord + " ");
                }
            }

            // 4. Close resources
            fileScanner.close();
            writer.close();
            System.out.println("\nSuccessfully created dat_new.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find 'dat_pdd.txt'");
        } finally {
            console.close();
        }
    }
}