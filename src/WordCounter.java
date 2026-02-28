import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) {
        int wordCount = 0;

        try {
            // 1. Open the file named lyric.txt
            File file = new File("lyric.txt");
            Scanner fileScanner = new Scanner(file);

            // 2. Use next() to grab each word individually
            // hasNext() checks if there is another word separated by whitespace
           while (fileScanner.hasNext()) {
    String word = fileScanner.next();
             wordCount++;
   
}

            // 3. Close the scanner and display result
            fileScanner.close();
            System.out.println("Wordcount: " + wordCount);

        } catch (FileNotFoundException e) {
            // Error handling if lyric.txt is missing
            System.out.println("Error: Could not find file 'lyric.txt'");
        }
    }
}