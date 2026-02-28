
import jlab.graphics.DWindow;
import java.util.Scanner;

public class ifelse3 {
    
    public static void main(String[] args) {
       

        double width = 400, heigh = 400;
        DWindow w = new DWindow(width, heigh);
        double xc = 200, yc = 200, r = 25;
        double dx = 4, dy = 2;
        w.setRepaintDuringSleep(true);

        while (true) {
            // --- ขอบเขตหน้าต่างเดิม ---
            if ((xc + r) >= width) { dx = -dx; xc = width - r; }
            if ((xc - r) <= 0) { dx = -dx; xc = r; }
            if ((yc - r) <= 0) { dy = -dy; yc = r; }
            if ((yc + r) >= heigh) { dy = -dy; yc = heigh - r; }

            // --- ส่วนที่เพิ่มเข้ามา: เช็คการชนกับเมาส์ ---
            double mx = w.getMouse().getX();
            double my = w.getMouse().getY();

            // คำนวณระยะห่างระหว่างจุดกลางบอลกับเมาส์ (ทฤษฎีบทพีทาโกรัส)
            double distance = Math.sqrt(Math.pow(xc - mx, 2) + Math.pow(yc - my, 2));

            if (distance <= r) {
                // เด้งกลับทิศทาง
                dx = -dx;
                dy = -dy;

                // แก้ไขปัญหาลูกบอลติดที่เมาส์ (Push out)
                // ขยับลูกบอลออกไปในทิศทางใหม่ทันที 2 step เพื่อให้พ้นระยะเมาส์
                xc = xc + (dx * 2);
                yc = yc + (dy * 2);
            }

            // --- การเคลื่อนที่และวาดภาพ ---
            xc = (xc + dx); // นำเอา % ออกเพื่อให้การเด้งขอบทำงานได้แม่นยำขึ้น
            yc = (yc + dy);
            
            w.fillEllipse(w.BLACK, xc, yc, r * 2, r * 2);
            w.sleep(50);
            w.clearBackground();
      
}
    }
}
