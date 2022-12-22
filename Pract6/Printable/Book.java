package Printable;

public class Book implements Printable{
    public String author;
    public String name;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book{ Author: " + author + ", Name: " + name + " }");
    }
}
