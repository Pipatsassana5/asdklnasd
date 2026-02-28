import java.util.Scanner;

public class met3 {
    public static void main(String[] args) {
        int day, month, year;
        int[] dayMonthYear = GetDay();
        day = dayMonthYear[0];
        month = dayMonthYear[1];
        year = dayMonthYear[2];
        Util.getDayOfWeek(day, month, year);
    }

    public static int[] GetDay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of day: ");
         int day = sc.nextInt();
        System.out.println("Enter number of month: ");
         int month = sc.nextInt();
        System.out.println("Enter number of year: ");
         int year = sc.nextInt();
        sc.close();
        return new int[]{day, month, year};
    }

}
