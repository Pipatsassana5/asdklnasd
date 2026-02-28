import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Third number: ");
        int num3 = scanner.nextInt();
        if(num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("equal number = " + (num1 == num2 ? num1 : (num1 == num3 ? num1 : num2)));
    }else{
            System.out.println("No equal numbers");
        }
        scanner.close();
}
}
