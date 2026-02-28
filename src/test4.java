import jlab.graphics.DWindow;

public class test4 {
    public static void main(String[] args) {
        DWindow w = new DWindow(400, 400);
        double xe1 = 100, xe2 = 300, ye1= 200, ye2 = 200;
        double xp1 = xe1, yp1 = ye1, xp2 = xe2, yp2 = ye2;
        double lx =0,ly = 0,sx = 0,sy = 0,lx2 = 0,ly2 = 0,sx2 = 0,sy2 = 0;
        double angle1, angle2;
        double eye_len = 38;
        
        

        w.setRepaintDuringSleep(true);

        while(true){

            
            double xm = w.getMouse().getX();
            double ym = w.getMouse().getY();
            if (xm > xe2){
                angle1 = Math.atan2(ym - ye1, xm - xe1) ;
                
            xp1 = xe1 + eye_len * Math.cos(angle1);
            yp1 = ye1 + eye_len * Math.sin(angle1);

                 
            xp2 = xe2 + eye_len * Math.cos(angle1);
            yp2 = ye2 + eye_len * Math.sin(angle1);
           // Initialize eyebrow variables
        lx = 50; lx2 = 250;
        ly = 100; ly2 = 80;
        sx = 150; sx2 = 350;
        sy = 80; sy2 = 100;
            
           
            }else if (xm < xe1){
                angle2 = Math.atan2(ym - ye2, xm - xe2) ;
                xp1 = xe1 + eye_len * Math.cos(angle2);
                yp1 = ye1 + eye_len * Math.sin(angle2);
                xp2 = xe2 + eye_len * Math.cos(angle2);
                yp2 = ye2 + eye_len * Math.sin(angle2);
                 // Initialize eyebrow variables
        lx = 50;
        ly = 100;
        sx = 150;
        sy = 80;
        lx2 = 250;
        ly2 = 80;
        sx2 = 350;
        sy2 = 100;
            
            }else{
                angle1 = Math.atan2(ym - ye1, xm - xe1) ;
                angle2 = Math.atan2(ym - ye2, xm - xe2) ;
                xp1 = xe1 + eye_len * Math.cos(angle1);
                yp1 = ye1 + eye_len * Math.sin(angle1);
                xp2 = xe2 + eye_len * Math.cos(angle2);
                yp2 = ye2 + eye_len * Math.sin(angle2);
                 // Initialize eyebrow variables
        lx = 50;
        ly = 80;
        sx = 150;
        sy = 100;
        lx2 = 250;
        ly2 = 100;
        sx2 = 350;
        sy2 = 80;
            
            }
            w.clearBackground();

            
            w.fillEllipse(w.BLUE, xe1, ye1, 100, 100);
            w.fillEllipse(w.BLACK, xp1, yp1, 38, 38);

            w.fillEllipse(w.BLUE, xe2, ye2, 100, 100);
            w.fillEllipse(w.BLACK, xp2, yp2, 38, 38);

            w.drawLine(lx, ly, sx, sy);
            w.drawLine(lx2, ly2, sx2, sy2);
           
            w.sleep(100);
            

        }
    }
}
