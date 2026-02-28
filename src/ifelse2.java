import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        float num1 = scanner.nextFloat();
        System.out.println("Second number: ");
        float num2 = scanner.nextFloat();
        System.out.println("Third number: ");
        float num3 = scanner.nextFloat();
        float sum = num1 + num2 + num3;
        System.out.println("Sum = " + sum);
        if(num1 < num2 && num1 < num3){
            sum -= num1;
         
        } else if(num2 < num1 && num2 < num3){
            sum -= num2;
         
        } else {
            sum -= num3;
            
        }
        System.out.printf("COST = %.1f%n", sum);
           
        scanner.close();
}
}
