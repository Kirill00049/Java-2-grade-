package Practice;

import java.lang.*;
public class Ball {

    private double x;
    private double y;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ball(){
        x = 0.0;
        y = 0.0;
    }

    public Double getX(){
        return (x);
    }

    public void setX(double x){
        this.x = x;
        System.out.println("Координата x установлена!");
    }

    public Double getY(){
        return (y);
    }

    public void setY(double y){
        this.y = y;
        System.out.println("Координата y установлена!");
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("Координаты x и y установлены!");
    }

    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
        System.out.println("Координаты x и y изменились!");
    }

    public String toString(){
        return ("Координата x мяча: " + x + " Координата y мяча: " + y);
    }
}
