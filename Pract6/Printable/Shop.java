package Printable;

public class Shop implements Printable{

    public String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Shop{ Name: " + name + " }");
    }
}
