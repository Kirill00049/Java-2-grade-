package Lab;

public abstract class Furniture{
    protected String color;
    protected String size;

    public Furniture(){
        this.color = "Red";
        this.size = "NS";
    }

    public Furniture(String color, String size){
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
