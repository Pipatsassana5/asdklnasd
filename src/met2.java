import java.util.Scanner;
import jlab.graphics.DWindow;

public class met2 {
    public static void main(String[] args) {
        DWindow window = new DWindow(200, 200);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Legth of each side:");
        int len = sc.nextInt();
        sc.close();
        Gen_Brick(window, len);
        
    }
    public static void Gen_Brick(DWindow w,int len){
        int offset = 0, col = 0, row = 0;
        int y = 0, x =  0 ;
       
         for(row = 0; row < w.getHeight(); row++) {
         double yc = row * len * 1.5 ;
            y = (int) yc;
        
        for(col = 0; col < w.getWidth(); col++) {
          double   xc = col * len* Math.sqrt(3) ;
          if((row % 2) == 0 ) xc += Math.sqrt(3) * len / 2 ;
            x = (int) xc;
            
            
          met1.Gen_Poly(w, x + offset, y, len, 90, 6);
          
            }
        }
        
    }


}
