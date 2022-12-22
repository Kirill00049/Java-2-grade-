package Practice;

import java.lang.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color = "Red";
        this.filled = false;
    };

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return (color);
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return (filled);
    }

    public void setColor(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
