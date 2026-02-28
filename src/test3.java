import jlab.graphics.DWindow;

public class test3 {
    public static void main(String[] args) {
        System.out.println("THIS IS TEST NUMBER : 3");
        System.out.println("NAME : PIPAT SASSANA");
        System.out.println(" ID : 68015138");

        DWindow w = new DWindow(200, 200);

        // จุดกึ่งกลางของหน้าจอ (Center)
        double cx = 100;
        double cy = 100;

        // ขนาดครึ่งหนึ่งของสี่เหลี่ยมเริ่มต้น (จาก 10 ถึง 190 คือกว้าง 180, ครึ่งหนึ่งคือ 90)
        double halfSize = 90; 
        
        // องศาเริ่มต้น
        double angleDeg = 0; 

        // Loop 20 ครั้ง
        for (int i = 0; i < 20; i++) {
            
            // แปลงองศาเป็นเรเดียน เพื่อใช้คำนวณ Math.cos และ Math.sin
            double angleRad = Math.toRadians(angleDeg);
            double cosA = Math.cos(angleRad);
            double sinA = Math.sin(angleRad);

            // คำนวณพิกัดมุมทั้ง 4 ของสี่เหลี่ยม โดยอิงจากจุดกึ่งกลาง (cx, cy)
            // สูตรการหมุน: 
            // x' = x*cos - y*sin
            // y' = x*sin + y*cos
            
            // มุมที่ 1 (บน-ซ้าย เดิมคือ -halfSize, -halfSize)
            double x1 = cx + (-halfSize * cosA - -halfSize * sinA);
            double y1 = cy + (-halfSize * sinA + -halfSize * cosA);

            // มุมที่ 2 (บน-ขวา เดิมคือ halfSize, -halfSize)
            double x2 = cx + (halfSize * cosA - -halfSize * sinA);
            double y2 = cy + (halfSize * sinA + -halfSize * cosA);

            // มุมที่ 3 (ล่าง-ขวา เดิมคือ halfSize, halfSize)
            double x3 = cx + (halfSize * cosA - halfSize * sinA);
            double y3 = cy + (halfSize * sinA + halfSize * cosA);

            // มุมที่ 4 (ล่าง-ซ้าย เดิมคือ -halfSize, halfSize)
            double x4 = cx + (-halfSize * cosA - halfSize * sinA);
            double y4 = cy + (-halfSize * sinA + halfSize * cosA);

            // วาดเส้นเชื่อมจุดทั้ง 4
            w.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
            w.drawLine((int)x2, (int)y2, (int)x3, (int)y3);
            w.drawLine((int)x3, (int)y3, (int)x4, (int)y4);
            w.drawLine((int)x4, (int)y4, (int)x1, (int)y1);

            // ปรับค่าสำหรับการวนรอบถัดไป
            halfSize = halfSize * 0.8; // ขนาดเล็กลง 20% (เหลือ 80%)
            angleDeg = angleDeg + 5;   // เอียงเพิ่ม 5 องศา
        }
    }
}