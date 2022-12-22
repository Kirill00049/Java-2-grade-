package Lab2;

public class BookTest {
    public static void main(String[] args) {
        Book bk = new Book();
        System.out.println(bk);
        bk.setAuthor("Igor");
        System.out.println("getAuthor");
        System.out.println(bk.getAuthor());
        bk.setBookName("Smile");
        System.out.println("getBookName");
        System.out.println(bk.getBookName());
        bk.setYearBornBook(1856);
        System.out.println("getYearBornBook");
        System.out.println(bk.getYearBornBook());
        bk.setYearBornAuthor(1820);
        System.out.println("getYearBornAuthor");
        System.out.println(bk.getYearBornAuthor());

    }
}
