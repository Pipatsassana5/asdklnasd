import java.util.*;

public class text2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Receive a line of text
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        // 2. Split the string into an array of words
        // "\\s+" matches one or more spaces
        String[] words = input.split("\\s+");
        // 3. Print each word formatted with quotes
        for (int i = 0; i < words.length; i++) {
            // Print the word wrapped in escaped quotes: \"word\"
            System.out.print("\"" + words[i] + "\"");

           
            if (i < words.length - 1) {
                System.out.print(" ");
            }
        }
        
     
        System.out.println();

        scanner.close();
    }
}