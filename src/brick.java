import jlab.graphics.DWindow;

public class brick {
    public static void main(String[] args) {
     DWindow w = new DWindow(400, 400);
     double offset = 0, col = 0, row = 0;
     double y = 0, x = 0 ;
     for(row = 0; row < 20; row++) {
        y = row *20.0 ;
        if((row % 2) == 0 )
           offset = 20.0 ; else offset = 0.0 ;
        for(col = 0; col < 10; col++) {
            x = col * 40.0;

          w.drawRect( x + offset , y, 40, 20);
            }
        }
    }
}
