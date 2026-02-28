import jlab.graphics.DWindow;

public class ifelse4 {
    public static void main(String[] args) {
        DWindow w = new DWindow(300, 300);
        double xe1 = 110, xe2 = 180, ye1= 100, ye2 = 100;
        double xp1 = xe1, yp1 = ye1, xp2 = xe2, yp2 = ye2;
        double angle1, angle2;
        double eye_len = 15;
        double x = 200, y = 200, v=6.2;

        

        w.setRepaintDuringSleep(true);

        while(true){

            
            double xm = w.getMouse().getX();
            double ym = w.getMouse().getY();
             
            double distance = Math.sqrt(Math.pow(xm - x, 2) + Math.pow(ym - y, 2));
            x = x + (v * (xm - x)) / distance;
            y = y + (v * (ym - y)) / distance;
            
            if (x > xe2){
                angle1 = Math.atan2(y - ye1, x - xe1) ;
                
            xp1 = xe1 + eye_len * Math.cos(angle1);
            yp1 = ye1 + eye_len * Math.sin(angle1);

                 
            xp2 = xe2 + eye_len * Math.cos(angle1);
            yp2 = ye2 + eye_len * Math.sin(angle1);
            }else if (x < xe1){
                angle2 = Math.atan2(y - ye2, x - xe2) ;
                xp1 = xe1 + eye_len * Math.cos(angle2);
                yp1 = ye1 + eye_len * Math.sin(angle2);
                xp2 = xe2 + eye_len * Math.cos(angle2);
                yp2 = ye2 + eye_len * Math.sin(angle2);
            }else{
                angle1 = Math.atan2(y - ye1, x - xe1) ;
                angle2 = Math.atan2(y - ye2, x - xe2) ;
                xp1 = xe1 + eye_len * Math.cos(angle1);
                yp1 = ye1 + eye_len * Math.sin(angle1);
                xp2 = xe2 + eye_len * Math.cos(angle2);
                yp2 = ye2 + eye_len * Math.sin(angle2);
            }
            w.clearBackground();
            w.fillEllipse(w.BLUE, xe1, ye1, 50, 50);
            w.fillEllipse(w.BLACK, xp1, yp1, 20, 20);

            w.fillEllipse(w.BLUE, xe2, ye2, 50, 50);
            w.fillEllipse(w.BLACK, xp2, yp2, 20, 20);
            w.fillEllipse(w.BLACK,x, y, 30, 30);
            
            

            w.sleep(100);
            

        }
    }
}
