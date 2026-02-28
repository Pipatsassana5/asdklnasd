import java.util.*;

public class text1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a ISBN number 9 digit : ");
        String isbn9 = scanner.nextLine();
        if (isbn9.length() != 9) {
            System.out.println("Error: Please enter exactly 9 digits.");
            scanner.close();
            return;
        }

        int totalSum = 0;

        for (int k = 1; k <= 9; k++) {
            // Get digit at index k-1 (since Java strings are 0-indexed)
            int digit = Character.getNumericValue(isbn9.charAt(k - 1));
            System.out.println(digit);
            // Apply part of the formula: k * dk
            totalSum += (k * digit);
        }

        // 3. Apply modulo 11
        int d10 = totalSum % 11;

        // 4. Display result
        System.out.println("right = " + d10);

        scanner.close();
    }
}