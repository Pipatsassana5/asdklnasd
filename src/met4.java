import java.util.Scanner;
public class met4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The number is: " + num);
        sc.close();
        String text = Util.int2text(num);
        System.out.println("The number in text is: " + text);
    }

}
