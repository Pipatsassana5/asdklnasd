import jlab.graphics.DWindow;

public class Four {
    public static void main(String[] args) {
       DWindow w = new DWindow(400, 400);

        double x = 200, y = 200, v=6.2;
        
        w.setRepaintDuringSleep(true);
        while(true){
            double xm = w.getMouse().getX();
            double ym = w.getMouse().getY();
            double distance = Math.sqrt(Math.pow(xm - x, 2) + Math.pow(ym - y, 2));
            x = x + (v * (xm - x)) / distance;
            y = y + (v * (ym - y)) / distance;
            w.fillEllipse(w.BLACK,x, y, 30, 30);
            w.fade(0.3);
            w.sleep(100);
        }
    }
    
}
