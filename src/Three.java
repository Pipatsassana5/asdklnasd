
import jlab.graphics.DWindow;

public class Three {
    public static void main(String[] args) {
        DWindow w = new DWindow(400, 300);

        double x = 0, y = 100, dx = 8, dy = 0;

        w.setRepaintDuringSleep(true);
        while(true){
            x = (x + dx) % w.getWidth();
             
            dy = 3.5 * Math.sin(Math.toRadians(x *2));
            y = y + dy;
            w.fillEllipse(w.BLACK,x, y, 30, 30);
            w.fade(0.3);
            w.sleep(50);
        }
    }
}
