import jlab.graphics.DWindow;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class sixteen {
    public static void main(String[] args) throws IOException {
        // Make sure the file exists at this path, or change it to match your computer
        Scanner in = new Scanner(new File("riwords.txt"));
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        while (in.hasNext()) // หากยังไม่หมดไฟล์ก็ตรวจต่อไป
        {
            String line = in.nextLine(); // อ่านข้อมูลมาจากไฟล์หนึ่งบรรทัด
            line = line.trim();
            
            // ถ้าเป็นบรรทัดของข้อมูลก็ทำการหาอักษรที่ต้องการได้
            if (line.length() > 0 && !"#".equals(line.substring(0, 1))) 
            {
                for (int i = 0; i < line.length(); i++) // นับอักษรในบรรทัดนั้นทีละตัว
                {
                    // เอาอักษรทีละตัวออกมาตรวจโดยใช้ charAt
                    char ch = line.charAt(i);
                    
                    // ใช้ switch-case เพื่อคัดแยกและนับวรรณยุกต์
                    switch (ch) {
                        case '่': // ไม้เอก
                            c1++;
                            break;
                        case '้': // ไม้โท
                            c2++;
                            break;
                        case '๊': // ไม้ตรี
                            c3++;
                            break;
                        case '๋': // ไม้จัตวา
                            c4++;
                            break;
                    }
                }
            }
        }
        
        System.out.println(" ได้ ไม้เอก :" + c1 + " ไม้โท :" + c2 + " ไม้ตรี :" + c3 + " ไม้จัตวา :" + c4);
    }
}