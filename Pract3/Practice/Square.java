package Practice;

public class Square extends Rectangle{
    protected double side;
    public Square(){
        this.filled = true;
        this.color = "Red";
        side = 5;
    }
    public Square(double side){
        this.filled = true;
        this.color = "Red";
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
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
        return "Practice.Shape: Practice.Square, side: " + this.side + ", color: " + this.color + ", filled: " + this.filled;
    }
}
