
import jlab.graphics.DWindow;

public class met1 {
    public static void main(String[] args) {
        DWindow w = new DWindow(200, 200);
        
        Gen_Poly(w, 50, 100, 50, 0, 4);

        Gen_Poly(w, 100, 100, 50, 90, 5);

        Gen_Poly(w, 150, 100, 50, 90, 3);

    }

    public static void Gen_Poly(DWindow w, int xc, int yc, int len, int angle, int n) {
        double startRad = Math.toRadians(angle);

        double r = len / (2.0 * Math.sin(Math.PI / n));

        for (int i = 0; i < n; i++) {
        // Calculate the angle for the current vertex (i) and the next vertex (i+1)
        double theta1 = startRad + (2 * Math.PI * i) / n;
        double theta2 = startRad + (2 * Math.PI * (i + 1)) / n;

        // Calculate (x, y) for the start of the line segment
        int x1 = (int) (xc + r * Math.cos(theta1));
        int y1 = (int) (yc - r * Math.sin(theta1));

        // Calculate (x, y) for the end of the line segment
        int x2 = (int) (xc + r * Math.cos(theta2));
        int y2 = (int) (yc - r * Math.sin(theta2));

        // Draw the line
        w.drawLine(x1, y1, x2, y2);
    }
    }
   /*  public static int[] getPolygonDetails() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of sides: ");
    int n = sc.nextInt();

    System.out.print("Enter the length of each side: ");
    int len = sc.nextInt();

    System.out.print("Enter the angle of rotation: ");
    int angle = sc.nextInt();
    
    sc.close();
    // Returns an array where index 0 is n, 1 is len, 2 is angle
    return new int[]{n, len, angle}; 
}*/
    
}
