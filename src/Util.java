public class Util {
    
    public static String int2text(int num) {
        if (num == 0) return "zero";
        if (num < 0) return "minus " + int2text(-num);
        
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] thousands = {"", "thousand"};
        
        StringBuilder sb = new StringBuilder();
        
        if (num >= 1000) {
            sb.append(units[num / 1000]).append(" ").append(thousands[1]).append(" ");
            num %= 1000;
        }
        
        if (num >= 100) {
            sb.append(units[num / 100]).append(" hundred ");
            num %= 100;
        }
        
        if (num >= 20) {
            sb.append(tens[num / 10]).append(" ");
            num %= 10;
        } else if (num >= 10) {
            sb.append(teens[num - 10]).append(" ");
            return sb.toString().trim();
        }
        
        if (num > 0) {
            sb.append(units[num]).append(" ");
        }
        
        return sb.toString().trim();
    }
    
    public static void getDayOfWeek(int day, int month, int year) {
        // Simple implementation of Zeller's Congruence algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("The day of the week is: " + days[h]);
    }
}
