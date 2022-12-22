package Printable;

public class TestPrintable {
    public static void main(String[] args) {
    Book fb = new Book("superhero", "Michal");
    Book sb = new Book("OneHit", "Michal");
    Book tb = new Book("Roses", "Lebs");
    Shop fs = new Shop("Cats");
    Shop ss = new Shop("Milks");
    Printable[] pr = {fb, sb, tb, fs, ss};
    for (int i = 0; i < pr.length; i++) {
        pr[i].print();
    }
    }
}
