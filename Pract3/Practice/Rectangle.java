package Practice;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        this.filled = true;
        this.color = "Red";
        width = 3.0;
        length = 4.0;
    }
    public Rectangle(double width, double length){
        this.filled = true;
        this.color = "Red";
        width = 3.0;
        length = 4.0;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "Practice.Shape: Practice.Rectangle, width: " + this.width + ", length:" + this.length + ", color: " + this.color + ", filled: " + this.filled;
    }
}
