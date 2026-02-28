import java.util.Scanner;
import jlab.graphics.DWindow;

public class Two {
    public static void main(String[] args) {
    DWindow w = new DWindow(400, 400);
    System.out.println("Draw squate with center , side and angle");
    System.out.println("Xc Yc side angle : ");
    Scanner sc = new Scanner(System.in);
    double Xc = sc.nextDouble();
    double Yc = sc.nextDouble();
    double side = sc.nextDouble();
    double angle = sc.nextDouble();
    sc.close();

    if(Xc < 0 || Xc > 400 || Yc < 0 || Yc > 400 || side <= 0){
        System.out.println("Invalid input");
        return;
    }   

    double halfSide = (side * Math.sqrt(2)) / 2;

    for(int i =0; i < 4; i++){
        double x1 = Xc + halfSide * Math.cos(Math.toRadians(angle + 45+i*90));
        double y1 = Yc - halfSide * Math.sin(Math.toRadians(angle + 45+i*90));
        double x2 = Xc + halfSide * Math.cos(Math.toRadians(angle + 45+(i+1)*90));
        double y2 = Yc - halfSide * Math.sin(Math.toRadians(angle + 45+(i+1)*90));
        w.drawLine(x1, y1, x2, y2);
        
    }
    w.drawLine(Xc, Yc, Xc + halfSide * Math.cos(Math.toRadians(angle +135)), Yc - (halfSide * Math.sin(Math.toRadians(angle + 135))));
    w.fillOval(Xc,Yc, 5, 5);
}
}
