
import jlab.graphics.DWindow;

public class test2 {
    public static void main(String[] args) {
        System.out.println("THIS IS TEST NUMBER : 2");
        System.out.println("NAME : PIPAT SASSANA");
        System.out.println("  ID : 68015138");
    DWindow w = new DWindow(300, 500);

     double x = 150, y = 0, dx = 0, dy = 8;

        w.setRepaintDuringSleep(true);

        while(true){
            dx = 83.5 * Math.sin(Math.toRadians(y*2.0));
            x =  150 +  dx ; 
            y = (y + dy) % w.getHeight();  
            
            
            w.fillEllipse(w.BLACK,x, y, 38, 38);
            w.fade(0.3);
            w.sleep(50);
    
    }
}
    
}
