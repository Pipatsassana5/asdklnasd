import jlab.graphics.DWindow; // Note: You might not need this line if you aren't drawing shapes in this specific file
import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) //วนรับคำอังกฤษเรื่อยๆ
        {
            System.out.print("     Input Word = ");
            String t = kb.nextLine();  //รับคำอังกฤษหนึ่งบรรทัด
            
            //ดึงสองอักษรหลังและหนึ่งอักษรหลังมาเก็บไว้เทียบ
            String s0 = t.substring(t.length() - 2, t.length()); //สองอักษรท้าย
            String s1 = t.substring(t.length() - 1, t.length()); //อักษรสุดท้าย
            
            //เทียบกรณีตัวท้ายเป็น s,x,ch
            if (("s".equalsIgnoreCase(s1)) | ("x".equalsIgnoreCase(s1)) | ("ch".equalsIgnoreCase(s0))) 
            { 
                System.out.println("     Output = " + t + "es");
            } else { //เทียบกรณีตัวท้ายเป็น y ทีตัวหน้าไม่ใช่สระ
                if (("y".equalsIgnoreCase(s1)) &&
                    !(("a".equalsIgnoreCase(t.substring(t.length() - 2, t.length() - 1))) |
                      ("e".equalsIgnoreCase(t.substring(t.length() - 2, t.length() - 1))) |
                      ("i".equalsIgnoreCase(t.substring(t.length() - 2, t.length() - 1))) |
                      ("o".equalsIgnoreCase(t.substring(t.length() - 2, t.length() - 1))) |
                      ("u".equalsIgnoreCase(t.substring(t.length() - 2, t.length() - 1))))) 
                {
                    System.out.println("     Output = " + t.substring(0, t.length() - 1) + "ies");
                } else { //หากไม่ใช่ทั้งสองกรณีให้เติม "s" ไปเลย
                    System.out.println("     Output = " + t + "s");
                }
            }
        }
    }
}