package Practice;

import java.lang.*;
public class TestBall {
    public static void main(String[] args){
        Ball b = new Ball();
        System.out.println(b);
        System.out.println("setX");
        b.setX(3.6);
        System.out.println("getX");
        System.out.println("Координата X: " + b.getX());
        System.out.println("setY");
        b.setY(4.8);
        System.out.println("getY");
        System.out.println("Координата Y: " + b.getY());
        b.move(-3.5,2);
        System.out.println(b);
    }
}
